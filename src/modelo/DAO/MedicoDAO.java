
package modelo.DAO;

import BaseDeDatos.TestConexion;
import Usuarios.Medico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MedicoDAO {
    
    private static PreparedStatement ps;
    private static ResultSet rs;
    private static Connection cn;
    
    public static boolean verificar(String dni, String pw){
        Medico me1, me2;
        int id1=0, id2=-1;
        Connection cn = TestConexion.abrir();
        
        //Extraer id (DNI)
        String sql1 = "select * from medico where dni_medico=?";
 
        try {
            PreparedStatement ps1 = cn.prepareStatement(sql1);
            ps1.setString(1, dni);
            ResultSet rs1 = ps1.executeQuery();
            
            while(rs1.next()){
                me1=new Medico();
                me1.setIdMedico(rs1.getInt("idmedico"));
                
                id1=me1.getIdMedico();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Extraer id (pw)
        String sql2 = "select * from medico where password_medico=?";
        
        try {
            PreparedStatement ps2 = cn.prepareStatement(sql2);
            ps2.setString(1, pw);
            ResultSet rs2 = ps2.executeQuery();
            
            while(rs2.next()){
                me2=new Medico();
                me2.setIdMedico(rs2.getInt("idmedico"));
                
                id2=me2.getIdMedico();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(id1==id2){
             return true;
        } else return false;
    }
    
    public static Medico buscarMedicoPorDNI(String dni) {
        
        String sql = "select * from medico where dni_medico=?";
        cn = TestConexion.abrir();
        Medico me = null;
        
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            while (rs.next()) {
                me = new Medico();
                
                me.setIdMedico(rs.getInt("idmedico"));
                me.setNombreMedico(rs.getString("nombre_medico"));
                me.setContraseñaMedico(rs.getString("password_medico"));
                me.setDniMedico(rs.getString("dni_medico"));
                
            }

            cn.close();
            ps.close();
            rs.close();
            return me;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public static Medico buscarMedicoPorNombre (String nombre){
        String sql = "select * from medico where nombre_medico=?";
        cn = TestConexion.abrir();
        Medico me = null;
        
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                me = new Medico();
                
                me.setIdMedico(rs.getInt("idmedico"));
                me.setNombreMedico(rs.getString("nombre_medico"));
                me.setContraseñaMedico(rs.getString("password_medico"));
                me.setDniMedico(rs.getString("dni_medico"));
            }

            cn.close();
            ps.close();
            rs.close();
            return me;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public static Medico buscarMedicoPorIDMedico(String idmedico) {
        
        String sql = "select * from medico where idmedico=?";
        cn = TestConexion.abrir();
        Medico me = null;
        
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, idmedico);
            rs = ps.executeQuery();
            while (rs.next()) {
                me = new Medico();
                
                me.setIdMedico(rs.getInt("idmedico"));
                me.setNombreMedico(rs.getString("nombre_medico"));
                me.setContraseñaMedico(rs.getString("password_medico"));
                me.setDniMedico(rs.getString("dni_medico"));
                
            }

            cn.close();
            ps.close();
            rs.close();
            return me;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public static ArrayList<Medico> buscarMedicosPorHorario_Hospital(int turno, int idhospital){
        String sql = "select * from medico where turno=? and idhospital=?";
        cn = TestConexion.abrir();
        Medico me = null;
        ArrayList<Medico> medicos = new ArrayList<>();
        
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, turno);
            ps.setInt(2, idhospital);
            rs = ps.executeQuery();
            while (rs.next()) {
                me = new Medico();
                
                me.setIdMedico(rs.getInt("idmedico"));
                me.setNombreMedico(rs.getString("nombre_medico"));
                me.setContraseñaMedico(rs.getString("password_medico"));
                me.setDniMedico(rs.getString("dni_medico"));
                
                medicos.add(me);
            }

            cn.close();
            ps.close();
            rs.close();
            return medicos;
        } catch (SQLException ex) {
            return null;
        }
    }
}
