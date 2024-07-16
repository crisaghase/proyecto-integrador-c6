package Modelo;

import java.sql.Date;

public class Ingreso {
   private String codigo;
    private String codigoProducto;
    private int cantidad;
    private Date ingreso;
    private Date vencimiento;
    private String nombre_ingrediente; 
    
    public Ingreso(String codigo, String codigoProducto, int cantidad, Date ingreso, Date vencimiento) {
        this.codigo = codigo;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.ingreso = ingreso;
        this.vencimiento = vencimiento;
    }

    public Ingreso(String codigo, String codigoProducto, int cantidad, Date ingreso, Date vencimiento, String nombre_ingrediente) {
        this.codigo = codigo;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.ingreso = ingreso;
        this.vencimiento = vencimiento;
        this.nombre_ingrediente = nombre_ingrediente;
    }
    
    

    public String getNombre_ingrediente() {
        return nombre_ingrediente;
    }

    public void setNombre_ingrediente(String nombre_ingrediente) {
        this.nombre_ingrediente = nombre_ingrediente;
    }
    
    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
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
    
}
