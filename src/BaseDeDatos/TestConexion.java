package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestConexion {
    
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String psw = "1234";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/bdhospital";

    public static Connection abrir(){
        try {
            //registrar drivers para mysql
            Class.forName("com.mysql.jdbc.Driver");
            //abrir conexion
            conn=DriverManager.getConnection(url, user, psw);
        } catch (Exception ex) {
            Logger.getLogger(TestConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public Connection getConnection() {
        return conn;
    }
    
    /*
    //variables
    private static String url="jdbc:mysql://localhost:33061/bdhospital";
    private static String user="root";
    private static String psw=""; 
    private static Connection cn;
    public static Connection abrir(){
        try {
            //registrar drivers para mysql
            Class.forName("com.mysql.jdbc.Driver");
            //abrir conexion
            cn=DriverManager.getConnection(url, user, psw);
        } catch (Exception ex) {
            Logger.getLogger(TestConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }*/
}
