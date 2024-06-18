package sql;

import code.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class C_Cliente extends BaseQuery {

    public boolean agregarCliente(Cliente cliente) {
        Connection c = Conexion.Conectar();
        String query = "insert into TB_Cliente values (?,?,?,?,?,?,?,?)";
        boolean estado = false;
        try {
            PreparedStatement consulta = c.prepareStatement(query);
            consulta.setString(1, cliente.getCodigo());
            consulta.setString(2, cliente.getNombre());
            consulta.setString(3, cliente.getApellidos());
            consulta.setString(4, cliente.getDni());
            consulta.setString(5, cliente.getTelefono());
            consulta.setString(6, cliente.getDireccion());
            consulta.setString(7, cliente.getSexo());
            consulta.setString(8, cliente.getEdad());
            if (consulta.executeUpdate() > 0) {
                estado = true;
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al registrar Cliente");
        }

        return estado;
    }

    // Consulta al SQL para actualizar stock
    public boolean actualizarCliente(Cliente cliente, String codigo) {
        boolean estado = false;
        String query = "update TB_Cliente set codigo = ?, nombre = ?, apellido = ?, dni = ?, telefono = ?, direccion = ?, sexo = ?, edad = ? where codigo = '" + codigo + "'";
        Connection c = Conexion.Conectar();
        try {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, cliente.getCodigo());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellidos());
            ps.setString(4, cliente.getDni());
            ps.setString(5, cliente.getTelefono());
            ps.setString(6, cliente.getDireccion());
            ps.setString(7, cliente.getSexo());
            ps.setInt(8, Integer.parseInt(cliente.getEdad()));

            if (ps.executeUpdate() > 0) {
                estado = true;
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar cliente.");
        }

        return estado;
    }
    
    // Consulta al SQL para saber si existe un cliente en la BBDD
    public boolean existeCliente(String codigo) {
        String cliente = queryDatos("codigo", "TB_Cliente", codigo);
        return cliente.isEmpty() == false;
    }

    public String obtenerNombreCliente(String codigo) {
        String nombre = queryDatos("nombre", "TB_Cliente", codigo);
        String apellido = queryDatos("apellido", "TB_Cliente", codigo);
        return nombre + " " + apellido;
    }

    public String obtenerCodigoCliente(String codigo) {
        String cod = queryDatos("codigo", "TB_Cliente", codigo);
        return cod;
    }
}
