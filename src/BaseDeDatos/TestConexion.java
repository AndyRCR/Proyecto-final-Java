package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestConexion {
  
    //variables
    private static String url="jdbc:mysql://den1.mysql4.gear.host:3306/dbhospital";
    private static String user="dbhospital";
    private static String psw="bdhospital1.";
    private static Connection cn;
    public static Connection abrir(){
        try {
            //registrar drivers para mysql
            Class.forName("com.mysql.cj.jdbc.Driver");
            //abrir conexion
            cn=DriverManager.getConnection(url, user, psw);
        } catch (Exception ex) {
            Logger.getLogger(TestConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }
}
