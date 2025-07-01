
package Main;

import Controllers.ConnectionDB;
import java.sql.Connection;
import java.sql.SQLException;
import Controllers.*;
import View.*;
import com.formdev.flatlaf.FlatDarkLaf;

public class MainClass {


    public static void main(String[] args) {
        
        FlatDarkLaf.setup(); // añado FlatLaf (tema de Swing)
        
        // invoco LoginView
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            new LoginView().setVisible(true);
        }
    });
        
        
    }
    
}
