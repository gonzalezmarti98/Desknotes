
package Controllers;

import Models.Note;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class NoteDAO {
    
    public static void saveNote(Note note){
        String sql = "INSERT INTO table_note(userId, title, content) VALUES(?,?,?)";
        try(Connection conn = ConnectionDB.connectWithDB()){
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
        try(Connection conn = ConnectionDB.connectWithDB()){
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
        return "❌ ERROR loading the content . . .";
    }
    
    public static void deleteNote(String title, int id){
        String sql = "DELETE FROM table_note WHERE title=? AND id=?";
        try(Connection conn = ConnectionDB.connectWithDB()){
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, title);
            stmt.setInt(2, id);
            stmt.executeUpdate(); //ejecutamos DELETE
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static int getIdfromTitle(String title){
        String sql = "SELECT id FROM table_note WHERE title=?";
        try(Connection conn = ConnectionDB.connectWithDB()){
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, title);
            ResultSet rs = stmt.executeQuery(); //ejecutamos SELECT
            
            if(rs.next()){
                return rs.getInt("id");
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return -1;
    }
    
    public static boolean repeatedTitle(String title){
        String sql = "SELECT title FROM table_note WHERE title=?";
        try(Connection conn = ConnectionDB.connectWithDB()){
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, title);
            ResultSet rs = stmt.executeQuery(); //ejecutamos SELECT
            
            if(rs.next()){
                return true;
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    public static void saveEditNote(String title, String content){
        String sql = "UPDATE table_note SET content=? WHERE title=?";
        try(Connection conn = ConnectionDB.connectWithDB()){
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, content);
            stmt.setString(2, title);
            stmt.executeUpdate(); //ejecutamos UPDATE
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
