
package View;

import Models.User;
import Controllers.UserDAO;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JOptionPane;

public class LoginView extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginView() {
        
        initComponents();
        
        setupErrorLabelAndFocus();
        
        this.setLocationRelativeTo(null);
        
    }
    /**
     * <pre>
     * Método para cambiar el color del label "lbl_errorText" para simular su desaparición al
     * hacer foco en las cajas de texto del LoginView.
     * </pre>
     */
    private void setupErrorLabelAndFocus() {
        // 1. Al iniciar invisible (color fondo)
        lbl_errorText.setForeground(lbl_errorText.getBackground());

        // 3. Cuando se hace foco en cualquiera de los campos, oculta el mensaje
        FocusAdapter focusAdapter = new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                lbl_errorText.setForeground(lbl_errorText.getBackground());
            }
        };
        txt_user.addFocusListener(focusAdapter);
        txt_password.addFocusListener(focusAdapter);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        pnl_princinpal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_joinNow = new javax.swing.JButton();
        lbl_errorText = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desknotes");

        jLabel1.setFont(new java.awt.Font("ISOCT3_IV50", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DeskNotes");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("User");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        txt_user.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondo mosaico v3.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        btn_login.setBackground(new java.awt.Color(78, 130, 255));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login.setText("Login");
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        jLabel6.setText("New in Desknotes?");

        btn_joinNow.setBackground(new java.awt.Color(60, 63, 65));
        btn_joinNow.setForeground(new java.awt.Color(0, 102, 255));
        btn_joinNow.setText("Join now");
        btn_joinNow.setBorder(null);
        btn_joinNow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_joinNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_joinNowActionPerformed(evt);
            }
        });

        lbl_errorText.setForeground(new java.awt.Color(255, 51, 51));
        lbl_errorText.setText("Incorrect user or password");

        jLabel8.setFont(new java.awt.Font("ISOCT3_IV50", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Login");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnl_princinpalLayout = new javax.swing.GroupLayout(pnl_princinpal);
        pnl_princinpal.setLayout(pnl_princinpalLayout);
        pnl_princinpalLayout.setHorizontalGroup(
            pnl_princinpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_princinpalLayout.createSequentialGroup()
                .addGroup(pnl_princinpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_princinpalLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pnl_princinpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_princinpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_princinpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_password)
                                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_princinpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_princinpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_princinpalLayout.createSequentialGroup()
                                        .addComponent(btn_login)
                                        .addGap(45, 45, 45))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_princinpalLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_joinNow)))
                                .addGroup(pnl_princinpalLayout.createSequentialGroup()
                                    .addComponent(lbl_errorText)
                                    .addGap(36, 36, 36)))))
                    .addGroup(pnl_princinpalLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_princinpalLayout.setVerticalGroup(
            pnl_princinpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_princinpalLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnl_princinpalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_errorText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_princinpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btn_joinNow))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_princinpal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_princinpal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String userText = txt_user.getText();
        String passwordText = new String(txt_password.getPassword());
        
        User loggedUser = UserDAO.login(userText, passwordText);
        
        if(loggedUser != null){
            //JOptionPane.showMessageDialog(null, "Welcome " + LoggedUser.getUsername());
            javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new MainPageView(loggedUser).setVisible(true);
                dispose(); //cierro la ventana actual (LoginView)
            }
        });
        }else{
            lbl_errorText.setForeground(Color.RED);
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_joinNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_joinNowActionPerformed
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new RegisterView().setVisible(true);
                lbl_errorText.setForeground(lbl_errorText.getBackground());
            }
        });
    }//GEN-LAST:event_btn_joinNowActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        // para aplicar FlatLaf, asigno un nombre a la ventana
        FlatDarkLaf.setup();
        LoginView ventanaPrincipal = new LoginView();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ventanaPrincipal.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_joinNow;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_errorText;
    private javax.swing.JPanel pnl_princinpal;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
