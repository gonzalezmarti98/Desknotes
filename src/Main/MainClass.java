
package Main;

import Controllers.ConnectionDB;
import java.sql.Connection;
import java.sql.SQLException;

public class MainClass {


    public static void main(String[] args) {
        
        try(Connection con = ConnectionDB.conectar()){
            System.out.println("CONEXIÓN A LA BDD EFECTUADA!");
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
