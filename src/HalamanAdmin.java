
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class HalamanAdmin extends javax.swing.JFrame {

    /**
     * Creates new form HalamanAdmin
     */
    String gender;
    public HalamanAdmin() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        tampilkanData();
        addPlaceholderStyle(namaJT);
        addPlaceholderStyle(prodiJT);
        addPlaceholderStyle(noTelponJT);
        addPlaceholderStyle(npmJT);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchJT = new javax.swing.JTextField();
        searchJB = new javax.swing.JButton();
        logoutJB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        namaJT = new javax.swing.JTextField();
        tambahJB = new javax.swing.JButton();
        editJB = new javax.swing.JButton();
        deleteJB = new javax.swing.JButton();
        prodiJT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pria = new javax.swing.JRadioButton();
        wanita = new javax.swing.JRadioButton();
        tanggalJD = new com.toedter.calendar.JDateChooser();
        noTelponJT = new javax.swing.JTextField();
        npmJT = new javax.swing.JTextField();
        refreashJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/logo2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tampilkan Data Mahasiswa");

        searchJT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchJT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        searchJB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchJB.setText("SEARCH");
        searchJB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        logoutJB.setBackground(new java.awt.Color(255, 51, 0));
        logoutJB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutJB.setForeground(new java.awt.Color(255, 255, 255));
        logoutJB.setText("LOGOUT");
        logoutJB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(logoutJB, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(searchJT, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(searchJB, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchJT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(searchJB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutJB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("WELCOME TO UNIVERSITAS Y");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Manage your students");

        tabelData.setBackground(new java.awt.Color(0, 153, 153));
        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelData);

        namaJT.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        namaJT.setText("Nama Siswa");
        namaJT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namaJTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                namaJTFocusLost(evt);
            }
        });

        tambahJB.setBackground(new java.awt.Color(0, 153, 153));
        tambahJB.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tambahJB.setForeground(new java.awt.Color(255, 255, 255));
        tambahJB.setText("Tambah Mahasiswa");
        tambahJB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tambahJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahJBActionPerformed(evt);
            }
        });

        editJB.setBackground(new java.awt.Color(0, 153, 153));
        editJB.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        editJB.setForeground(new java.awt.Color(255, 255, 255));
        editJB.setText("Edit Mahasiswa");
        editJB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJBActionPerformed(evt);
            }
        });

        deleteJB.setBackground(new java.awt.Color(0, 153, 153));
        deleteJB.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        deleteJB.setForeground(new java.awt.Color(255, 255, 255));
        deleteJB.setText("Dalate Mahasiswa");
        deleteJB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJBActionPerformed(evt);
            }
        });

        prodiJT.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        prodiJT.setText("Prodi");
        prodiJT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                prodiJTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                prodiJTFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Jenis Kelamin");

        pria.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(pria);
        pria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pria.setText("Pria");
        pria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priaActionPerformed(evt);
            }
        });

        wanita.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(wanita);
        wanita.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        wanita.setText("Wanita");
        wanita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wanitaActionPerformed(evt);
            }
        });

        noTelponJT.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        noTelponJT.setText("Nomer Telpon");
        noTelponJT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                noTelponJTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                noTelponJTFocusLost(evt);
            }
        });

        npmJT.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        npmJT.setText("NPM");
        npmJT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                npmJTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                npmJTFocusLost(evt);
            }
        });

        refreashJB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        refreashJB.setText("Refresh");
        refreashJB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreashJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreashJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(220, 220, 220))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(72, 72, 72)
                                                .addComponent(pria)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(wanita))
                                            .addComponent(namaJT)
                                            .addComponent(prodiJT)
                                            .addComponent(tanggalJD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(noTelponJT, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                                            .addComponent(npmJT))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tambahJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                                .addComponent(editJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(deleteJB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(refreashJB, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(98, 98, 98))))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(14, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(namaJT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prodiJT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(pria)
                            .addComponent(wanita))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanggalJD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noTelponJT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(npmJT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tambahJB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editJB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteJB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreashJB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void namaJTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaJTFocusGained
        // TODO add your handling code here:
            if (namaJT.getText().equals("Nama Siswa")) {
            namaJT.setText("");
            namaJT.requestFocus();
            removePlaceholderStyle(namaJT);
        }
    }//GEN-LAST:event_namaJTFocusGained

    public void kosongkanForm() {
        namaJT.setText("Nama Siswa");
        prodiJT.setText("Prodi");
        pria.setSelected(false);
        wanita.setSelected(false);
        tanggalJD.setDate(null);
        noTelponJT.setText("Nomer Telpon");
        npmJT.setText("NPM");
    }
    
    private void prodiJTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prodiJTFocusGained
        // TODO add your handling code here:
            if (prodiJT.getText().equals("Prodi")) {
            prodiJT.setText("");
            prodiJT.requestFocus();
            removePlaceholderStyle(prodiJT);
        }
    }//GEN-LAST:event_prodiJTFocusGained

    private void noTelponJTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noTelponJTFocusGained
        // TODO add your handling code here:
            if (noTelponJT.getText().equals("Nomer Telpon")) {
            noTelponJT.setText("");
            noTelponJT.requestFocus();
            removePlaceholderStyle(noTelponJT);
        }
    }//GEN-LAST:event_noTelponJTFocusGained

    private void npmJTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_npmJTFocusGained
        // TODO add your handling code here:
            if (npmJT.getText().equals("NPM")) {
            npmJT.setText("");
            npmJT.requestFocus();
            removePlaceholderStyle(npmJT);
        }
    }//GEN-LAST:event_npmJTFocusGained

    private void namaJTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaJTFocusLost
        // TODO add your handling code here:
        if (namaJT.getText().length() == 0) {
            addPlaceholderStyle(namaJT);
            namaJT.setText("Nama Siswa");
        }
    }//GEN-LAST:event_namaJTFocusLost

    private void prodiJTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prodiJTFocusLost
        // TODO add your handling code here:
        if (prodiJT.getText().length() == 0) {
            addPlaceholderStyle(prodiJT);
            prodiJT.setText("Prodi");
        }
    }//GEN-LAST:event_prodiJTFocusLost

    private void noTelponJTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noTelponJTFocusLost
        // TODO add your handling code here:
        if (noTelponJT.getText().length() == 0) {
            addPlaceholderStyle(noTelponJT);
            noTelponJT.setText("Nomer Telpon");
        }
    }//GEN-LAST:event_noTelponJTFocusLost

    private void npmJTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_npmJTFocusLost
        // TODO add your handling code here:
        if (npmJT.getText().length() == 0) {
            addPlaceholderStyle(npmJT);
            npmJT.setText("NPM");
        }
    }//GEN-LAST:event_npmJTFocusLost

    private void refreashJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreashJBActionPerformed
        // TODO add your handling code here:
        kosongkanForm();
       
    }//GEN-LAST:event_refreashJBActionPerformed

    private void logoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJBActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login();
    }//GEN-LAST:event_logoutJBActionPerformed

    private void tambahJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahJBActionPerformed
        // TODO add your handling code here:
        try {
            String formatDate = "dd-MM-yyyy";
            SimpleDateFormat fm = new SimpleDateFormat(formatDate);
            String date = fm.format(tanggalJD.getDate());
            String sql = "INSERT INTO tabel_siswa VALUES ('" + namaJT.getText() + "','" + prodiJT.getText() + "','"
                    + gender + "','" + date + "','" + noTelponJT.getText() + "','"
                    + npmJT.getText() + "')";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan", "Messsage", JOptionPane.INFORMATION_MESSAGE);
            tampilkanData();
            kosongkanForm();
            // memanggil method sebelumnya untuk menampilkan
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tambahJBActionPerformed

    private void priaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priaActionPerformed
        // TODO add your handling code here:
        gender = "Pria";
    }//GEN-LAST:event_priaActionPerformed

    private void wanitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wanitaActionPerformed
        // TODO add your handling code here:
        gender = "Wanita";
    }//GEN-LAST:event_wanitaActionPerformed

    private void tabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataMouseClicked
        // TODO add your handling code here:
        int baris = tabelData.rowAtPoint(evt.getPoint());
        
        String nama = tabelData.getValueAt(baris, 0).toString();
        namaJT.setText(nama);

        String prodi = tabelData.getValueAt(baris, 1).toString();
        prodiJT.setText(prodi);

