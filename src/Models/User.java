
package Models;

import java.util.ArrayList;
import java.util.List;

public class User {
    
    private int id;
    private String username;
    private String password;
    private String name;
    private String email;
    
    private List<Note> noteList = new ArrayList<>();
    // no estará en la tabla de la BDR
    // no la ponemos en el constructor pq no la queremos al crear un User
    
    public User(){}
    
    
    public User(int id, String username, String password, String name, String email){
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }
    //constructor sin id ---> para nuevos registros. El id se asigna con AUTO INCREMENT en la bdd
    public User(String username, String password, String name, String email){
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public List<Note> getNoteList(){
        return noteList;
    }
    
    public void setNoteList(List<Note> noteList){
        this.noteList = noteList;
    }
    
    @Override
    public String toString(){
        return "Username: " + getUsername() +
                "\nName: " + getName() +
                "\nemail: " + getEmail();
    }
}
