package Modelo;

public class Ingrediente {
    private String codigo;
    private String nombre;
    private int stock;
    private int stock_min;
    private String codCategoria;
    private String codProveedor;
    private int vencimiento;

    public Ingrediente(String codigo, String nombre, int stock, int stock_min, String codCategoria, String codProveedor, int vencimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.stock_min = stock_min;
        this.codCategoria = codCategoria;
        this.codProveedor = codProveedor;
        this.vencimiento = vencimiento;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
        public int getStock_min() {
        return stock_min;
    }

    public void setStock_min(int stock_min) {
        this.stock_min = stock_min;
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

    public String getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(String codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(String codProveedor) {
        this.codProveedor = codProveedor;
    }

    public int getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(int vencimiento) {
        this.vencimiento = vencimiento;
    }

}
