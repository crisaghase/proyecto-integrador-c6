package Controlador;

import Modelo.DetalleReceta;
import Modelo.Ingrediente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class C_Receta extends BaseQuery {

    public String obtenerCodigoReceta(String nombrePastel) {
        String codigoReceta = null;
        Connection conn = Conexion.Conectar();
        String query = "SELECT codigo FROM Receta WHERE nombre = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nombrePastel);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                codigoReceta = rs.getString("codigo");
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener el código de receta: " + e.getMessage());
        }
        return codigoReceta;
    }

    // Verifica que tenemos el stock suficiente de todos los ingredientes de la receta por preparar
    public boolean verificarIngredientesSuficientes(String codigoReceta) {
        boolean ingredientesSuficientes = true;
        Connection conn = Conexion.Conectar();
        String query = "SELECT codigoIng, cantidad FROM DetalleReceta WHERE codigoRec = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, codigoReceta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String codigoIngrediente = rs.getString("codigoIng");
                int cantidadRequerida = rs.getInt("cantidad");

                // Obtener el stock actual del ingrediente
                int stockActual = obtenerStockActual(codigoIngrediente);

//                // Verificar si hay suficiente stock
                if (stockActual < cantidadRequerida) {
                    ingredientesSuficientes = false;
                    break; // Salir del bucle si falta algún ingrediente
                }
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("Error al verificar ingredientes: " + e.getMessage());
        }
        return ingredientesSuficientes;
    }

    // Obtiene el stock actual del ingrediente por buscar
    private int obtenerStockActual(String codigoIngrediente) {
        int stockActual = 0;

        Connection conn = Conexion.Conectar();
        String query = "SELECT stock FROM Ingrediente WHERE codigo = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, codigoIngrediente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                stockActual = rs.getInt("stock");
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener el código de receta: " + e.getMessage());
        }

        return stockActual;
    }

    // Método para obtener los detalles de la receta y el stock actual
    // Y mostrarlo como mensaje en pantalla
    public String obtenerInformacionReceta(String nombrePastel) {
        StringBuilder mensaje = new StringBuilder();

        // Obtener código de receta
        String codigoReceta = obtenerCodigoReceta(nombrePastel);

        // Consultar detalles de la receta
        Connection conn = Conexion.Conectar();
        String query = "SELECT d.cantidad, i.nombre, i.stock "
                + "FROM DetalleReceta d "
                + "JOIN Ingrediente i ON d.codigoIng = i.codigo "
                + "WHERE d.codigoRec = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, codigoReceta);
            ResultSet rs = ps.executeQuery();

            mensaje.append(nombrePastel).append("\n");

            while (rs.next()) {
                String nombreIngrediente = rs.getString("nombre");
                int cantidadRequerida = rs.getInt("cantidad");
                int stockActual = rs.getInt("stock");

                mensaje.append("Requerido: ").append(cantidadRequerida)
                        .append(" - Stock: ").append(stockActual)
                        .append(" para ").append(nombreIngrediente).append("\n");
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener detalles de la receta: " + e.getMessage());
        }

        return mensaje.toString();
    }

    // Método para obtener los detalles de la receta y el stock actual
    public  List<DetalleReceta> obtenerDetallesReceta(String nombrePastel) {
        List<DetalleReceta> detallesReceta = new ArrayList<>();

        // Obtener código de receta
        String codigoReceta = obtenerCodigoReceta(nombrePastel);

        // Consultar detalles de la receta
        Connection conn = Conexion.Conectar();
        String query = "SELECT d.cantidad, i.codigo, i.stock "
                + "FROM DetalleReceta d "
                + "JOIN Ingrediente i ON d.codigoIng = i.codigo "
                + "WHERE d.codigoRec = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, codigoReceta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                DetalleReceta detalle = new DetalleReceta();
                detalle.setCantidad(rs.getInt("cantidad"));
                detalle.setCodigoIngrediente(rs.getString("codigo"));
                detalle.setStockActual(rs.getInt("stock"));

                detallesReceta.add(detalle);
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener detalles de la receta: " + e.getMessage());
        }

        return detallesReceta;
    }

    // Método para actualizar el inventario de ingredientes en la base de datos
    public  boolean actualizarInventario(List<DetalleReceta> detallesReceta) {
        boolean exito = false;
        Connection conn = Conexion.Conectar();

        try {
            for (DetalleReceta detalle : detallesReceta) {
                int cantidadRequerida = detalle.getCantidad();
                int stockActual = detalle.getStockActual();
                int nuevoStock = stockActual - cantidadRequerida;

                // Actualizar stock en la tabla Ingrediente
                String query = "UPDATE Ingrediente SET stock = ? WHERE codigo = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, nuevoStock);
                ps.setString(2, detalle.getCodigoIngrediente());

                ps.executeUpdate();
                
                // Actualizar el objeto DetalleReceta con el nuevo stock
                detalle.setStockActual(nuevoStock);
            }

            conn.close();
            exito = true;
        } catch (SQLException e) {
            System.out.println("Error al actualizar inventario: " + e.getMessage());
        }
        return exito;
    }
}
