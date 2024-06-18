package sql;

import code.DetalleVenta;
import code.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

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
    
    public static String generarCodigo() {
        String codigoGeneradoVenta;
        Random random = new Random();

        do {
            int numero = random.nextInt(10000);
            codigoGeneradoVenta = "C" + String.format("%04d", numero);
        } while (codigoExistenteEnBaseDeDatos(codigoGeneradoVenta));

        return codigoGeneradoVenta;
    }
    
    public static boolean codigoExistenteEnBaseDeDatos(String codigo) {
        try {
            Connection c = Conexion.Conectar();
            Statement st = c.createStatement();
            String sql = "Select count(*) from TB_DetalleVenta Where codigo_ven = '" + codigo + "'";
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            int count = rs.getInt(1);

            return count > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
