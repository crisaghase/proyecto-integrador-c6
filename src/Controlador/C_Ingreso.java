package Controlador;

import Modelo.Ingreso;
import java.sql.*;
import java.util.*;

public class C_Ingreso extends BaseQuery{
    
    //Agregar un Ingreso
    public boolean agregarIngreso(Ingreso ingreso) {
        Connection c = Conexion.Conectar();
        String query = "insert into Ingreso values (?,?,?,?,?)";
        boolean estado = false;
        try {
            PreparedStatement consulta = c.prepareStatement(query);
            consulta.setString(1, ingreso.getCodigo());
            consulta.setString(2, ingreso.getCodigoProducto());
            consulta.setInt(3, ingreso.getCantidad());
            consulta.setString(4, ingreso.fechaIngreso());
            consulta.setString(5, ingreso.fechaVencimiento());
            if (consulta.executeUpdate() > 0) {
                estado = true;
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al registrar ingresos");
        }

        return estado;
    }
   
    // Consulta al SQL de ingresos
    public List<Ingreso> getIngresos() {
        List<Ingreso> lista = new ArrayList();
        Connection c = Conexion.Conectar();
        String query = "select * from ingreso";
        Ingreso ingreso;
        try {
            PreparedStatement consulta = c.prepareStatement(query);
            ResultSet rs = consulta.executeQuery();
            while (rs.next()) {                
                ingreso = new Ingreso(rs.getString(1), rs.getString(2), rs.getInt(4));
                ingreso.setDiaIngreso(rs.getDate(4).getDate());
                ingreso.setMesIngreso(rs.getDate(4).getMonth()+1);
                ingreso.setAnioIngreso(rs.getDate(4).getYear());
                ingreso.setDiaVencimiento(rs.getDate(5).getDate());
                ingreso.setMesVencimiento(rs.getDate(5).getMonth()+1);
                ingreso.setAnioVencimiento(rs.getDate(5).getYear());
                lista.add(ingreso);
            }
            c.close();
        } catch (SQLException e) {
            System.out.println("Error al pedir ingresos");
        }

        return lista;
    }
    
}
