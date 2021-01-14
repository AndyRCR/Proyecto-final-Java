
package modelo.DAO;

import BaseDeDatos.TestConexion;
import Usuarios.Hospital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HospitalDAO {
    
    private static PreparedStatement ps;
    private static ResultSet rs;
    private static Connection cn;
    
    public static ArrayList<Hospital> buscarHospitalesPorDistrito(int distrito) {
        
        String sql = "select * from hospital where iddistrito=?";
        cn = TestConexion.abrir();
        Hospital ho = null;
        ArrayList<Hospital> hospitales = new ArrayList<>();
        
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, distrito);
            rs = ps.executeQuery();
            while (rs.next()) {
                ho = new Hospital();
                
                ho.setId_hospital(rs.getInt("idhospital"));
                ho.setNombre_hospital(rs.getString("nombre_hospital"));
                ho.setDireccion_hospital(rs.getString("direccion_hospital"));
                ho.setDistrito_hospital(rs.getInt("iddistrito"));
                
                hospitales.add(ho);
            }

            cn.close();
            ps.close();
            rs.close();
            return hospitales;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public static Hospital buscarHospitalPorNombre(String nombre){
        String sql = "select * from hospital where nombre_hospital=?";
        cn = TestConexion.abrir();
        Hospital ho = null;
        
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                ho = new Hospital();
                
                ho.setId_hospital(rs.getInt("idhospital"));
                ho.setNombre_hospital(rs.getString("nombre_hospital"));
                ho.setDireccion_hospital(rs.getString("direccion_hospital"));
                ho.setDistrito_hospital(rs.getInt("iddistrito"));
            }

            cn.close();
            ps.close();
            rs.close();
            return ho;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public static Hospital buscarHospitalPorIDHospital(int idhospital){
        String sql = "select * from hospital where idhospital=?";
        cn = TestConexion.abrir();
        Hospital ho = null;
        
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, idhospital);
            rs = ps.executeQuery();
            while (rs.next()) {
                ho = new Hospital();
                
                ho.setId_hospital(rs.getInt("idhospital"));
                ho.setNombre_hospital(rs.getString("nombre_hospital"));
                ho.setDireccion_hospital(rs.getString("direccion_hospital"));
                ho.setDistrito_hospital(rs.getInt("iddistrito"));
            }

            cn.close();
            ps.close();
            rs.close();
            return ho;
        } catch (SQLException ex) {
            return null;
        }
    }
    
}
