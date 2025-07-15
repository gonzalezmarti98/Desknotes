
package Controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    
    private static final String URL = "jdbc:mysql://localhost:3308/desknotes";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection connectWithDB(){
        try{
            return DriverManager.getConnection(URL, USER, PASSWORD);
            
        }catch(SQLException e){
            System.err.println("Connection error: " + e.getMessage());
            return null;
        }
    }
}
