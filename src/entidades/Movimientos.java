package entidades;

import java.time.LocalDate;

public class Movimientos {
    private LocalDate fecha_movimiento;
    private int id_cliente;
    private String Detalle;
//_________________________________________________________________________

    public Movimientos() {
    }

    public Movimientos(LocalDate fecha_movimiento, int id_cliente, String Detalle) {
        this.fecha_movimiento = fecha_movimiento;
        this.id_cliente = id_cliente;
        this.Detalle = Detalle;
    }
//_________________________________________________________________________

    public LocalDate getFecha_movimiento() {
        return fecha_movimiento;
    }

    public void setFecha_movimiento(LocalDate fecha_movimiento) {
        this.fecha_movimiento = fecha_movimiento;
    }

    public int getid_cliente() {
        return id_cliente;
    }

    public void setid_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }
//_________________________________________________________________________

    @Override
    public String toString() {
        return "Movimientos{" + "fecha_movimiento=" + fecha_movimiento + ", id_cliente=" + id_cliente + ", Detalle=" + Detalle + '}';
    }
    
    
}
