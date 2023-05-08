
package dbprogramming2;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;


public class Dbprogramming2 {

    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "mysql@sit";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection connection = DriverManager.getConnection(URL,username,password);
            System.out.println("Database Connected");
            Statement statement = connection.createStatement();

        
                      
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dbprogramming2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dbprogramming2.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    
}
