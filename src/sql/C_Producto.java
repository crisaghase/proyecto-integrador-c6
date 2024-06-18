package sql;

import java.sql.*;
import code.Producto;

public class C_Producto extends BaseQuery {

    // Metodo que permite registrar un producto en la base de datos
    public static boolean registrarProducto(Producto producto) {
        Connection c = Conexion.Conectar();
        String query = "insert into Producto values (?,?,?,?,?,?)";
        boolean estado = false;

        try {
            PreparedStatement consulta = c.prepareStatement(query);
            consulta.setString(1, producto.getCodigo());
            consulta.setString(2, producto.getNombre());
            consulta.setString(3, producto.getDescripcion());
            consulta.setInt(4, producto.getStock());
            consulta.setDouble(5, producto.getPrecio());
            consulta.setString(6, producto.getCategoria());
            if (consulta.executeUpdate() > 0) {
                estado = true;
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al registrar Producto " + producto.getNombre() + ", " + e.getMessage());
        }

        return estado;
    }
    
    // Consulta al SQL para saber si existe una categoria de productos
    public boolean actualizarStock(Producto producto, String codigo) {
        boolean estado = false;
        String query = "update Producto set stock = ? where codigo = '" + codigo + "'";
        Connection c = Conexion.Conectar();
        try {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setInt(1, producto.getStock());

            if (ps.executeUpdate() > 0) {
                estado = true;
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto.");
        }

        return estado;
    }
    
    // Buscamos un producto en la BBDD usando el metodo de BaseQuery
    public boolean existeProducto(String codigo){
        String cod = queryDatos("codigo", "Producto", codigo);
        return cod.isEmpty() == false;
    }
}
