package entidades;
public class Producto {
    private int id_producto = 0; //para saber si el cliente está agregado o no
    private String nombre;
    private String descripcion;
    private double precio_actual;
    private int stock;
    private boolean estado;
    private int Stock_seguridad;
    private int id_rubro;
    private int id_cliente;
//_________________________________________________________________________

    public Producto() {
    }

    public Producto(String nombre, String descripcion, double precio_actual, int stock, boolean estado, int Stock_seguridad, int id_rubro, int id_cliente) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_actual = precio_actual;
        this.stock = stock;
        this.estado = estado;
        this.Stock_seguridad = Stock_seguridad;
        this.id_rubro = id_rubro;
        this.id_cliente = id_cliente;
    }
//_________________________________________________________________________

    public int getid_producto() {
        return id_producto;
    }

    public void setid_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio_actual() {
        return precio_actual;
    }

    public void setPrecio_actual(double precio_actual) {
        this.precio_actual = precio_actual;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getStock_seguridad() {
        return Stock_seguridad;
    }

    public void setStock_seguridad(int Stock_seguridad) {
        this.Stock_seguridad = Stock_seguridad;
    }

    public int getid_rubro() {
        return id_rubro;
    }

    public void setid_rubro(int id_rubro) {
        this.id_rubro = id_rubro;
    }

    public int getid_cliente() {
        return id_cliente;
    }

    public void setid_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
//_________________________________________________________________________

    @Override
    public String toString() {
        
        System.out.println(" ID_Producto : " + getid_producto());
        System.out.println(" Nombre : " + getNombre());
        System.out.println(" Descripcion : " + getDescripcion());
        System.out.println(" Precio Actual : " + getPrecio_actual());
        System.out.println(" Stock : " + getStock());
        System.out.println(" Stock Seguridad : " + getStock_seguridad());
        System.out.println(" Estado : " + isEstado());
        System.out.println(" ID_Rubro : " + getid_rubro());
        System.out.println(" ID_Cliente : " + getid_cliente());
        
        System.out.println("--------------------");
        
        return "Producto{" + "id_producto=" + id_producto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio_actual=" + precio_actual + ", stock=" + stock + ", estado=" + estado + ", Stock_seguridad=" + Stock_seguridad + ", id_rubro=" + id_rubro + ", id_cliente=" + id_cliente + '}';
    }
    
}
