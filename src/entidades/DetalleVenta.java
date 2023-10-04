package entidades;

public class DetalleVenta {
    private int id_detalle_venta;
    private int cantidad;
    private int id_venta;
    private double precio_venta;
    private int id_producto;
//_________________________________________________________________________

    public DetalleVenta() {
    }

    public DetalleVenta(int id_detalle_venta, int cantidad, int id_venta, double precio_venta, int id_producto) {
        this.id_detalle_venta = id_detalle_venta;
        this.cantidad = cantidad;
        this.id_venta = id_venta;
        this.precio_venta = precio_venta;
        this.id_producto = id_producto;
    }
//_________________________________________________________________________

    public int getid_detalle_venta() {
        return id_detalle_venta;
    }

    public void setid_detalle_venta(int id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getid_venta() {
        return id_venta;
    }

    public void setid_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getid_producto() {
        return id_producto;
    }

    public void setid_producto(int id_producto) {
        this.id_producto = id_producto;
    }
//_________________________________________________________________________

    @Override
    public String toString() {
        return "DetalleVenta{" + "id_detalle_venta=" + id_detalle_venta + ", cantidad=" + cantidad + ", id_venta=" + id_venta + ", precio_venta=" + precio_venta + ", id_producto=" + id_producto + '}';
    }
    
    
    
}
