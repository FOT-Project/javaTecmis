/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Student;

/**
 *
 * @author Hiru
 */
public class UserProfile extends javax.swing.JFrame {

    /**
     * Creates new form UserProfile
     */
    public UserProfile() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backLBL = new javax.swing.JLabel();
        bgImgLBL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        updateProPNL = new javax.swing.JPanel();
        userprofileIconLBL = new javax.swing.JLabel();
        idnoLBL = new javax.swing.JLabel();
        idnoTXT = new javax.swing.JTextField();
        nameLBL = new javax.swing.JLabel();
        emailLBL = new javax.swing.JLabel();
        phoneLBL = new javax.swing.JLabel();
        genderLBL = new javax.swing.JLabel();
        levelLBL = new javax.swing.JLabel();
        nameTXT = new javax.swing.JTextField();
        emailTXT = new javax.swing.JTextField();
        phonrTXT = new javax.swing.JTextField();
        genderTXT = new javax.swing.JTextField();
        levelTXT = new javax.swing.JTextField();
        updateproBTN = new javax.swing.JButton();
        updateProPNL1 = new javax.swing.JPanel();
        userprofileIconLBL1 = new javax.swing.JLabel();
        idnoLBL1 = new javax.swing.JLabel();
        idnoTXT1 = new javax.swing.JTextField();
        nameLBL1 = new javax.swing.JLabel();
        emailLBL1 = new javax.swing.JLabel();
        phoneLBL1 = new javax.swing.JLabel();
        genderLBL1 = new javax.swing.JLabel();
        levelLBL1 = new javax.swing.JLabel();
        nameTXT1 = new javax.swing.JTextField();
        emailTXT1 = new javax.swing.JTextField();
        phonrTXT1 = new javax.swing.JTextField();
        genderTXT1 = new javax.swing.JTextField();
        levelTXT1 = new javax.swing.JTextField();
        updateproBTN1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 750));

        backLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Go Back.png"))); // NOI18N
        backLBL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLBLMouseClicked(evt);
            }
        });

        bgImgLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-profile.jpg"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Iskoola Pota", 1, 48)); // NOI18N
        jLabel1.setText("User Profile");

        updateProPNL.setBackground(new java.awt.Color(245, 245, 245));

        userprofileIconLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Male User.png"))); // NOI18N

        idnoLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        idnoLBL.setForeground(new java.awt.Color(153, 153, 153));
        idnoLBL.setText("ID Number");

        idnoTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        idnoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idnoTXTActionPerformed(evt);
            }
        });

        nameLBL.setBackground(new java.awt.Color(208, 208, 208));
        nameLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        nameLBL.setForeground(new java.awt.Color(153, 153, 153));
        nameLBL.setText("Name");

        emailLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        emailLBL.setForeground(new java.awt.Color(153, 153, 153));
        emailLBL.setText("Email");

        phoneLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        phoneLBL.setForeground(new java.awt.Color(153, 153, 153));
        phoneLBL.setText("Phone No");

        genderLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        genderLBL.setForeground(new java.awt.Color(153, 153, 153));
        genderLBL.setText("Gender");

        levelLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        levelLBL.setForeground(new java.awt.Color(153, 153, 153));
        levelLBL.setText("Level");

        nameTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        nameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTXTActionPerformed(evt);
            }
        });

        emailTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N

        phonrTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N

        genderTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N

        levelTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N

        updateproBTN.setBackground(new java.awt.Color(76, 159, 255));
        updateproBTN.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        updateproBTN.setForeground(new java.awt.Color(255, 255, 255));
        updateproBTN.setText("Update Profile");
        updateproBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout updateProPNLLayout = new javax.swing.GroupLayout(updateProPNL);
        updateProPNL.setLayout(updateProPNLLayout);
        updateProPNLLayout.setHorizontalGroup(
            updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateProPNLLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateproBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(updateProPNLLayout.createSequentialGroup()
                        .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idnoLBL)
                            .addComponent(nameLBL)
                            .addComponent(emailLBL)
                            .addComponent(phoneLBL)
                            .addComponent(genderLBL)
                            .addComponent(levelLBL))
                        .addGap(38, 38, 38)
                        .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idnoTXT)
                            .addComponent(nameTXT)
                            .addComponent(emailTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(phonrTXT)
                            .addComponent(genderTXT)
                            .addComponent(levelTXT))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateProPNLLayout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addComponent(userprofileIconLBL)
                .addGap(220, 220, 220))
        );
        updateProPNLLayout.setVerticalGroup(
            updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateProPNLLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(userprofileIconLBL)
                .addGap(18, 18, 18)
                .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idnoLBL)
                    .addComponent(idnoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLBL)
                    .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLBL)
                    .addComponent(emailTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLBL)
                    .addComponent(phonrTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLBL)
                    .addComponent(genderTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLBL)
                    .addComponent(levelTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(updateproBTN)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        updateProPNL1.setBackground(new java.awt.Color(245, 245, 245));

        userprofileIconLBL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Male User.png"))); // NOI18N

        idnoLBL1.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        idnoLBL1.setForeground(new java.awt.Color(153, 153, 153));
        idnoLBL1.setText("ID Number");

        idnoTXT1.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        idnoTXT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idnoTXT1ActionPerformed(evt);
            }
        });

        nameLBL1.setBackground(new java.awt.Color(208, 208, 208));
        nameLBL1.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        nameLBL1.setForeground(new java.awt.Color(153, 153, 153));
        nameLBL1.setText("Name");

        emailLBL1.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        emailLBL1.setForeground(new java.awt.Color(153, 153, 153));
        emailLBL1.setText("Email");

        phoneLBL1.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        phoneLBL1.setForeground(new java.awt.Color(153, 153, 153));
        phoneLBL1.setText("Phone No");

        genderLBL1.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        genderLBL1.setForeground(new java.awt.Color(153, 153, 153));
        genderLBL1.setText("Gender");

        levelLBL1.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        levelLBL1.setForeground(new java.awt.Color(153, 153, 153));
        levelLBL1.setText("Level");

        nameTXT1.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        nameTXT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTXT1ActionPerformed(evt);
            }
        });

        emailTXT1.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N

        phonrTXT1.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N

        genderTXT1.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N

        levelTXT1.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N

        updateproBTN1.setBackground(new java.awt.Color(76, 159, 255));
        updateproBTN1.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        updateproBTN1.setForeground(new java.awt.Color(255, 255, 255));
        updateproBTN1.setText("Update Profile");
        updateproBTN1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout updateProPNL1Layout = new javax.swing.GroupLayout(updateProPNL1);
        updateProPNL1.setLayout(updateProPNL1Layout);
        updateProPNL1Layout.setHorizontalGroup(
            updateProPNL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateProPNL1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(updateProPNL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateproBTN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(updateProPNL1Layout.createSequentialGroup()
                        .addGroup(updateProPNL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idnoLBL1)
                            .addComponent(nameLBL1)
                            .addComponent(emailLBL1)
                            .addComponent(phoneLBL1)
                            .addComponent(genderLBL1)
                            .addComponent(levelLBL1))
                        .addGap(38, 38, 38)
                        .addGroup(updateProPNL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idnoTXT1)
                            .addComponent(nameTXT1)
                            .addComponent(emailTXT1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(phonrTXT1)
                            .addComponent(genderTXT1)
                            .addComponent(levelTXT1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateProPNL1Layout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addComponent(userprofileIconLBL1)
                .addGap(220, 220, 220))
        );
        updateProPNL1Layout.setVerticalGroup(
            updateProPNL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateProPNL1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(userprofileIconLBL1)
                .addGap(18, 18, 18)
                .addGroup(updateProPNL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idnoLBL1)
                    .addComponent(idnoTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(updateProPNL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLBL1)
                    .addComponent(nameTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(updateProPNL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLBL1)
                    .addComponent(emailTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(updateProPNL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLBL1)
                    .addComponent(phonrTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(updateProPNL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLBL1)
                    .addComponent(genderTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(updateProPNL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLBL1)
                    .addComponent(levelTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(updateproBTN1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLBL)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addComponent(bgImgLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateProPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateProPNL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backLBL)
                                .addGap(26, 26, 26)))
                        .addGap(32, 32, 32)
                        .addComponent(bgImgLBL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(updateProPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(updateProPNL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idnoTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idnoTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idnoTXTActionPerformed

    private void nameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTXTActionPerformed

    private void idnoTXT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idnoTXT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idnoTXT1ActionPerformed

    private void nameTXT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTXT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTXT1ActionPerformed

    private void backLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLBLMouseClicked
        Dashboard userDb = new Dashboard();
        userDb.show();
        dispose();
    }//GEN-LAST:event_backLBLMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLBL;
    private javax.swing.JLabel bgImgLBL;
    private javax.swing.JLabel emailLBL;
    private javax.swing.JLabel emailLBL1;
    private javax.swing.JTextField emailTXT;
    private javax.swing.JTextField emailTXT1;
    private javax.swing.JLabel genderLBL;
    private javax.swing.JLabel genderLBL1;
    private javax.swing.JTextField genderTXT;
    private javax.swing.JTextField genderTXT1;
    private javax.swing.JLabel idnoLBL;
    private javax.swing.JLabel idnoLBL1;
    private javax.swing.JTextField idnoTXT;
    private javax.swing.JTextField idnoTXT1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel levelLBL;
    private javax.swing.JLabel levelLBL1;
    private javax.swing.JTextField levelTXT;
    private javax.swing.JTextField levelTXT1;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JLabel nameLBL1;
    private javax.swing.JTextField nameTXT;
    private javax.swing.JTextField nameTXT1;
    private javax.swing.JLabel phoneLBL;
    private javax.swing.JLabel phoneLBL1;
    private javax.swing.JTextField phonrTXT;
    private javax.swing.JTextField phonrTXT1;
    private javax.swing.JPanel updateProPNL;
    private javax.swing.JPanel updateProPNL1;
    private javax.swing.JButton updateproBTN;
    private javax.swing.JButton updateproBTN1;
    private javax.swing.JLabel userprofileIconLBL;
    private javax.swing.JLabel userprofileIconLBL1;
    // End of variables declaration//GEN-END:variables
}