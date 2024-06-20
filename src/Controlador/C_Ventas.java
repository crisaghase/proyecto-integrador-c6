package Controlador;

import Modelo.DetalleVenta;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class C_Ventas {
    
    // Registra una venta en la BBDD
    public boolean registrarVenta(Venta venta) {
        Connection c = Conexion.Conectar();
        String query = "insert into TB_Venta values (?,?,?)";
        boolean estado = false;
        try {
            PreparedStatement consulta = c.prepareStatement(query);
            consulta.setString(1, venta.getCodigo());
            consulta.setDouble(2, venta.getImporte());
            consulta.setString(3, venta.getCodigoCliente());
            if (consulta.executeUpdate() > 0) {
                estado = true;
            }
            
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al registrar Venta " + e.getMessage());
        }

        return estado;
    }
    
    // Registra cada detalle de venta
    // Un detalle es cada producto  que se vendio
    public boolean registrarDetalleVenta(DetalleVenta detalleVenta) {
        Connection c = Conexion.Conectar();
        String query = "insert into TB_DetalleVenta values (?,?,?,?,?)";
        boolean estado = false;
        try {
            PreparedStatement consulta = c.prepareStatement(query);
            consulta.setString(1, detalleVenta.getCodigoDetalleVenta());
            consulta.setString(2,detalleVenta.getCodigoVenta());
            consulta.setString(3, detalleVenta.getCodigoProducto());
            consulta.setInt(4, detalleVenta.getCantidad());
            consulta.setDouble(5, detalleVenta.getImporte());
            if (consulta.executeUpdate() > 0) {
                estado = true;
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al registrar Detalle de Venta " + e.getMessage());
        }

        return estado;
    }
}