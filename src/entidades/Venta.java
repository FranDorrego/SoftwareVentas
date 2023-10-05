package entidades;

import java.time.LocalDate;

public class Venta {

    private int id_venta;
    private int id_cliente;
    private int id_empleado;
    private LocalDate fecha_venta;
//_________________________________________________________________________

    public Venta() {
    }

    public Venta(int id_venta, int id_cliente, int id_empleado, LocalDate fecha_venta) {
        this.id_venta = id_venta;
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
        this.fecha_venta = fecha_venta;
    }
//_________________________________________________________________________

    public int getid_venta() {
        return id_venta;
    }

    public void setid_venta(int id_venta) {
        this.id_venta = id_venta;
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

    public void setFecha_venta(LocalDate fecha_venta) {
        this.fecha_venta = fecha_venta;
    }
//_________________________________________________________________________

    @Override
    public String toString() {
        return "Venta{" + "id_venta=" + id_venta + ", id_cliente=" + id_cliente + ", id_empleado=" + id_empleado + ", fecha_venta=" + fecha_venta + '}';
    }

}