/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Ingreso;
import Modelo.Ingrediente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class C_Notificaciones {
    ArrayList<Ingrediente> ingredientes_notificacion = new ArrayList<>();
    ArrayList<Ingreso> ingreso_notificacion = new ArrayList<>();

    
    public ArrayList<Ingrediente> obtenerIngredientesStockMinimo() {
        ingredientes_notificacion.clear();
        String consulta = "SELECT codigo, nombre, stock, stock_min, codigoCat, codigoPro, vencimiento "
                        + "FROM Ingrediente "
                        + "WHERE stock = stock_min";

        try (Connection conn = Conexion.Conectar();
             PreparedStatement ps = conn.prepareStatement(consulta);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                int stock = rs.getInt("stock");
                int stock_min = rs.getInt("stock_min");
                String codigoCat = rs.getString("codigoCat");
                String codigoPro = rs.getString("codigoPro");
                int vencimiento = rs.getInt("vencimiento");

                Ingrediente ingrediente = new Ingrediente(codigo, nombre, stock, stock_min, codigoCat, codigoPro, vencimiento);
                ingredientes_notificacion.add(ingrediente);
            }

        } catch (SQLException ex) {
            System.out.println("Error al obtener ingredientes con stock mínimo: " + ex.getMessage());
        }

        return ingredientes_notificacion;
    }
    
    public ArrayList<Ingreso> ObtenerIngresosPorVencer() {
    ingreso_notificacion.clear();
    String busqueda = "SELECT i.codigo, i.codigoIng, i.cantidad, i.fechaIng, i.fechaVen, p.nombre "
                + "FROM Ingreso i "
                + "JOIN Ingrediente p ON i.codigoIng = p.codigo "
                + "WHERE i.fechaVen >= CAST(GETDATE() AS DATE) "  // Fecha de hoy
                + "AND i.fechaVen <= DATEADD(DAY, 5, CAST(GETDATE() AS DATE))";  // Fecha de hoy más 5 días


    try (Connection c = Conexion.Conectar();
         PreparedStatement ps = c.prepareStatement(busqueda)) {

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String codigo = rs.getString("codigo");
            String codigoIng = rs.getString("codigoIng");
            int cantidad = rs.getInt("cantidad");
            Date fechaIngreso = rs.getDate("fechaIng");
            Date fechaVencimiento = rs.getDate("fechaVen");
            String nombreIngrediente = rs.getString("nombre");

            Ingreso ingreso = new Ingreso(codigo, codigoIng, cantidad, fechaIngreso, fechaVencimiento, nombreIngrediente);
            ingreso_notificacion.add(ingreso);
        }

    } catch (SQLException ex) {
        System.out.println("Error al obtener ingresos por fecha: " + ex.getMessage());
    }

    return ingreso_notificacion;
}

    
    

}
