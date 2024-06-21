package Controlador;

import Modelo.Ingrediente;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class C_Ingrediente {

    public static void main(String[] args) {
        String ultimoCodigo = getUltimoCodigo();
    }

    // Metodo que permite registrar un Ingrediente en la base de datos
    public static boolean registrarIngrediente(Ingrediente ingrediente) {
        Connection c = Conexion.Conectar();
        String query = "insert into Ingrediente values (?,?,?,?,?,?)";
        boolean estado = false;

        try {
            PreparedStatement consulta = c.prepareStatement(query);
            consulta.setString(1, ingrediente.getCodigo());
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
    public static List<Ingrediente> getListaIngredientes() {
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

    private static String getUltimoCodigo() {
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
            cod = "PRO00" + numCod;
            System.out.println(numCod);
            c.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return cod;
    }
}
