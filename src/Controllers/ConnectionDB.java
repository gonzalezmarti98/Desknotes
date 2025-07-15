
package Controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    /**
     * 
     * @return Devuelve la conexión con la bdd que YA tenemos creada
     */
    public static Connection connectWithDB(){
        String host = ConfigReader.get("host");
        String port = ConfigReader.get("port");
        String database = ConfigReader.get("database");
        String user = ConfigReader.get("user");
        String password = ConfigReader.get("password");
        
        String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
        
        try{
            return DriverManager.getConnection(url, user, password);
            
        }catch(SQLException e){
            System.err.println("Connection error: " + e.getMessage());
            return null;
        }
    }
    /**
     * 
     * @return Devuelve la conexión con la bdd que NO tenemos creada
     */
    public static Connection connectWithoutDB(){
        String host = ConfigReader.get("host");
        String port = ConfigReader.get("port");
        String user = ConfigReader.get("user");
        String password = ConfigReader.get("password");
        
        String url = "jdbc:mysql://" + host + ":" + port + "/";
        
        try{
            return DriverManager.getConnection(url, user, password);
            
        }catch(SQLException e){
            System.err.println("Connection error: " + e.getMessage());
            return null;
        }
    }
}
