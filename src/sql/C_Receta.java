package sql;

import code.Ingrediente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class C_Receta extends BaseQuery {

    public static List<Ingrediente> getIngredientesDeReceta(String recetaID) {
        List<Ingrediente> lista = new ArrayList();
        try {
            Connection c = Conexion.Conectar();
            String query = "select * from Ingrediente where codigo = ?";
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, recetaID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                
            }
        } catch (Exception e) {
        }
        
        return lista;
    }
}
