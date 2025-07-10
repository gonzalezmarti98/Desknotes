
package Controllers;

import Models.Note;
import Controllers.ConnectionDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class NoteDAO {
    
    public static void saveNote(Note note){
        String sql = "INSERT INTO table_note(userId, title, content) VALUES(?,?,?)";
        try(Connection conn = ConnectionDB.conectar()){
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, note.getUserId());
            stmt.setString(2, note.getTitle());
            stmt.setString(3, note.getContent());
            stmt.executeUpdate(); // ejecuto el INSERT
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public static String getContent(String title, int userId){
        String sql = "SELECT content FROM table_note WHERE title=? AND userId=?";
        try(Connection conn = ConnectionDB.conectar()){
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, title);
            stmt.setInt(2, userId);
            ResultSet rs = stmt.executeQuery(); //ejecutamos SELECT
            
            if(rs.next()){
                return rs.getString("content");
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return "ERROR loading the content . . .";
    }
    
}
