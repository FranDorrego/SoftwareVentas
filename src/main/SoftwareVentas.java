
package main;

import clasesData.ClienteData;
import clasesData.Conexion;
import clasesData.ProductoData;
import entidades.Cliente;
import entidades.Rubro;
import entidades.Producto;
import java.sql.Connection;
import java.util.List;


public class SoftwareVentas {

    public static void main(String[] args) {
      /*
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
        
        */
      
        ProductoData productoData = new ProductoData();
        
        System.out.println("Buscamos los rubros");
        List<Rubro> rubrosLista = productoData.listarRubros();
        System.out.println(rubrosLista);
       
        Producto producto1 = new Producto("Samsung TV 55 pulgadas", "Televisor 4K con pantalla curva", 500000, 50, true, 12, rubrosLista.get(0).getid_rubro(), 3);
        Producto producto2 = new Producto("Laptop Dell XPS", "Portátil de 15 pulgadas con Intel Core i7", 800000, 30, true, 8, rubrosLista.get(1).getid_rubro(), 2);
        Producto producto3 = new Producto("Audífonos Bose QC35", "Audífonos con cancelación de ruido", 200000, 100, true, 15, rubrosLista.get(2).getid_rubro(), 4);
        Producto producto4 = new Producto("Cámara Canon EOS R", "Cámara mirrorless de alta resolución", 1200000, 20, true, 5, rubrosLista.get(3).getid_rubro(), 1);
        Producto producto5 = new Producto("Lavarropas LG 8kg", "Lavarropas automático con capacidad de 8kg", 300000, 25, true, 10, rubrosLista.get(5).getid_rubro(), 3);
        System.out.println("Creamos los productos");
        
        productoData.agregarProducto(producto1);
        productoData.agregarProducto(producto2);
        productoData.agregarProducto(producto3);
        productoData.agregarProducto(producto4);
        productoData.agregarProducto(producto5);
        System.out.println("Cargamos los productos en la base de datos");
        
        producto1.setNombre("Producto Cambiado");
        productoData.modificarProducto(producto1); // Esto no funciona
        System.out.println("Modificamos un producto");
        
        productoData.eliminarProducto(producto5.getid_producto());
        System.out.println("Eliminamos un producto");
        
        System.out.println("Listamos Todos");
        System.out.println(productoData.listarTodos());
        
        System.out.println("Listamos por Nombre");
        System.out.println(productoData.listarPorNombre("Laptop"));
        
        System.out.println("Listamos por Rubro");
        System.out.println(productoData.listarPorRubro(rubrosLista.get(0)));
        
        System.out.println("Listamos por Nombre y Rubro");
        System.out.println(productoData.listarPorRubroYNombre(rubrosLista.get(0), "Producto") );
        
    }
    
}
