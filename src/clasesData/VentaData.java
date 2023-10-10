package clasesData;

import entidades.DetalleVenta;
import entidades.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentaData {

    private Connection con = null;

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

    public void agregarDetalleVenta(ArrayList<DetalleVenta> detalleLista) {

        for (DetalleVenta detalle : detalleLista) {
            
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
                } else {
                    JOptionPane.showMessageDialog(null, "No se cargo la venta");
                }
                ps.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente " + ex.getMessage());
            }
        }
    }

}
