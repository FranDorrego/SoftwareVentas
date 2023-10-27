package clasesData;

import Entidades.VentaResumen;
import entidades.Cliente;
import entidades.DetalleVenta;
import entidades.Producto;
import entidades.Venta;
import entidades.VentaPorCliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentaData {

    private Connection con = null;
    public ProductoData productoData = new ProductoData();
    
    public VentaData() {
        con = Conexion.getConexion();
    }

    public void crearVenta(Venta venta) {

        String sql = "INSERT INTO `venta`( `ID_Cliente`, `ID_Empleado`, `Fecha`) VALUES (?,?,?) ";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, venta.getId_cliente());
            ps.setInt(2, venta.getId_empleado());
            java.sql.Date sqlDate = new java.sql.Date(venta.getFecha_venta_date().getTime());
            ps.setDate(3, sqlDate);

            ps.executeUpdate();
            ResultSet Resultado = ps.getGeneratedKeys();

            if (Resultado.next()) {
                venta.setid_venta(Resultado.getInt(1));
                agregarDetalleVenta(venta.getDetalleVenta());
                JOptionPane.showMessageDialog(null, "Cargado exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "No se cargo la venta");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente " + ex.getMessage());
        }
    }

    private void agregarDetalleVenta(ArrayList<DetalleVenta> detalleLista) {

        for (int i = 0; i < detalleLista.size(); i++) { // Lo hicimos con for comun para poder volver atras en caso de error.

            DetalleVenta detalle = detalleLista.get(i);
            String sql = "INSERT INTO `detalle_venta`( `Cantidad`, `ID_Venta`, `Precio_Venta`, `ID_Producto`) VALUES (?,?,?,?)";

            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, detalle.getCantidad());
                ps.setInt(2, detalle.getid_venta());
                ps.setDouble(3, detalle.getPrecio_venta());
                ps.setDouble(4, detalle.getid_producto());
                    
                ps.executeUpdate();
                ResultSet Resultado = ps.getGeneratedKeys();
                
                if (Resultado.next()) {
                    detalle.setid_detalle_venta(Resultado.getInt(1));
                    productoData.modificarStockProducto(detalle.getid_producto(), detalle.getCantidad());
                } else {
                    JOptionPane.showMessageDialog(null, "No se cargo la venta");
                }
                ps.close();

            } catch (SQLException ex) {
                i--; // Intentamos hasta que salga.
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente " + ex.getMessage());
            }
        }
    }

    public List<Venta> listarTodos() {

        String sql = "SELECT * FROM `venta`";
        List<Venta> ventaLista = new ArrayList();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet Resultado = ps.executeQuery();

            while (Resultado.next()) {
                Venta venta = new Venta();
                venta.setid_venta(Resultado.getInt("ID_Venta"));
                venta.setId_cliente(Resultado.getInt("ID_Cliente"));
                venta.setId_empleado(Resultado.getInt("ID_Empleado"));
                venta.setFecha_venta(Resultado.getDate("Fecha").toLocalDate());
                listarDetallesVenta(venta);
                ventaLista.add(venta);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());
        }

        return ventaLista;
    }

    private void listarDetallesVenta(Venta venta) {

        String sql = "SELECT * FROM `detalle_venta` WHERE ID_Venta = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, venta.getid_venta());

            ResultSet Resultado = ps.executeQuery();

            while (Resultado.next()) {
                DetalleVenta detalleVenta = new DetalleVenta();
                detalleVenta.setid_detalle_venta(Resultado.getInt("ID_Detalle_Venta"));
                detalleVenta.setCantidad(Resultado.getInt("Cantidad"));
                detalleVenta.setid_venta(Resultado.getInt("ID_Venta"));
                detalleVenta.setPrecio_venta(Resultado.getInt("Precio_Venta"));
                detalleVenta.setid_producto(Resultado.getInt("ID_Producto"));
                venta.anadirDetalleVenta(detalleVenta);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());
        }
    }

    public List<VentaResumen> listarVentasPorFecha(java.util.Date fechaInicio, java.util.Date fechaFinal) {

        Date inicioFecha = new Date(fechaInicio.getTime());
        Date finalFecha = new Date(fechaFinal.getTime());
        
        String sqlSelect = "SELECT sum(detalle_venta.Cantidad) as Cantidad, sum(detalle_venta.Precio_Venta) as PrecioUnidad, sum((detalle_venta.Cantidad * detalle_venta.Precio_Venta)) as PrecioTotal,concat(cliente.Nombre, ' ',cliente.Apellido) AS cliente,concat(empleado.Nombre, ' ',empleado.Apellido) AS empleado, venta.fecha as Fecha FROM venta JOIN detalle_venta ON(venta.ID_Venta = detalle_venta.ID_Venta) JOIN cliente ON(venta.ID_Cliente = cliente.ID_Cliente) JOIN cliente empleado ON(venta.ID_Empleado = empleado.ID_Cliente) ";
        String sql = sqlSelect + " WHERE venta.Fecha BETWEEN '"+inicioFecha+"' and '"+finalFecha+"' group by cliente , empleado, fecha order by fecha";
        

        List<VentaResumen> ventaLista = new ArrayList();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet Resultado = ps.executeQuery();

            while (Resultado.next()) {
                VentaResumen ventaResumen = new VentaResumen();
                ventaResumen.setCantidadProducto(Resultado.getInt("Cantidad"));
                ventaResumen.setPrecio(Resultado.getDouble("PrecioUnidad"));
                ventaResumen.setPrecioTotal(Resultado.getDouble("PrecioTotal"));
                ventaResumen.setNombreCliente(Resultado.getString("Cliente"));
                ventaResumen.setNombreEmpleado(Resultado.getString("Empleado"));
                ventaResumen.setFecha(Resultado.getDate("Fecha"));
                ventaLista.add(ventaResumen);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());
        }

        return ventaLista;
    }
    
    public List<Producto> listarProductosPorFecha(java.util.Date fechaInicio, java.util.Date fechaFinal) {

        Date inicioFecha = new Date(fechaInicio.getTime());
        Date finalFecha = new Date(fechaFinal.getTime());
        
        String sql = "SELECT producto.* FROM producto JOIN detalle_venta on detalle_venta.ID_Producto = producto.ID_Producto JOIN venta on detalle_venta.ID_Venta = venta.ID_Venta WHERE venta.Fecha BETWEEN '"+inicioFecha+"' and '"+finalFecha+"';";
        List<Producto> productoLista = new ArrayList();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet Resultado = ps.executeQuery();

            while (Resultado.next()) {
                Producto producto = new Producto();
                producto.setid_producto(Resultado.getInt("ID_Producto"));
                producto.setNombre(Resultado.getString("Nombre"));
                producto.setDescripcion(Resultado.getString("Descripcion"));
                producto.setPrecio_actual(Resultado.getDouble("Precio_Actual"));
                producto.setStock(Resultado.getInt("Stock"));
                producto.setEstado(Resultado.getBoolean("Estado"));
                producto.setStock_seguridad(Resultado.getInt("Stock_Seguridad"));
                producto.setid_rubro(Resultado.getInt("ID_Rubro"));
                producto.setid_cliente(Resultado.getInt("ID_Cliente"));
                
                productoLista.add(producto);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());
        }

        return productoLista;
    }
    
    
    //Modifiqué este método para poder traer los datos que elegí. Basicamente seguí los mismos paso que hicieron con listarVentasPorFecha
    public List<VentaPorCliente> listarVentasPorCliente(int ID_Cliente) { //le cambie el tipo de lista

        String sql = "SELECT venta.ID_Venta, venta.ID_Cliente, (SELECT cliente.Nombre FROM cliente WHERE cliente.ID_Cliente = venta.ID_Cliente) "
                + " AS nombreCliente, venta.ID_Empleado, (SELECT cliente.Nombre FROM cliente WHERE cliente.ID_Cliente = venta.ID_Empleado) "
                + " AS nombreEmpleado, venta.Fecha FROM venta WHERE venta.ID_Cliente = " + ID_Cliente;
        
        List<VentaPorCliente> listaVentas= new ArrayList();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            
            while(resultado.next()){
                VentaPorCliente ventaxcliente = new VentaPorCliente();
                ventaxcliente.setIdVenta(resultado.getInt("ID_Venta"));
                ventaxcliente.setIdCliente(resultado.getInt("ID_Cliente"));
                ventaxcliente.setNombreCliente(resultado.getString("nombreCliente"));
                ventaxcliente.setIdEmpleado(resultado.getInt("ID_Empleado"));
                ventaxcliente.setNombreEmpleado(resultado.getString("NombreEmpleado"));
                ventaxcliente.setFecha(resultado.getDate("Fecha"));
                listaVentas.add(ventaxcliente);
            }
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder info ventas por cliente");
        }
        return listaVentas;
        
