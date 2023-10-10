package entidades;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class Venta {

    private int id_venta;
    private int id_cliente;
    private int id_empleado;
    private LocalDate fecha_venta;
    private ArrayList<DetalleVenta> detalleVenta = new ArrayList<>(); 
//_________________________________________________________________________

    public Venta() {
    }

    public Venta(int id_cliente, int id_empleado) {
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
        fecha_venta = LocalDate.now();
    }
//_________________________________________________________________________
    
    public ArrayList<DetalleVenta> getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(ArrayList<DetalleVenta> detalleVenta) {
        this.detalleVenta = detalleVenta;
    }
    
    public void anadirDetalleVenta(DetalleVenta detalleVenta) {
        this.detalleVenta.add(detalleVenta);
    }
    
    public int getid_venta() {
        return id_venta;
    }

    public void setid_venta(int id_venta) {
        this.id_venta = id_venta;
        
        for (DetalleVenta detalle : detalleVenta) {
            detalle.setid_venta(id_venta);
        }
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public LocalDate getFecha_venta() {
        return fecha_venta;
    }

    public Date getFecha_venta_date() {
        // Obtén un Instant a partir del LocalDate
        Instant instant = fecha_venta.atStartOfDay(ZoneId.systemDefault()).toInstant();

        // Convierte el Instant en un Date
        return Date.from(instant);
    }

    public void setFecha_venta(LocalDate fecha_venta) {
        this.fecha_venta = fecha_venta;
    }
//_________________________________________________________________________

    @Override
    public String toString() {
        return "Venta{" + "id_venta=" + id_venta + ", id_cliente=" + id_cliente + ", id_empleado=" + id_empleado + ", fecha_venta=" + fecha_venta + '}';
    }

}
