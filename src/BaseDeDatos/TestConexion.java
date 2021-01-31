package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestConexion {
  
    //variables
    private static String url="jdbc:mysql://localhost:3306/bdhospital12";
    private static String user="root";
    private static String psw="admin"; 
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
