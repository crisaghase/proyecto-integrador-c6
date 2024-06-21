package Controlador;

import java.sql.*;
import Modelo.Producto;

public class C_Producto extends BaseQuery {

    // Metodo que permite registrar un producto en la base de datos
    public static boolean registrarProducto(Producto producto) {
        Connection c = Conexion.Conectar();
        String query = "insert into Ingrediente values (?,?,?,?,?,?)";
        boolean estado = false;

        try {
            PreparedStatement consulta = c.prepareStatement(query);
            consulta.setString(1, producto.getCodigo());
            consulta.setString(2, producto.getNombre());
            consulta.setInt(3, producto.getStock());
            consulta.setString(4, producto.getCategoria());
            consulta.setString(5, producto.getProveedor());
            consulta.setInt(6, producto.getVencimiento());
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
        String query = "update ingrediente set stock = ? where codigo = '" + codigo + "'";
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
    public boolean actualizarProducto(Producto producto, String codigo) {
        boolean estado = false;
        String query = "update ingrediente set codigocat=? , codigopro=? vencimiento=? where codigo = '" + codigo + "'";
        Connection c = Conexion.Conectar();
        try {
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, producto.getCategoria());
            ps.setString(2, producto.getProveedor());
            ps.setInt(3, producto.getVencimiento());

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
