package modelo.DAO;

import BaseDeDatos.TestConexion;
import Usuarios.Paciente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PacienteDAO {

    private static PreparedStatement ps;
    private static ResultSet rs;
    private static Connection cn;

    public static boolean verificar(String dni, String pw) {
        Paciente pa1, pa2;
        int id1 = 0, id2 = -1;
        Connection cn = TestConexion.abrir();

        //Extraer id (DNI)
        String sql1 = "select * from paciente where DNI=?";

        try {
            PreparedStatement ps1 = cn.prepareStatement(sql1);
            ps1.setString(1, dni);
            ResultSet rs1 = ps1.executeQuery();

            while (rs1.next()) {
                pa1 = new Paciente();
                pa1.setIdPaciente(rs1.getInt("idpaciente"));

                id1 = pa1.getIdPaciente();
            }
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Extraer id (pw)
        String sql2 = "select * from paciente where password_paciente=?";

        try {
            PreparedStatement ps2 = cn.prepareStatement(sql2);
            ps2.setString(1, pw);
            ResultSet rs2 = ps2.executeQuery();

            while (rs2.next()) {
                pa2 = new Paciente();
                pa2.setIdPaciente(rs2.getInt("idpaciente"));

                id2 = pa2.getIdPaciente();
            }
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (id1 == id2) {
            return true;
        } else {
            return false;
        }
    }

    public static Paciente buscarPacientePorDNI(String dni) {

        String sql = "select * from paciente where DNI=?";
        cn = TestConexion.abrir();
        Paciente pa = null;

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            while (rs.next()) {
                pa = new Paciente();

                pa.setIdPaciente(rs.getInt("idpaciente"));
                pa.setNombrePaciente(rs.getString("nombre_paciente"));
                pa.setContraseñaPaciente(rs.getString("password_paciente"));
                pa.setEstadoPaciente(rs.getInt("registro_paciente"));
                pa.setDniPaciente(rs.getString("DNI"));
                pa.setEstadoPaciente(rs.getInt("registro_paciente"));
            }

            cn.close();
            ps.close();
            rs.close();
            return pa;
        } catch (SQLException ex) {
            return null;
        }
    }

    public static Paciente buscarPacientePorIDPaciente(int idpaciente) {

        String sql = "select * from paciente where idpaciente=?";
        cn = TestConexion.abrir();
        Paciente pa = null;

        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, idpaciente);
            rs = ps.executeQuery();
            while (rs.next()) {
                pa = new Paciente();

                pa.setIdPaciente(rs.getInt("idpaciente"));
                pa.setNombrePaciente(rs.getString("nombre_paciente"));
                pa.setContraseñaPaciente(rs.getString("password_paciente"));
                pa.setEstadoPaciente(rs.getInt("registro_paciente"));
                pa.setDniPaciente(rs.getString("DNI"));
                pa.setEstadoPaciente(rs.getInt("registro_paciente"));
            }

            cn.close();
            ps.close();
            rs.close();
            return pa;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public static boolean comprobarCuenta(String dni){
        String sql = "select * from paciente where DNI=?";
        cn = TestConexion.abrir();
        
        Paciente pa = null;
        
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            while (rs.next()) {
                pa = new Paciente();
                pa.setEstadoPaciente(rs.getInt("registro_paciente"));
            }

            cn.close();
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (pa.getEstadoPaciente()==1) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean comprobarPaciente(String dni, String nombre, String apep, String apem) {
        String sql = "select * from paciente where DNI=? and nombre_paciente=?";
        cn = TestConexion.abrir();
        Paciente pa = null;

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, apep + " " + apem + " " + nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                pa = new Paciente();

                pa.setIdPaciente(rs.getInt("idpaciente"));
                pa.setNombrePaciente(rs.getString("nombre_paciente"));
                pa.setContraseñaPaciente(rs.getString("password_paciente"));
                pa.setEstadoPaciente(rs.getInt("registro_paciente"));
                pa.setDniPaciente(rs.getString("DNI"));
            }

            cn.close();
            ps.close();
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (pa != null) {
            return true;
        } else {
            return false;
        }
    }

    public static void crearCuenta(Paciente pa) {

        String sql = "update paciente set password_paciente=?, registro_paciente=1 where DNI=?";

        Connection cn = TestConexion.abrir();

        try {
            PreparedStatement stm = cn.prepareStatement(sql);

            stm.setString(1, pa.getContraseñaPaciente());
            stm.setString(2, pa.getDniPaciente());
            
            stm.executeUpdate();

            stm.close();
            cn.close();

        } catch (Exception ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
