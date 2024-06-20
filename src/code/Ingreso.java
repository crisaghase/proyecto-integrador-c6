package code;

public class Ingreso {
    private String codigo;
    private String codigoProducto;
    private int cantidad;
    private int diaIngreso;
    private int mesIngreso;
    private int anioIngreso;
    private int diaVencimiento;
    private int mesVencimiento;
    private int anioVencimiento;

    public Ingreso(String codigo, String codigoProducto, int cantidad) {
        this.codigo = codigo;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
    }

    public int getAnioVencimiento() {
        return anioVencimiento;
    }

    public void setAnioVencimiento(int anioVencimiento) {
        this.anioVencimiento = anioVencimiento;
    }

    public int getDiaIngreso() {
        return diaIngreso;
    }

    public void setDiaIngreso(int diaIngreso) {
        this.diaIngreso = diaIngreso;
    }

    public int getMesIngreso() {
        return mesIngreso;
    }

    public void setMesIngreso(int mesIngreso) {
        this.mesIngreso = mesIngreso;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getDiaVencimiento() {
        return diaVencimiento;
    }

    public void setDiaVencimiento(int diaVencimiento) {
        this.diaVencimiento = diaVencimiento;
    }

    public int getMesVencimiento() {
        return mesVencimiento;
    }

    public void setMesVencimiento(int mesVencimiento) {
        this.mesVencimiento = mesVencimiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String fechaIngreso(){
        return diaIngreso+"/"+mesIngreso+"/"+anioIngreso;
    }
    public String fechaVencimiento(){
        return diaVencimiento+"/"+mesVencimiento+"/"+anioVencimiento;
    }
    
}
