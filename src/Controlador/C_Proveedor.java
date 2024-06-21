package Controlador;

import Modelo.Proveedor;
import java.sql.*;
import java.util.*;

public class C_Proveedor extends BaseQuery{
    
    // Consulta al SQL de ingresos
    public List<Proveedor> getIngresos() {
        List<Proveedor> lista = new ArrayList();
        Connection c = Conexion.Conectar();
        String query = "select * from proveedor";
        try {
            PreparedStatement consulta = c.prepareStatement(query);
            ResultSet rs = consulta.executeQuery();
            while (rs.next()) {                
                lista.add(new Proveedor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al pedir ingresos");
        }

        return lista;
    }
}
