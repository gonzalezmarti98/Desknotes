
package Models;

public class Note {
    
    private int id;
    private int userId;
    private String title;
    private String content;
    
    public Note(){}
    
    public Note(int id, int userId, String title, String content){
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.content = content;
    }
    
    // constructor sin id ---> El id se asigna con AUTO INCREMENT en la bdd
    public Note(int userId, String title, String content){
        this.userId = userId;
        this.title = title;
        this.content = content;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getUserId(){
        return userId;
    }
    
    public void setUserId(int userId){
        this.userId = userId;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    @Override
    public String toString(){
        return getTitle(); //solo el título porque es lo único que quiero mostrar luego en un JList
    }
}
