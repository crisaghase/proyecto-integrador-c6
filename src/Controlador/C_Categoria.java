package Controlador;

import Modelo.CategoriaProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gianny
 */
public class C_Categoria extends BaseQuery {
    
    // Permite registrar una nueva categoria
    public boolean guardar(CategoriaProducto c){
        boolean respuesta = false;
        Connection cn = Conexion.Conectar();
        try
        {
            PreparedStatement consulta = cn.prepareStatement("insert into categoriaingrediente values (?, ?)");
            consulta.setString(1, getUltimoCodigo());
            consulta.setString(2, c.getNombre());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            cn.close();
        }
        catch(SQLException e){
            System.out.println("Error al guardar categoria");
        }
        
        return respuesta;
    }
    
    private String getUltimoCodigo() {
        String cod = "";
        Connection c = Conexion.Conectar();
        String query = "select top 1 * from CategoriaIngrediente order by codigo desc";

        try {
            PreparedStatement consulta = c.prepareStatement(query);
            ResultSet rs = consulta.executeQuery();
            rs.next();
            String ultCod = rs.getString(1);
            ultCod = ultCod.substring(3).trim();
            int numCod = Integer.parseInt(ultCod);
            numCod++;
            cod = "CP" + String.format("%0" + 3 + "d", numCod);
            c.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return cod;
    }
    
    // Elimina una categoria de la lista
    public  boolean eliminarCategoria(String codigo){
        boolean estado = false;
        Connection c = Conexion.Conectar();
        try {
            PreparedStatement consulta = c.prepareStatement("delete from categoriaingrediente where codigo = '" + codigo+"'");
            if (consulta.executeUpdate() > 0) {
                estado = true;
            }
            c.close();
            
        } catch (SQLException e) {
            System.out.println("Error al eliminar categoria, conexion.");
        }
        
        return estado;
    }
    
    public boolean existeCategoria(String nombre){
        Connection c = Conexion.Conectar();
        String sql = "select * from categoriaingrediente ";
        boolean existe = true ;
        Statement st;
        try {
            st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString(2).equals(nombre)) {
                    existe = false;
                }
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al revisar si existe categoria" + e.getMessage());
        }
        return existe;
    }
    
    public List<CategoriaProducto> buscarCategoria (String nombre){
        List<CategoriaProducto> lista = new ArrayList();
        CategoriaProducto cat;
        Connection c = Conexion.Conectar();
        String sql = "SELECT * FROM CategoriaIngrediente WHERE nombre LIKE '%"+nombre+"%'";
        Statement st;
        try {
            
            st=c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {      
                cat = new CategoriaProducto();          
                cat.setCodigo(rs.getString(1));
                cat.setNombre(rs.getString(2));
                
               lista.add(cat);
            }
        } catch (SQLException e) {
            System.out.println("Error al revisar si existe categoria" + e.getMessage());
        }
        
        return lista;
    }
}
