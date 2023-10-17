
package clasesData;

import java.sql.Connection;
import entidades.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteData {
    
    private Connection con = null;

    public ClienteData() {
        con = Conexion.getConexion();
    }
    
    public void agregarCliente( Cliente cliente ){
        
        String sql = "INSERT INTO `cliente`(`Apellido`, `Nombre`, `Domicilio`, `Telefono`, `Numero_Identificacion`, `Es_Empleado`)"
                    + "VALUES (?,?,?,?,?, 0 )";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());
            ps.setString(5, cliente.getNumero_identificacion());

            ps.executeUpdate();

            ResultSet Resultado = ps.getGeneratedKeys();
            if (Resultado.next()) {
                cliente.setID_cliente(Resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Cargado exitoso");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente" + ex.getMessage());
        }
    }
    
    public void agregarEmpleado( Cliente cliente ){
        
        String sql = "INSERT INTO `cliente`(`Apellido`, `Nombre`, `Domicilio`, `Telefono`, `Numero_Identificacion`, `Es_Empleado`, `Estado`, `Clave`)"
                    + "VALUES (?,?,?,?,?, ?, ? , ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());
            ps.setString(5, cliente.getNumero_identificacion());
            ps.setBoolean(6, cliente.isEs_empleado());
            ps.setBoolean(7, cliente.isEstado());
            ps.setString(8, cliente.getClave());
            
            ps.executeUpdate();

            ResultSet Resultado = ps.getGeneratedKeys();
            if (Resultado.next()) {
                cliente.setID_cliente(Resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Cargado exitoso");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente" + ex.getMessage());
        }
    }
    
    public void eliminarEmpleadoPorID( int id ){
        
        String sql = "UPDATE `cliente` SET `Estado`= 0 WHERE ID_Cliente = ? and Es_Empleado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
            int Resultado = ps.executeUpdate();

            if (Resultado == 1) {
                JOptionPane.showMessageDialog(null, "Eliminado exitoso");
            }else{
                JOptionPane.showMessageDialog(null, "No se elimino correctamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente" + ex.getMessage());
        }
    }
    
    public void modificar( Cliente cliente ){
        
        String sql = "UPDATE `cliente` SET `Apellido`= ?,`Nombre`= ?,`Domicilio`= ?,`Telefono`= ?,`Numero_Identificacion`= ?,`Es_Empleado`= ?,`Estado`= ?,`Clave`= ? WHERE ID_Cliente = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());
            ps.setString(5, cliente.getNumero_identificacion());
            ps.setBoolean(6, cliente.isEs_empleado());
            ps.setBoolean(7, cliente.isEstado());
            ps.setString(8, cliente.getClave());
            ps.setInt(9, cliente.getID_cliente());
            
            int Resultado = ps.executeUpdate();

            if (Resultado != 0) {
                JOptionPane.showMessageDialog(null, "Modificado exitoso, cantidad de registros modificados " + Resultado);
            }else{
                JOptionPane.showMessageDialog(null, "No fue modificado, ocurrio un error");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente" + ex.getMessage());
        }
    }
    
    public List<Cliente> listarTodo(){
        
        String sql = "SELECT * FROM `cliente`";
        List<Cliente> clienteLista = new ArrayList();  
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet Resultado = ps.executeQuery();
            
            while(Resultado.next()){
                Cliente cliente = new Cliente();
                cliente.setID_cliente(Resultado.getInt("ID_Cliente"));
                cliente.setApellido(Resultado.getString("Apellido"));
                cliente.setNombre(Resultado.getString("Nombre"));
                cliente.setDomicilio(Resultado.getString("Domicilio"));
                cliente.setTelefono(Resultado.getString("Telefono"));
                cliente.setNumero_identificacion(Resultado.getString("Numero_Identificacion"));
                cliente.setEs_empleado(Resultado.getBoolean("Es_Empleado"));
                cliente.setClave(Resultado.getString("Clave"));
                cliente.setEstado(Resultado.getBoolean("Estado"));
                
                clienteLista.add(cliente);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente" + ex.getMessage());
        }
         
        return clienteLista;
    }
    
    public List<Cliente> buscarPorNombre( String nombre ){
      
        String sql = "SELECT * FROM cliente WHERE Apellido LIKE '"+nombre+"%' or Nombre LIKE '%"+nombre+"%'";
        List<Cliente> clienteLista = new ArrayList();  
        Cliente cliente = new Cliente();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet Resultado = ps.executeQuery();
            
            while(Resultado.next()){
                cliente.setID_cliente(Resultado.getInt("ID_Cliente"));
                cliente.setApellido(Resultado.getString("Apellido"));
                cliente.setNombre(Resultado.getString("Nombre"));
                cliente.setDomicilio(Resultado.getString("Domicilio"));
                cliente.setTelefono(Resultado.getString("Telefono"));
                cliente.setNumero_identificacion(Resultado.getString("Numero_Identificacion"));
                cliente.setEs_empleado(Resultado.getBoolean("Es_Empleado"));
                cliente.setClave(Resultado.getString("Clave"));
                cliente.setEstado(Resultado.getBoolean("Estado"));
                
                clienteLista.add(cliente);
            }

            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente" + ex.getMessage());
        }

        return clienteLista;
    }
    
    public Cliente buscarPorID( int id ){
        
        String sql = "SELECT* FROM cliente WHERE ID_Cliente = ?";
        Cliente cliente = new Cliente();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet Resultado = ps.executeQuery();
            
            if(Resultado.next()){
                cliente.setID_cliente(Resultado.getInt("ID_Cliente"));
                cliente.setApellido(Resultado.getString("Apellido"));
                cliente.setNombre(Resultado.getString("Nombre"));
                cliente.setDomicilio(Resultado.getString("Domicilio"));
                cliente.setTelefono(Resultado.getString("Telefono"));
                cliente.setNumero_identificacion(Resultado.getString("Numero_Identificacion"));
                cliente.setEs_empleado(Resultado.getBoolean("Es_Empleado"));
                cliente.setClave(Resultado.getString("Clave"));
                cliente.setEstado(Resultado.getBoolean("Estado"));
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el cliente en la base de datos");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente" + ex.getMessage());
        }
         
        return cliente;
    }
    
    public Cliente buscarPorNumeroIdentificacion( String id ){
        
        String sql = "SELECT* FROM cliente WHERE Numero_Identificacion = ?";
        Cliente cliente = new Cliente();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            
            ResultSet Resultado = ps.executeQuery();
            
            if(Resultado.next()){
                cliente.setID_cliente(Resultado.getInt("ID_Cliente"));
                cliente.setApellido(Resultado.getString("Apellido"));
                cliente.setNombre(Resultado.getString("Nombre"));
                cliente.setDomicilio(Resultado.getString("Domicilio"));
                cliente.setTelefono(Resultado.getString("Telefono"));
                cliente.setNumero_identificacion(Resultado.getString("Numero_Identificacion"));
                cliente.setEs_empleado(Resultado.getBoolean("Es_Empleado"));
                cliente.setClave(Resultado.getString("Clave"));
                cliente.setEstado(Resultado.getBoolean("Estado"));
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el cliente en la base de datos");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente" + ex.getMessage());
        }
         
        return cliente;
    }
    public boolean login(int ID_cliente, String clave){
        String sql = "SELECT * FROM `cliente` WHERE ID_Cliente = ? AND Clave = '"+clave+"' AND Estado = 1";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ID_cliente);
            ResultSet Resultado = ps.executeQuery();
            ps.close();
            return Resultado.next();
        
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente" + ex.getMessage());
        }
    
        return false;
        }
    }



