package Controlador;

import Modelo.CategoriaProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
            consulta.setString(1, c.getCodigo());
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
    
    // Elimina una categoria de la lista
    public  boolean eliminarCategoria(String codigo){
        boolean estado = false;
        Connection c = Conexion.Conectar();
        try {
            
            PreparedStatement consulta = c.prepareStatement("delete from categoriaingrediente where codigo = " + codigo);
            consulta.executeUpdate();
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
        String cod = queryDatos("nombre", "categoriaingrediente", nombre);
        return cod.isEmpty() == false;
    }
}
