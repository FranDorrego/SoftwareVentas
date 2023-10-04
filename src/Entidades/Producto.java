package Entidades;
public class Producto {
    private int ID_producto;
    private String nombre;
    private String descripcion;
    private double precio_actual;
    private int stock;
    private boolean estado;
    private int Stock_seguridad;
    private int ID_rubro;
    private int ID_cliente;

    public Producto() {
    }

    public Producto(int ID_producto, String nombre, String descripcion, double precio_actual, int stock, boolean estado, int Stock_seguridad, int ID_rubro, int ID_cliente) {
        this.ID_producto = ID_producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_actual = precio_actual;
        this.stock = stock;
        this.estado = estado;
        this.Stock_seguridad = Stock_seguridad;
        this.ID_rubro = ID_rubro;
        this.ID_cliente = ID_cliente;
    }

    public int getID_producto() {
        return ID_producto;
    }

    public void setID_producto(int ID_producto) {
        this.ID_producto = ID_producto;
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

    public int getID_rubro() {
        return ID_rubro;
    }

    public void setID_rubro(int ID_rubro) {
        this.ID_rubro = ID_rubro;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    @Override
    public String toString() {
        return "Producto{" + "ID_producto=" + ID_producto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio_actual=" + precio_actual + ", stock=" + stock + ", estado=" + estado + ", Stock_seguridad=" + Stock_seguridad + ", ID_rubro=" + ID_rubro + ", ID_cliente=" + ID_cliente + '}';
    }

    
}
