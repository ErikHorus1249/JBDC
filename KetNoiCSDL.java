
package ketnoicsdl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class KetNoiCSDL {

    public static Connection getConnectionJBDC() throws SQLException{
        final String url = "jdbc:mysql://localhost:3306/JDB";
        final String user = "root";
        final String password = "";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KetNoiCSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void main(String[] args) throws SQLException {
//        System.out.println("Done");
        Connection newConn = getConnectionJBDC();
        if(newConn != null){
            System.out.println("Connected");
        }
        else System.out.println("None");
    }
    
}
