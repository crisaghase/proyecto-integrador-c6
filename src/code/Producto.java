package code;

public class Producto {
    private String codigo;
    private String nombre;
    private int stock;
    private double precio;
    private String categoria;
    private String proveedor;
    private int vencimiento;
    
    
    public Producto(){
        
    }

    public Producto(String codigo, String nombre, int stock, double precio, String categoria, String proveedor, int vencimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.categoria = categoria;
        this.proveedor = proveedor;
        this.vencimiento = vencimiento;
    }
    
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

    public void setStock(int sotck) {
        this.stock = sotck;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(int vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
}
