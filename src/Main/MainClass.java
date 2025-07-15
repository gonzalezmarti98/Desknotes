
package Main;

import Controllers.UserDAO;
import View.*;
import com.formdev.flatlaf.FlatDarkLaf;

public class MainClass {


    public static void main(String[] args) {
        
        FlatDarkLaf.setup(); // añado FlatLaf (tema de Swing)
        
        UserDAO.createDataBase();
        
        // invoco LoginView
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }
}
