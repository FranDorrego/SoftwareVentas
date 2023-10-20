package entidades;

public class Cliente {

    private int id_cliente;
    private String nombre;
    private String apellido;
    private String Domicilio;
    private String telefono;
    private String numero_identificacion;
    private boolean es_empleado;
    private String clave;
    private boolean estado;

//_________________________________________________________________________
    public Cliente() {
    }

    //para crear empleado
    public Cliente(String nombre, String apellido, String Domicilio, String telefono, String numero_identificacion, boolean es_empleado, String clave, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Domicilio = Domicilio;
        this.telefono = telefono;
        this.numero_identificacion = numero_identificacion;
        this.es_empleado = es_empleado;
        this.clave = clave;
        this.estado = estado;
    }

    //para crear cliente
    public Cliente(String nombre, String apellido, String Domicilio, String telefono, String numero_identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Domicilio = Domicilio;
        this.telefono = telefono;
        this.numero_identificacion = numero_identificacion;
    }
//_________________________________________________________________________

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getID_cliente() {
        return id_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.id_cliente = ID_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNumero_identificacion() {
        return numero_identificacion;
    }

    public void setNumero_identificacion(String numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    public boolean isEs_empleado() {
        return es_empleado;
    }

    public void setEs_empleado(boolean es_empleado) {
        this.es_empleado = es_empleado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
//_________________________________________________________________________

    @Override
    public String toString() {
        return "ID_cliente:" + id_cliente + " | apellido:" + apellido + " | nombre:" + nombre + " | Domicilio:" + Domicilio + " | telefono:" + telefono + " | numero_identificacion:" + numero_identificacion + " | es_empleado:" + es_empleado + " | estado:" + estado;
    }

}
