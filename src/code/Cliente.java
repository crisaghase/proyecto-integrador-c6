package code;

/**
 *
 * @author Gianny
 */
public class Cliente {
    private String codigo;
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
    private String direccion;
    private String sexo;
    private String edad;

    public Cliente(){
        
    }
    
    public Cliente(String codigo, String nombre, String apellidos, String dni, String telefono, String direccion, String sexo, String edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.edad = edad;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters">
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
      // </editor-fold>   
}
