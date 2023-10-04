package Entidades;
public class DetalleVenta {
    private int ID_detalle_venta;
    private int cantidad;
    private int ID_venta;
    private double precio_venta;
    private int ID_producto;

    public DetalleVenta() {
    }

    public DetalleVenta(int ID_detalle_venta, int cantidad, int ID_venta, double precio_venta, int ID_producto) {
        this.ID_detalle_venta = ID_detalle_venta;
        this.cantidad = cantidad;
        this.ID_venta = ID_venta;
        this.precio_venta = precio_venta;
        this.ID_producto = ID_producto;
    }

    public int getID_detalle_venta() {
        return ID_detalle_venta;
    }

    public void setID_detalle_venta(int ID_detalle_venta) {
        this.ID_detalle_venta = ID_detalle_venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getID_venta() {
        return ID_venta;
    }

    public void setID_venta(int ID_venta) {
        this.ID_venta = ID_venta;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getID_producto() {
        return ID_producto;
    }

    public void setID_producto(int ID_producto) {
        this.ID_producto = ID_producto;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "ID_detalle_venta=" + ID_detalle_venta + ", cantidad=" + cantidad + ", ID_venta=" + ID_venta + ", precio_venta=" + precio_venta + ", ID_producto=" + ID_producto + '}';
    }
    
    
    
}
