package entidades;
public class Rubro {
    private int id_rubro;
    private String nombre_rubro;
    private String descripcion;
//_________________________________________________________________________

    public Rubro() {
    }

    public Rubro(int id_rubro, String nombre_rubro, String descripcion) {
        this.id_rubro = id_rubro;
        this.nombre_rubro = nombre_rubro;
        this.descripcion = descripcion;
    }
//_________________________________________________________________________

    public int getid_rubro() {
        return id_rubro;
    }

    public void setid_rubro(int id_rubro) {
        this.id_rubro = id_rubro;
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
//_________________________________________________________________________

    @Override
    public String toString() {
        return "Rubro{" + "id_rubro=" + id_rubro + ", nombre_rubro=" + nombre_rubro + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
