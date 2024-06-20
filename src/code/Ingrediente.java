package code;

public class Ingrediente {
    String codigo;
    String nombre;
    int stock;
    String categoria;
    int fechaExpiracion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(int fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
    
    
}