//         String sql = "SELECT * FROM `venta` WHERE ID_Cliente = ? ";
//        List<Venta> ventaLista = new ArrayList();
//        
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, ID_Cliente);
//            ResultSet Resultado = ps.executeQuery();
//
//            while (Resultado.next()) {
//                Venta venta = new Venta();
//                venta.setid_venta(Resultado.getInt("ID_Venta"));
//                venta.setId_cliente(Resultado.getInt("ID_Cliente"));
//                venta.setId_empleado(Resultado.getInt("ID_Empleado"));
//                venta.setFecha_venta(Resultado.getDate("Fecha").toLocalDate());
//                listarDetallesVenta(venta);
//                ventaLista.add(venta);
//            }
//
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());
//        }
//
//        return ventaLista;
    }
    
    public List<Cliente> listarClientePorProducto(int ID_Producto) {
        
        String sql = "SELECT cliente.ID_Cliente,cliente.Estado, cliente.Apellido,cliente.Nombre,cliente.Domicilio,cliente.Telefono,cliente.Numero_Identificacion,cliente.Es_Empleado FROM cliente JOIN venta ON(venta.ID_Cliente = cliente.ID_Cliente) JOIN detalle_venta ON(detalle_venta.ID_Venta = venta.ID_Venta) WHERE detalle_venta.ID_Producto = ? GROUP BY ID_Cliente";
        
        List<Cliente> clienteLista = new ArrayList();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Producto);
            ResultSet Resultado = ps.executeQuery();

            while (Resultado.next()) {
                Cliente cliente = new Cliente();
                cliente.setID_cliente(Resultado.getInt("ID_Cliente"));
                cliente.setApellido(Resultado.getString("Apellido"));
                cliente.setNombre(Resultado.getString("Nombre"));
                cliente.setDomicilio(Resultado.getString("Domicilio"));
                cliente.setTelefono(Resultado.getString("Telefono"));
                cliente.setNumero_identificacion(Resultado.getString("Numero_Identificacion"));
                cliente.setEstado(Resultado.getBoolean("Estado"));
                cliente.setEs_empleado(Resultado.getBoolean("Es_Empleado"));               
          
                clienteLista.add(cliente);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());
        }

        return clienteLista;
    }
  
}
