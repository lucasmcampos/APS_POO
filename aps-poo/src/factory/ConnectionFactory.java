
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {
    
    public Connection conectaBD () {
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/aps_poo?user=root&password=1234";
            conn = DriverManager.getConnection(url);
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "ConnectionFactory" + erro.getMessage());
        }
            return conn;

    }
}
