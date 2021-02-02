package modelo.DAO;

import BaseDeDatos.TestConexion;
import Usuarios.CitaMedica;
import Usuarios.Hospital;
import Usuarios.Medico;
import Usuarios.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CitaMedicaDAO {

    private static PreparedStatement ps;
    private static ResultSet rs;
    private static Connection cn;

    public static void crearCitaMedica(Paciente pa, Hospital ho, Medico me, int turno, String fecha, int idvacuna) {
        String sql = "insert into cita_medica(idpaciente, idhospital, fecha, turno_vacuna, nombre_medico, idvacuna) values(?, ?, ?, ?, ?, ?)";
        cn = TestConexion.abrir();
        try {
            ps = cn.prepareStatement(sql);

            ps.setInt(1, pa.getIdPaciente());
            ps.setInt(2, ho.getId_hospital());
            ps.setString(3, fecha);
            ps.setInt(4, turno);
            ps.setString(5, me.getNombreMedico());
            ps.setInt(6, idvacuna);

            ps.executeUpdate();

        } catch (SQLException ex) {
        }
    }

    public static ArrayList<CitaMedica> buscarCitaMedicaPorIDPaciente(int idpaciente){
        String sql = "select * from cita_medica where idpaciente=?";
        cn = TestConexion.abrir();
        CitaMedica cm = null;
        ArrayList<CitaMedica> citas = new ArrayList<>();
        
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, idpaciente);
            rs = ps.executeQuery();
            while (rs.next()) {
                cm = new CitaMedica();
                
                cm.setIdcita(rs.getInt("idcita_medica"));
                cm.setIdpaciente(rs.getInt("idpaciente"));
                cm.setIdhospital(rs.getInt("idhospital"));
                cm.setIdvacuna(rs.getInt("idvacuna"));
                cm.setTurno(rs.getInt("turno_vacuna"));
                cm.setFecha(rs.getString("fecha"));
                cm.setMedico_asignado(rs.getString("nombre_medico"));
                cm.setEstado(rs.getInt("estado"));
                
                citas.add(cm);
            }

            cn.close();
            ps.close();
            rs.close();
            return citas;
            
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public static ArrayList<CitaMedica> buscarCitasMedicasPorNombreMedico(String medico) {
        String sql = "select * from cita_medica where nombre_medico=?";
        cn = TestConexion.abrir();
        CitaMedica cm = null;
        ArrayList<CitaMedica> citas = new ArrayList<>();

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, medico);
            rs = ps.executeQuery();
            while (rs.next()) {
                cm = new CitaMedica();

                cm.setIdcita(rs.getInt("idcita_medica"));
                cm.setIdpaciente(rs.getInt("idpaciente"));
                cm.setIdhospital(rs.getInt("idhospital"));
                cm.setIdvacuna(rs.getInt("idvacuna"));
                cm.setTurno(rs.getInt("turno_vacuna"));
                cm.setFecha(rs.getString("fecha"));
                cm.setMedico_asignado(rs.getString("nombre_medico"));
                cm.setEstado(rs.getInt("estado"));

                citas.add(cm);
            }

            cn.close();
            ps.close();
            rs.close();
            return citas;

        } catch (SQLException ex) {
            return null;
        }
    }
    
    public static CitaMedica buscarCitaMedicaPorIDPacienteyVacuna(int idpaciente, int idvacuna) {

        String sql = "select * from cita_medica where idpaciente=? AND idvacuna=?";
        cn = TestConexion.abrir();
        CitaMedica cm = null;

        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, idpaciente);
            ps.setInt(2, idvacuna);
            rs = ps.executeQuery();
            while (rs.next()) {
                cm = new CitaMedica();

                cm.setIdcita(rs.getInt("idcita_medica"));
                cm.setIdpaciente(rs.getInt("idpaciente"));
                cm.setIdhospital(rs.getInt("idhospital"));
                cm.setIdvacuna(rs.getInt("idvacuna"));
                cm.setTurno(rs.getInt("turno_vacuna"));
                cm.setFecha(rs.getString("fecha"));
                cm.setMedico_asignado(rs.getString("nombre_medico"));
                cm.setEstado(rs.getInt("estado"));
            }

            cn.close();
            ps.close();
            rs.close();
            return cm;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public static void validarCitaMedica(CitaMedica cm){
        String sql = "update cita_medica set estado=1 where idcita_medica=?";

        Connection cn = TestConexion.abrir();

        try {
            PreparedStatement stm = cn.prepareStatement(sql);

            stm.setInt(1, cm.getIdcita());

            stm.executeUpdate();

            stm.close();
            cn.close();

        } catch (Exception ex) {
            Logger.getLogger(CitaMedicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int comprobarNumeroDePacientes(String nombre, int turno, String fecha){
        int n=0;
        String sql = "select count(*) from cita_medica where nombre_medico=? and turno_vacuna=? and fecha=?";
        
        Connection cn = TestConexion.abrir();
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setInt(2, turno);
            ps.setString(3, fecha);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                n=rs.getInt(1);
            }
            return n;
            
        } catch (Exception ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }  
    }
}