//        String jenisKelamin = tabelData.getValueAt(baris, 3).toString();
//        gender = jenisKelamin;

 //       tanggalJD.setDate((Date) tabelData.getValueAt(baris, 4));

        String telpon = tabelData.getValueAt(baris, 4).toString();
        noTelponJT.setText(telpon);

        String npm = tabelData.getValueAt(baris, 5).toString();
        npmJT.setText(npm);
    }//GEN-LAST:event_tabelDataMouseClicked

    private void editJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJBActionPerformed
        // TODO add your handling code here:
        try {
             String formatDate = "dd-MM-yyyy";
            SimpleDateFormat fm = new SimpleDateFormat(formatDate);
            String date = fm.format(tanggalJD.getDate());
           String sql = "UPDATE tabel_siswa SET nama_siswa='" + namaJT.getText() + "',prodi='" + prodiJT.getText() + "',jenis_kelamin='"
                    + gender + "',tanggal_lahir='" + date + "',no_telepon='"
                    + noTelponJT.getText() + "',npm='" + npmJT.getText() + "' WHERE npm = '" + npmJT.getText()
                    + "'";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate", "Messsage", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkanData();
        kosongkanForm();
    }//GEN-LAST:event_editJBActionPerformed

    private void deleteJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJBActionPerformed
        // TODO add your handling code here:
         try {
            String sql = "DELETE FROM tabel_siswa WHERE npm='" + npmJT.getText() + "'";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus data berhasil...");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkanData();
        kosongkanForm();
    }//GEN-LAST:event_deleteJBActionPerformed
   
    public void tampilkanData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama Siswa");
        model.addColumn("Prodi");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Tanggal Lahir");
        model.addColumn("No Telepon");
        model.addColumn("npm");

        // menampilkan data dari database
        try {

            String sql = "SELECT * FROM tabel_siswa";
            java.sql.Connection conn = (Connection) Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {
                model.addRow(new Object[] {res.getString(1), res.getString(2), res.getString(3),
                        res.getString(4), res.getString(5), res.getString(6) });
            }
            tabelData.setModel(model);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton deleteJB;
    private javax.swing.JButton editJB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutJB;
    private javax.swing.JTextField namaJT;
    private javax.swing.JTextField noTelponJT;
    private javax.swing.JTextField npmJT;
    private javax.swing.JRadioButton pria;
    private javax.swing.JTextField prodiJT;
    private javax.swing.JButton refreashJB;
    private javax.swing.JButton searchJB;
    private javax.swing.JTextField searchJT;
    private javax.swing.JTable tabelData;
    private javax.swing.JButton tambahJB;
    private com.toedter.calendar.JDateChooser tanggalJD;
    private javax.swing.JRadioButton wanita;
    // End of variables declaration//GEN-END:variables
}
