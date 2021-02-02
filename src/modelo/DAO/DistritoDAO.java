package modelo.DAO;

import BaseDeDatos.TestConexion;
import Usuarios.Distrito;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DistritoDAO {

    private static PreparedStatement ps;
    private static ResultSet rs;
    private static Connection cn;

    public static Distrito buscarDistritoPorID(int id) {
        String sql = "select * from distrito where iddistrito = ?";

        cn = TestConexion.abrir();

        Distrito dis = null;

        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                dis = new Distrito();

                dis.setIddistrito(rs.getInt("iddistrito"));
                dis.setNombre_distrito(rs.getString("nombre_distrito"));
            }

            cn.close();
            ps.close();
            rs.close();
            return dis;
        } catch (SQLException ex) {
            return null;
        }
    }
}
