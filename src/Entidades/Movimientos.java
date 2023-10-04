package Entidades;

import java.time.LocalDate;

public class Movimientos {
    private LocalDate fecha_movimiento;
    private int ID_cliente;
    private String Detalle;

    public Movimientos() {
    }

    public Movimientos(LocalDate fecha_movimiento, int ID_cliente, String Detalle) {
        this.fecha_movimiento = fecha_movimiento;
        this.ID_cliente = ID_cliente;
        this.Detalle = Detalle;
    }

    public LocalDate getFecha_movimiento() {
        return fecha_movimiento;
    }

    public void setFecha_movimiento(LocalDate fecha_movimiento) {
        this.fecha_movimiento = fecha_movimiento;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    @Override
    public String toString() {
        return "Movimientos{" + "fecha_movimiento=" + fecha_movimiento + ", ID_cliente=" + ID_cliente + ", Detalle=" + Detalle + '}';
    }
    
    
    
}
