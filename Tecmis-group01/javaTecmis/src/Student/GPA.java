/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Student;

import java.sql.Connection;
import DBConn.DBconn;
import java.sql.PreparedStatement;

/**
 *
 * @author Hiru
 */
public class GPA extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    /**
     * Creates new form GPA
     */
    public GPA() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        
        conn = DBconn.connect();
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
        gpaLBL = new javax.swing.JLabel();
        gpaIconLBL = new javax.swing.JLabel();
        framePNL = new javax.swing.JPanel();
        stuIdLBL = new javax.swing.JLabel();
        stuIdTXT = new javax.swing.JTextField();
        depLBL = new javax.swing.JLabel();
        depTXT = new javax.swing.JTextField();
        courseLBL = new javax.swing.JLabel();
        courseTXT = new javax.swing.JTextField();
        gpaValLBL = new javax.swing.JLabel();
        gpaValTXT = new javax.swing.JTextField();
        clsLBL = new javax.swing.JLabel();
        clsTXT = new javax.swing.JTextField();

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

        gpaLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 48)); // NOI18N
        gpaLBL.setText("Grade Point Average");

        gpaIconLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Prize.png"))); // NOI18N

        framePNL.setBackground(new java.awt.Color(245, 245, 245));

        stuIdLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        stuIdLBL.setForeground(new java.awt.Color(153, 153, 153));
        stuIdLBL.setText("Student ID");

        stuIdTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N

        depLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        depLBL.setForeground(new java.awt.Color(153, 153, 153));
        depLBL.setText("Department");

        depTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N

        courseLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        courseLBL.setForeground(new java.awt.Color(153, 153, 153));
        courseLBL.setText("Course Name");

        courseTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N

        gpaValLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        gpaValLBL.setForeground(new java.awt.Color(153, 153, 153));
        gpaValLBL.setText("GPA Value");

        gpaValTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N

        clsLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        clsLBL.setForeground(new java.awt.Color(153, 153, 153));
        clsLBL.setText("Class");

        clsTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N

        javax.swing.GroupLayout framePNLLayout = new javax.swing.GroupLayout(framePNL);
        framePNL.setLayout(framePNLLayout);
        framePNLLayout.setHorizontalGroup(
            framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framePNLLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stuIdLBL)
                    .addComponent(depLBL)
                    .addComponent(courseLBL)
                    .addComponent(gpaValLBL)
                    .addComponent(clsLBL))
                .addGap(66, 66, 66)
                .addGroup(framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stuIdTXT)
                    .addComponent(depTXT)
                    .addComponent(courseTXT)
                    .addComponent(gpaValTXT)
                    .addComponent(clsTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
                .addGap(107, 107, 107))
        );
        framePNLLayout.setVerticalGroup(
            framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framePNLLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stuIdLBL)
                    .addComponent(stuIdTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depLBL)
                    .addComponent(depTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseLBL)
                    .addComponent(courseTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpaValLBL)
                    .addComponent(gpaValTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clsLBL)
                    .addComponent(clsTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(gpaIconLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(516, 516, 516))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLBL)
                        .addGap(391, 391, 391)
                        .addComponent(gpaLBL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(framePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLBL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(gpaLBL)))
                .addGap(16, 16, 16)
                .addComponent(gpaIconLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(framePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLBLMouseClicked
        Dashboard gpaDb = new Dashboard();
        gpaDb.show();
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
            java.util.logging.Logger.getLogger(GPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GPA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLBL;
    private javax.swing.JLabel clsLBL;
    private javax.swing.JTextField clsTXT;
    private javax.swing.JLabel courseLBL;
    private javax.swing.JTextField courseTXT;
    private javax.swing.JLabel depLBL;
    private javax.swing.JTextField depTXT;
    private javax.swing.JPanel framePNL;
    private javax.swing.JLabel gpaIconLBL;
    private javax.swing.JLabel gpaLBL;
    private javax.swing.JLabel gpaValLBL;
    private javax.swing.JTextField gpaValTXT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel stuIdLBL;
    private javax.swing.JTextField stuIdTXT;
    // End of variables declaration//GEN-END:variables
}