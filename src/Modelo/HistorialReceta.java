package Modelo;
public class HistorialReceta {
    private String codigoReceta;
    private String nombrePastel;
    private String fechaPreparacion;

    public HistorialReceta(String codigoReceta, String nombrePastel, String fechaPreparacion) {
        this.codigoReceta = codigoReceta;
        this.nombrePastel = nombrePastel;
        this.fechaPreparacion = fechaPreparacion;
    }

    // Getters y Setters
    public String getCodigoReceta() {
        return codigoReceta;
    }

    public void setCodigoReceta(String codigoReceta) {
        this.codigoReceta = codigoReceta;
    }

    public String getNombrePastel() {
        return nombrePastel;
    }

    public void setNombrePastel(String nombrePastel) {
        this.nombrePastel = nombrePastel;
    }

    public String getFechaPreparacion() {
        return fechaPreparacion;
    }

    public void setFechaPreparacion(String fechaPreparacion) {
        this.fechaPreparacion = fechaPreparacion;
    }
}