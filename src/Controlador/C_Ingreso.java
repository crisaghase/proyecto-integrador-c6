package Controlador;

import Modelo.Ingreso;
import java.sql.*;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.*;

public class C_Ingreso extends BaseQuery{
    
ArrayList<Ingreso> ingresos_busqueda = new ArrayList<>();
    DecimalFormat df = new DecimalFormat("#.##");
    Connection c = Conexion.Conectar();
    
    //Agregar un Ingreso
    public boolean agregarIngreso(Ingreso ingreso) {
        String queryIngreso = "INSERT INTO Ingreso (codigo, codigoIng, cantidad, fechaIng, fechaVen) VALUES (?,?,?,?,?)";
        String queryStock = "UPDATE Ingrediente SET stock = stock + ? WHERE codigo = ?";
        boolean estado = false;
        try {
            PreparedStatement consultaIngreso = c.prepareStatement(queryIngreso);
            consultaIngreso.setString(1, ingreso.getCodigo());
            consultaIngreso.setString(2, ingreso.getCodigoProducto());
            consultaIngreso.setInt(3, ingreso.getCantidad());
            consultaIngreso.setDate(4, ingreso.getIngreso());
            consultaIngreso.setDate(5, ingreso.getVencimiento());

            if (consultaIngreso.executeUpdate() > 0) {

                PreparedStatement consultaStock = c.prepareStatement(queryStock);
                consultaStock.setInt(1, ingreso.getCantidad());
                consultaStock.setString(2, ingreso.getCodigoProducto());

                if (consultaStock.executeUpdate() > 0) {
                    estado = true; 
                }
            }
                    } catch (SQLException e) {
            System.out.println("Error al registrar ingresos");
        }

        return estado;
    }
    
    public ArrayList<Ingreso> ObtenerIngresosFecha(java.sql.Date fecha) {
         ingresos_busqueda.clear();
        String busqueda = "SELECT i.codigo, i.codigoIng, i.cantidad, i.fechaIng, i.fechaVen, p.nombre "
                        + "FROM Ingreso i "
                        + "JOIN Ingrediente p ON i.codigoIng = p.codigo "
                        + "WHERE fechaIng = ?";

        try (Connection c = Conexion.Conectar();
             PreparedStatement ps = c.prepareStatement(busqueda)) {

            java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime());
            ps.setDate(1, fechaSQL);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String codigo = rs.getString("codigo");
                String codigoIng = rs.getString("codigoIng");
                int cantidad = rs.getInt("cantidad");
                java.sql.Date fechaIngreso = rs.getDate("fechaIng");
                java.sql.Date fechaVencimiento = rs.getDate("fechaVen");
                String nombreIngrediente = rs.getString("nombre");

                Ingreso ingreso = new Ingreso(codigo, codigoIng, cantidad, fechaIngreso, fechaVencimiento, nombreIngrediente);
                ingresos_busqueda.add(ingreso);

            }

        } catch (SQLException ex) {
            System.out.println("Error al buscar ingresos por fecha: " + ex.getMessage());
        }

        return ingresos_busqueda;
    }

    public ArrayList<Ingreso> ObtenerIngresosIngrediente(String nombreIngrediente) {
                 ingresos_busqueda.clear();
        String busqueda = "SELECT i.codigo, i.codigoIng, i.cantidad, i.fechaIng, i.fechaVen, p.nombre "
                        + "FROM Ingreso i "
                        + "JOIN Ingrediente p ON i.codigoIng = p.codigo "
                        + "WHERE p.nombre = ?";

        try (Connection c = Conexion.Conectar();
             PreparedStatement ps = c.prepareStatement(busqueda)) {

            ps.setString(1, nombreIngrediente);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String codigo = rs.getString("codigo");
                String codigoIng = rs.getString("codigoIng");
                int cantidad = rs.getInt("cantidad");
                java.sql.Date fechaIngreso = rs.getDate("fechaIng");
                java.sql.Date fechaVencimiento = rs.getDate("fechaVen");

                Ingreso ingreso = new Ingreso(codigo, codigoIng, cantidad, fechaIngreso, fechaVencimiento, nombreIngrediente);
                ingresos_busqueda.add(ingreso);
            }

        } catch (SQLException ex) {
            System.out.println("Error al buscar ingresos por ingrediente: " + ex.getMessage());
        }

        return ingresos_busqueda;
    }
    
    public ArrayList<Ingreso> ObtenerIngresosFechaIngrediente(java.sql.Date fecha, String nombre_ingrediente) {
                 ingresos_busqueda.clear();
        String busqueda = "SELECT i.codigo, i.codigoIng, i.cantidad, i.fechaIng, i.fechaVen, p.nombre "
                        + "FROM Ingreso i "
                        + "JOIN Ingrediente p ON i.codigoIng = p.codigo "
                        + "WHERE i.fechaIng = ? AND p.nombre = ?";

        try (Connection c = Conexion.Conectar();
             PreparedStatement ps = c.prepareStatement(busqueda)) {

            java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime());
            ps.setDate(1, fechaSQL);
            ps.setString(2, nombre_ingrediente);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String codigo = rs.getString("codigo");
                String codigoIng = rs.getString("codigoIng");
                int cantidad = rs.getInt("cantidad");
                java.sql.Date fechaIngreso = rs.getDate("fechaIng");
                java.sql.Date fechaVencimiento = rs.getDate("fechaVen");
                String Ingrediente = rs.getString("nombre");

                Ingreso ingreso = new Ingreso(codigo, codigoIng, cantidad, fechaIngreso, fechaVencimiento, Ingrediente);
                ingresos_busqueda.add(ingreso);
            }

        } catch (SQLException ex) {
            System.out.println("Error al buscar ingresos por fecha y nombre de ingrediente: " + ex.getMessage());
        }

        return ingresos_busqueda;
    }
    
public int Conteo_FIngresos(ArrayList<Ingreso> ingresos) {
        int Ingresos_fecha = 0;
        LocalDate fechaActual = LocalDate.now();

        for (Ingreso ingr : ingresos) {
            java.sql.Date fechaIngreso = ingr.getIngreso(); // Obtener la fecha de ingreso como java.sql.Date
            LocalDate fechaPago = fechaIngreso.toLocalDate(); // Convertir a LocalDate

            if (fechaPago.isBefore(fechaActual)) {
                Ingresos_fecha++;
            }
        }

        return Ingresos_fecha;
    }
        
    public int contar_ingresos (ArrayList<Ingreso> ingresos) {
        return ingresos.size();
    }
}
