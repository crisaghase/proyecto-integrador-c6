package Controlador;

import Modelo.HistorialReceta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class C_Ventas {

    public List<HistorialReceta> cargarHistorialReceta() {
        List<HistorialReceta> listaPreparaciones = new ArrayList<>();

        // Conectar a la base de datos y obtener datos
        Connection conn = Conexion.Conectar(); // Método para conectar a la base de datos
        String query = "SELECT HR.codigo, R.nombre, HR.fecha FROM HistorialReceta HR INNER JOIN Receta R ON HR.codigoRec = R.codigo ORDER BY HR.fecha ASC";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String codigoReceta = rs.getString("codigo");
                String nombrePastel = rs.getString("nombre");
                String fechaPreparacion = rs.getString("fecha");

                HistorialReceta preparacion = new HistorialReceta(codigoReceta, nombrePastel, fechaPreparacion);
                listaPreparaciones.add(preparacion);
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar datos iniciales: " + e.getMessage());
        }

        return listaPreparaciones;
    }

    public boolean agregarHistorialReceta(String codigoReceta, String fecha) {
        boolean exito = false;
        Connection conn = Conexion.Conectar();

        String query = "INSERT INTO HistorialReceta (codigo, codigoRec, codigoEmp, fecha) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, getUltimoCodigo());
            ps.setString(2, codigoReceta);
            ps.setString(3, "EMP001");
            ps.setString(4, fecha);

            int filasInsertadas = ps.executeUpdate();

            if (filasInsertadas > 0) {
                exito = true;
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("Error al agregar Historial de Receta: " + e.getMessage());
        }

        return exito;
    }

    private String getUltimoCodigo() {
        String cod = "";
        Connection c = Conexion.Conectar();
        String query = "select top 1 * from HistorialReceta order by codigo ASC";

        try {
            PreparedStatement consulta = c.prepareStatement(query);
            ResultSet rs = consulta.executeQuery();
            rs.next();
            String ultCod = rs.getString(1);
            ultCod = ultCod.substring(2).trim();
            System.out.println(ultCod);
            int numCod = Integer.parseInt(ultCod);
            numCod++;
            cod = "HR" + String.format("%0" + 4 + "d", numCod);
            System.out.println(cod);
            c.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return cod;
    }
}
