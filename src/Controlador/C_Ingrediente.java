package Controlador;

import Modelo.Ingrediente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;

public class C_Ingrediente {

    // Metodo que permite registrar un Ingrediente en la base de datos
    public boolean registrarIngrediente(Ingrediente ingrediente) {
        Connection c = Conexion.Conectar();
        String query = "insert into Ingrediente values (?,?,?,?,?,?)";
        boolean estado = false;

        try {
            PreparedStatement consulta = c.prepareStatement(query);
            consulta.setString(1, getUltimoCodigo());
            consulta.setString(2, ingrediente.getNombre());
            consulta.setInt(3, ingrediente.getStock());
            consulta.setString(4, ingrediente.getCodCategoria());
            consulta.setString(5, ingrediente.getCodProveedor());
            consulta.setInt(6, ingrediente.getVencimiento());
            if (consulta.executeUpdate() > 0) {
                estado = true;
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al registrar Producto " + ingrediente.getNombre() + ", " + e.getMessage());
        }

        return estado;
    }
    
    // Obtener lista de ingredientes para el consumo de Recetas
    public List<Ingrediente> getListaIngredientes() {
        List<Ingrediente> lista = new ArrayList();
        try {
            Connection c = Conexion.Conectar();
            String query = "select * from Ingrediente";
            PreparedStatement ps = c.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ingrediente i = new Ingrediente();
                i.setCodigo(rs.getString(1));
                i.setNombre(rs.getString(2));
                i.setStock(rs.getInt(3));
                i.setCodCategoria(rs.getString(4));
                i.setCodProveedor(rs.getString(5));
                i.setVencimiento(rs.getInt(6));
                lista.add(i);
            }
        } catch (Exception e) {
            System.out.println("No se pudo obtener la lista de ingredientes.");
        }
        
        return lista;
    }
    
    private String getUltimoCodigo() {
        String cod = "";
        Connection c = Conexion.Conectar();
        String query = "select top 1 * from Ingrediente order by codigo desc";

        try {
            PreparedStatement consulta = c.prepareStatement(query);
            ResultSet rs = consulta.executeQuery();
            rs.next();
            String ultCod = rs.getString(1);
            ultCod = ultCod.substring(3).trim();
            int numCod = Integer.parseInt(ultCod);
            numCod++;
            cod = "PRO" + String.format("%0" + 3 + "d", numCod);
            c.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return cod;
    }
    
    public boolean actualizarIngrediente(Ingrediente ingrediente, String codigo) {
        boolean estado = false;
        String query = "update ingrediente set codigocat=? , codigopro=?, vencimiento=? where codigo = '" + codigo + "'";
        Connection c = Conexion.Conectar();
        try {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, ingrediente.getCodCategoria());
            ps.setString(2, ingrediente.getCodProveedor());
            ps.setInt(3, ingrediente.getVencimiento());

            if (ps.executeUpdate() > 0) {
                estado = true;
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto.");
        }

        return estado;
    }
    
    public List<Ingrediente> buscarIngrediente (String nombre, String atri){
        List<Ingrediente> lista = new ArrayList();
        Ingrediente ing;
        Connection c = Conexion.Conectar();
        String sql = "SELECT * FROM ingrediente WHERE "+atri+" LIKE '%"+nombre+"%'";
        Statement st;
        try {
            
            st=c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {      
                ing = new Ingrediente();          
                ing.setCodigo(rs.getString(1));
                ing.setNombre(rs.getString(2));
                ing.setStock(rs.getInt(3));
                ing.setCodCategoria(rs.getString(4));
                ing.setCodProveedor(rs.getString(5));
                ing.setVencimiento(rs.getInt(6));
               lista.add(ing);
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al revisar si existe Ingredientes" + e.getMessage());
        }
        
        return lista;
    }
    
    public List<Ingrediente> buscarFecha (Date fecha){
        List<Ingrediente> lista = new ArrayList();
        Ingrediente ing;
        Connection c = Conexion.Conectar();
        String sql = "SELECT e.codigo, e.nombre, e.stock, e.codigoCat, e.codigoPro, e.vencimiento FROM ingrediente e inner join Ingreso o ON e.codigo = o.codigoIng WHERE o.fechaVen = ? order by o.codigo ";
        PreparedStatement st;
        try {
            st=c.prepareStatement(sql);
            st.setDate(1, fecha);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {      
                ing = new Ingrediente();          
                ing.setCodigo(rs.getString(1));
                System.out.println(ing.getCodigo());
                ing.setNombre(rs.getString(2));
                ing.setStock(rs.getInt(3));
                ing.setCodCategoria(rs.getString(4));
                ing.setCodProveedor(rs.getString(5));
                ing.setVencimiento(rs.getInt(6));
               lista.add(ing);
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al revisar si existe Ingredientes" + e.getMessage());
        }
        
        return lista;
    }
}
