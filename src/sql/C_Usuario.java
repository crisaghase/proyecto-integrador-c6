package sql;

import code.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;

public class C_Usuario extends BaseQuery {

    public boolean loginUser(Usuario user) {
        boolean estado = false;
        Connection c = Conexion.Conectar();
        String sqlQuery = "select CONCAT(nombre, apellido) as Nombres, usuario, contraseña from Usuario where usuario = '" + user.getUsuario() + "' and contraseña = '" + user.getContraseña() + "'";

        try {
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(sqlQuery);
            while (rs.next()) {
                estado = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión");
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
        }

        return estado;
    }

    public boolean RegistroUsuario(Usuario usuario) {
        Connection c = Conexion.Conectar();
        String query = "insert into Usuario values (?,?,?,?,?,?,?,?)";
        boolean estado = false;

        try {
            PreparedStatement consulta = c.prepareStatement(query);
            consulta.setString(1, usuario.getCodigo());
            consulta.setString(2, usuario.getNombre());
            consulta.setString(3, usuario.getApellido());
            consulta.setString(4, usuario.getUsuario());
            consulta.setString(5, usuario.getContraseña());
            consulta.setString(6, usuario.getTelefono());
            consulta.setInt(7, Integer.parseInt(usuario.getEdad()));
            consulta.setString(8, usuario.getSexo());

            if (consulta.executeUpdate() > 0) {
                estado = true;
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al registrar Usuario " + usuario.getNombre() + ", " + e.getMessage());
        }

        return estado;
    }
    
    public boolean eliminarUsuario(Usuario usuario, String codigo){
        Connection c = Conexion.Conectar();
        String sql = "DELETE FROM Usuario WHERE codigo = ?";
        try {

            PreparedStatement pt = c.prepareStatement(sql);
            pt.setString(1, usuario.getCodigo());
            int rowsAffected = pt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el usuario.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar el usuario.");
        }
        return false;
    }
    
    // Consulta al SQL para actualizar stock
    public boolean actualizarUsuario(Usuario usuario, String codigo) {
        boolean estado = false;
        String query = "update Usuario set codigo = ?, usuario = ?, contraseña = ?, telefono = ? where codigo = '" + codigo + "'";
        Connection c = Conexion.Conectar();
        try {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, usuario.getCodigo());
            ps.setString(2, usuario.getUsuario());
            ps.setString(3, usuario.getContraseña());
            ps.setString(4, usuario.getTelefono());

            if (ps.executeUpdate() > 0) {
                estado = true;
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario.");
        }

        return estado;
    }
    
    public boolean existeUsuario(String codigo){
        String x = queryDatos("nombre", "Usuario", codigo);
        return x.isEmpty() == false;
    }
}
