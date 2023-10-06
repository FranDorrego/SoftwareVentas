
package main;

import clasesData.ClienteData;
import clasesData.Conexion;
import entidades.Cliente;
import java.sql.Connection;


public class SoftwareVentas {

    public static void main(String[] args) {
      
        // Testeamos la conexion
        Connection con = Conexion.getConexion();
        ClienteData clienteData = new ClienteData();
        Cliente cliente = new Cliente( "Juan", "Ventas", "Villa allende", "123456789" , "428602258");
        Cliente cliente1 = new Cliente( "Alfredo", "Giles", "Buenos aires", "96325874" , "32546897");
        Cliente cliente2 = new Cliente( "Erica", "Briant", "Mendoza", "74185236" , "78945632");
        Cliente cliente3 = new Cliente( "Walter", "Funes", "Unquillo", "98746532" , "95126348");
        
        clienteData.agregarCliente(cliente);
        clienteData.agregarCliente(cliente1);
        clienteData.agregarCliente(cliente2);
        clienteData.agregarCliente(cliente3);
        System.out.println("Agregamos 3 clientes");
        
        Cliente empledo = new Cliente( "Juan", "Ventas", "Villa allende", "123456789" , "8428602258",true, "123456", true);
        Cliente empledo1 = new Cliente( "Alfredo", "Giles", "Buenos aires", "96325874" , "832546897",true, "654321", true);
        Cliente empledo2 = new Cliente( "Erica", "Briant", "Mendoza", "74185236" , "878945632",true, "415263", true);
        Cliente empledo3 = new Cliente( "Walter", "Funes", "Unquillo", "98746532" , "895126348",true, "362514", true);
        System.out.println("Creamos 4 Empleados");
        
        clienteData.agregarEmpleado(empledo);
        clienteData.agregarEmpleado(empledo1);
        clienteData.agregarEmpleado(empledo2);
        clienteData.agregarEmpleado(empledo3);
        System.out.println("Agregamos 4 Empleados");
        
        clienteData.eliminarEmpleadoPorID(empledo.getID_cliente());
        clienteData.eliminarEmpleadoPorID(empledo1.getID_cliente());
        System.out.println("Eliminamos 2 Empleados");
        
        cliente1.setNombre("NOMBRE CAMBIO");
        cliente1.setID_cliente(2);
        clienteData.modificar(cliente1);
        System.out.println("Modificamos 1 Cliente");
        
        System.out.println("Mostramos todos los clientes");
        System.out.println(clienteData.listarTodo());
        
        System.out.println("Mostramos el cliente NOMBRE CAMBIO");
        System.out.println(clienteData.buscarPorNombre("NOMBRE CAMBIO"));
        
        
        System.out.println("Buscamos por ID");
        System.out.println(clienteData.buscarPorID(cliente1.getID_cliente()));
        
        System.out.println("Buscamos por Numero de Identificacion");
        System.out.println(clienteData.buscarPorNumeroIdentificacion(cliente1.getNumero_identificacion()));
        
        
    }
    
}
