package sql;
import java.sql.*;
public class Conexion {

    // Metodo qe permite conectarse a la base de datos "SistemaVega"
    public static Connection Conectar() {

        // Creamos la conexion
        Connection c = null;
        // Obtenemos la direccion a la base de datos local
        String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=SistemaVega;encrypt=true;trustServerCertificate=true;";
        // Credenciales de inicio
        String user = "sa";
        String pass = "1234";
        
        // Nos conectamos usando un try
        try {
            c = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println("Error en la conexcion local, " + e.getMessage());
        }
        return c;
    }
}
