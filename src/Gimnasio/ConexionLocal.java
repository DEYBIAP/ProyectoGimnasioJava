
package Gimnasio;
import java.sql.*;


public class ConexionLocal {
    public static Connection Conexion (){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_gimnasio", "root", "");
            return cn;
        } catch (SQLException e) {
            System.out.println("No se estableció la conexión local"+ e);
        }
        return(null);
    
    }
}
