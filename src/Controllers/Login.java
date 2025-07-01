
package Controllers;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Models.User;

public class Login {
    /**
     * 
     * @param user
     * @param password
     * @return Devuelve el objeto User donde concuerdan el user y password introducidos
     */
    public static User login(String user, String password){
        User LoggedUser = null;
        try(Connection conn = ConnectionDB.conectar()){
            String sql = "SELECT * FROM table_user WHERE username=? AND password=?";
            PreparedStatement stmnt = conn.prepareStatement(sql); //transforma la instrucción sql para que lo lea la bdd
            stmnt.setString(1, user);
            stmnt.setString(2, password);
            ResultSet rs = stmnt.executeQuery(); //para que se ejecute el SELECT
            
            if(rs.next()){ //muevo cursor a la 1a y única fila
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String passwrd = rs.getString("password");
                String name = rs.getString("name");
                String email = rs.getString("email");
                
                LoggedUser = new User(id, username, passwrd, name, email);
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return LoggedUser;
    }
}
