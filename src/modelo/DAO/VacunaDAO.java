
package modelo.DAO;

import BaseDeDatos.TestConexion;
import Usuarios.Vacuna;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VacunaDAO {
    private static PreparedStatement ps;
    private static ResultSet rs;
    private static Connection cn;
    
    public static Vacuna buscarVacunaPorIDVacuna(int idvacuna){
        String sql = "select * from vacuna where idvacuna=?";
        cn = TestConexion.abrir();
        Vacuna vac = null;
        
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, idvacuna);
            rs = ps.executeQuery();
            while (rs.next()) {
                vac = new Vacuna();
                
                vac.setIdvacuna(rs.getInt("idvacuna"));
                vac.setNombre_vacuna(rs.getString("nombre_vacuna"));
                vac.setDescripcion(rs.getString("descripcion_vacuna"));
            }

            cn.close();
            ps.close();
            rs.close();
            return vac;
        } catch (SQLException ex) {
            return null;
        }
    }
}
