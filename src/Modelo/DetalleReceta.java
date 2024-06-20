package Modelo;

public class DetalleReceta {
    String codigoDetalleReceta;
    String codigoReceta;
    String codigoIngrediente;
    int cantidad;

    public String getCodigoDetalleReceta() {
        return codigoDetalleReceta;
    }

    public void setCodigoDetalleReceta(String codigoDetalleReceta) {
        this.codigoDetalleReceta = codigoDetalleReceta;
    }

    public String getCodigoReceta() {
        return codigoReceta;
    }

    public void setCodigoReceta(String codigoReceta) {
        this.codigoReceta = codigoReceta;
    }

    public String getCodigoIngrediente() {
        return codigoIngrediente;
    }

    public void setCodigoIngrediente(String codigoIngrediente) {
        this.codigoIngrediente = codigoIngrediente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
