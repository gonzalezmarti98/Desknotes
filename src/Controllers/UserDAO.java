
package Controllers;

import Models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UserDAO {
    
    /**
     * 
     * @param user
     * @param password
     * @return Devuelve el objeto User donde concuerdan el user y password introducidos
     */
    public static User login(String user, String password){
        User LoggedUser = null;
        String sql = "SELECT * FROM table_user WHERE username=? AND password=?";
        try(Connection conn = ConnectionDB.conectar()){
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
    
    public static boolean newUser(User registeredUser){
        boolean usernameRepeated = repeatedValue("username", registeredUser.getUsername());
        if(usernameRepeated){
            JOptionPane.showMessageDialog(null, "This username is already in use", "Registry failed", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        boolean emailRepeated = repeatedValue("email", registeredUser.getEmail());
        if(emailRepeated){
            JOptionPane.showMessageDialog(null, "This email is already in use", "Registry failed", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        String sql = "INSERT into table_user(username, password, name, email) VALUES(?,?,?,?)";
        try(Connection conn = ConnectionDB.conectar()){
            //transformamos instrucción para que lo pueda leer la bdd y guardamos el nuevo User
            PreparedStatement stmnt = conn.prepareStatement(sql);
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
    
    private static boolean repeatedValue(String columna, String valor){
        String sql = "SELECT COUNT(*) FROM table_user WHERE " + columna + "=?";
        try(Connection conn = ConnectionDB.conectar()){
            PreparedStatement stmt = conn.prepareStatement(sql); //transformamos instrucción para que lo pueda leer la bdd
            stmt.setString(1, valor);
            ResultSet rs = stmt.executeQuery(); //ejecutamos SELECT
            
            if(rs.next()){
                int count = rs.getInt(1);
                if(count > 0){
                    return true;
                }else{
                    return false;
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
