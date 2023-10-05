
package clasesData;

import entidades.Producto;
import entidades.Rubro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProductoData {
    
    private Connection con = null;

    public ProductoData() {
        con = Conexion.getConexion();
    }
    
    public void agregarProducto( Producto producto ){
        
        String sql = "INSERT INTO `producto`(`Nombre`, `Descripcion`, `Precio_Actual`, `Stock`, `Estado`, `Stock_Seguridad`, `ID_Rubro`, `ID_Cliente`) \n" +
"                   VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecio_actual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getStock_seguridad());
            ps.setInt(7, producto.getid_rubro());
            ps.setInt(8, producto.getid_cliente());

            ps.executeUpdate();
            ResultSet Resultado = ps.getGeneratedKeys();
            
            if (Resultado.next()) {
                producto.setid_cliente(Resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto Cargado Exitosamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Productos" + ex.getMessage());
        }
    }
    
    public void modificarProducto( Producto producto ){
        
        String sql = "UPDATE `producto` SET ,`Nombre`=?,`Descripcion`=?,`Precio_Actual`=?,`Stock`=?,`Estado`=?,`Stock_Seguridad`=?,`ID_Rubro`=?,`ID_Cliente`=? " +
                    "WHERE `ID_Producto`=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecio_actual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getStock_seguridad());
            ps.setInt(7, producto.getid_rubro());
            ps.setInt(8, producto.getid_cliente());
            
            ps.setInt(9, producto.getid_rubro());
           
            int Resultado = ps.executeUpdate();
            
            if (Resultado == 1) {
                JOptionPane.showMessageDialog(null, "Producto Modificado Exitosamente");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Productos" + ex.getMessage());
        }
    }
    
    public void eliminarProducto( int id ){
        
        String sql = "UPDATE `producto` SET `Estado` = 0" +
                    "WHERE `ID_Producto` = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int Resultado = ps.executeUpdate();
            
            if (Resultado == 1) {
                JOptionPane.showMessageDialog(null, "Producto Eliminado Exitosamente");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Productos" + ex.getMessage());
        }
    }
  
    public List<Producto> listarTodos(){
        
        String sql = "SELECT * FROM `producto`";
        List<Producto> productoLista = new ArrayList();  
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet Resultado = ps.executeQuery();
            
            while(Resultado.next()){
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
    
    public List<Producto> listarPorNombre( String Nombre ){
        
        String sql = "SELECT * FROM `producto` WHERE Nombre LIKE ?% and Descripcion LIKE %?%";
        List<Producto> productoLista = new ArrayList();  
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Nombre);
            ps.setString(2, Nombre);
            
            ResultSet Resultado = ps.executeQuery();
            
            while(Resultado.next()){
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
    
    public List<Producto> listarPorRubro( Rubro rubro ){
        
        String sql = "SELECT * FROM `producto` WHERE ID_Rubro = ?";
        List<Producto> productoLista = new ArrayList();  
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, rubro.getid_rubro());

            ResultSet Resultado = ps.executeQuery();
            
            while(Resultado.next()){
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
    
   
    // Continuara...


}
