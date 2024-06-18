package sql;
import code.*;
import java.sql.*;

/**
 *
 * @author Gianny
 */
public class BaseQuery implements IQueryDatos, IQueryEliminar {

    @Override
    public String queryDatos(String datoBuscado, String tabla, String codigo) {
        String query = "select " + datoBuscado + " from " + tabla + " where codigo = " + codigo;
        Statement statement;
        Connection c;
        ResultSet rs;
        String resultado = "";
        try {
            c = Conexion.Conectar();
            statement = c.createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()) {
                resultado = rs.getString(1);
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al consultar tabla " + tabla);
        }

        return resultado.trim();
    }

    // Elimina un elemento de una tabla segun el codigo pasado
    @Override
    public boolean eliminarElemento(String codigo) {
        boolean estado = false;
        String query = "delete from " + obtenerTabla() + " where codigo = " + codigo;
        Connection c = Conexion.Conectar();
        try {    
            PreparedStatement consulta = c.prepareStatement(query);
            if (consulta.executeUpdate() > 0) {
                estado = true;
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar elemento de " + obtenerTabla());
        }
        
        return estado;
    }
    
    // Regresa el nombre de la tabla a usar
    @Override
    public String obtenerTabla() {
        return null;
    }
}
