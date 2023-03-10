
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class Register extends javax.swing.JFrame {


    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
    }
    
     public void addPlaceholderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.BLACK);
    }
    
    public void removePlaceholderStyle(JTextField textField) {
        Font font = textField.getFont();
        //font = font.deriveFont(Font.PLAIN|Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        passJP = new javax.swing.JPasswordField();
        selectJC = new javax.swing.JComboBox<>();
        registerJB = new javax.swing.JButton();
        signJL = new javax.swing.JLabel();
        iconJL = new javax.swing.JLabel();
        labelA = new javax.swing.JLabel();
        emailJT = new javax.swing.JTextField();
        labelC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        passJP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passJP.setText("Password");
        passJP.setEchoChar('\u0000');
        passJP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passJPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passJPFocusLost(evt);
            }
        });

        selectJC.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        selectJC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Siswa" }));

        registerJB.setBackground(new java.awt.Color(0, 204, 204));
        registerJB.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        registerJB.setForeground(new java.awt.Color(255, 255, 255));
        registerJB.setText("REGISTRASI NOW!");
        registerJB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        registerJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerJBActionPerformed(evt);
            }
        });

        signJL.setForeground(new java.awt.Color(255, 255, 255));
        signJL.setText("Sudah memiliki akun? Klik di sini untuk Sign in!");
        signJL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signJLMouseClicked(evt);
            }
        });

        iconJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/logo.png"))); // NOI18N

        labelA.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelA.setForeground(new java.awt.Color(255, 255, 255));
        labelA.setText("CREATE YOUR OWN ACCOUNT!");

        emailJT.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        emailJT.setText("Masukan email");
        emailJT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailJTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailJTFocusLost(evt);
            }
        });

        labelC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelC.setForeground(new java.awt.Color(255, 255, 255));
        labelC.setText("Pilih jenis user");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(iconJL, javax.swing.GroupLayout.PREFERRED_SIZE, 277, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelA, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(labelC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectJC, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(registerJB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(signJL, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailJT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passJP, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelA, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(emailJT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(passJP, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectJC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addComponent(registerJB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signJL)
                .addContainerGap(128, Short.MAX_VALUE))
            .addComponent(iconJL, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signJLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signJLMouseClicked
        // TODO add your handling code here:
        new Login();
        this.dispose();
        addPlaceholderStyle(emailJT);
        addPlaceholderStyle(passJP);
    }//GEN-LAST:event_signJLMouseClicked

    private void registerJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerJBActionPerformed

        try {      
            if (passJP.getText().length() <= 8) {
                     JOptionPane.showMessageDialog(null, "Password harus minimal panjang 8", "Messagge", JOptionPane.INFORMATION_MESSAGE);
                     passJP.setText(null);
            }
            String sql = "INSERT INTO data_akun VALUES ('" + emailJT.getText() + "','" + passJP.getText() + "','" + selectJC.getSelectedItem() + "')";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Registreasi Berhasil", "Messagge", JOptionPane.INFORMATION_MESSAGE);
            emailJT.setText(null);
            passJP.setText(null);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Username ini telah digunakan", "Warning", JOptionPane.ERROR_MESSAGE);
            emailJT.setText(null);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_registerJBActionPerformed

    private void emailJTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailJTFocusGained
        // TODO add your handling code here:
        if (emailJT.getText().equals("Masukan email")) {
            emailJT.setText("");
            emailJT.requestFocus();
            removePlaceholderStyle(emailJT);
        }
    }//GEN-LAST:event_emailJTFocusGained

    private void passJPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passJPFocusGained
        // TODO add your handling code here:
        if (passJP.getText().equals("Password")) {
            passJP.setText("");
            passJP.requestFocus();
            passJP.setEchoChar('*');
            removePlaceholderStyle(passJP);
        }
    }//GEN-LAST:event_passJPFocusGained

    private void emailJTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailJTFocusLost
        // TODO add your handling code here:
        if (emailJT.getText().length() == 0) {
            addPlaceholderStyle(emailJT);
            emailJT.setText("Masukan email");
        }
    }//GEN-LAST:event_emailJTFocusLost

    private void passJPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passJPFocusLost
        // TODO add your handling code here:
        if (passJP.getText().length() == 0) {
            addPlaceholderStyle(passJP);
            passJP.setText("Password");
             passJP.setEchoChar((char)0);
        }
    }//GEN-LAST:event_passJPFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailJT;
    private javax.swing.JLabel iconJL;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelA;
    private javax.swing.JLabel labelC;
    private javax.swing.JPasswordField passJP;
    private javax.swing.JButton registerJB;
    private javax.swing.JComboBox<String> selectJC;
    private javax.swing.JLabel signJL;
    // End of variables declaration//GEN-END:variables
}
