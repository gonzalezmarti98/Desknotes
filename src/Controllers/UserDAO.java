
package Controllers;

import Models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    
    public static boolean newUser(User registeredUser){
        String sql = "INSERT into table_user(username, password, name, email) VALUES(?,?,?,?)";
        
        try(Connection conn = ConnectionDB.conectar()){
            PreparedStatement stmnt = conn.prepareStatement(sql); //transformamos instrucción para que lo pueda leer la bdd
            stmnt.setString(1, registeredUser.getUsername());
            stmnt.setString(2, registeredUser.getPassword());
            stmnt.setString(3, registeredUser.getName());
            stmnt.setString(4, registeredUser.getEmail());
            stmnt.executeUpdate(); //para ejecutar DCL (INSERT, DELETE, UPDATE)
            return true;
            
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
