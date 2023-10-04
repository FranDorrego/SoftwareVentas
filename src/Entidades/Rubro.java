package Entidades;
public class Rubro {
    private int ID_rubro;
    private String nombre_rubro;
    private String descripcion;

    public Rubro() {
    }

    public Rubro(int ID_rubro, String nombre_rubro, String descripcion) {
        this.ID_rubro = ID_rubro;
        this.nombre_rubro = nombre_rubro;
        this.descripcion = descripcion;
    }

    public int getID_rubro() {
        return ID_rubro;
    }

    public void setID_rubro(int ID_rubro) {
        this.ID_rubro = ID_rubro;
    }

    public String getNombre_rubro() {
        return nombre_rubro;
    }

    public void setNombre_rubro(String nombre_rubro) {
        this.nombre_rubro = nombre_rubro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Rubro{" + "ID_rubro=" + ID_rubro + ", nombre_rubro=" + nombre_rubro + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
