/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lecturer;

import Alerts.Failed_Alert;
import Auth.Auth;
import Auth.StudentInstance;
import DBConn.DB;
import Student.Dashboard;
import calculateGPA.CalGPA;
import calculateGPA.LecGPA;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class lecturer_see_GPA extends javax.swing.JFrame {
    
   
    /**
     * Creates new form lecturer_see_GPA
     */
    public lecturer_see_GPA() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        StudentInstance studentusername = StudentInstance.getInstance();
        String user = studentusername.getUsername();
        System.out.println(studentusername);
        
        DB db = new DB();
        db.getconnect();
        
        jLabel9.setText(user);
        
        LecGPA cal = new LecGPA();
        
        double sub1gpv = cal.firstSub(); 
        double sub2gpv = cal.secondSub();
        double sub3gpv = cal.thirdSub();
        double sub4gpv = cal.fourthSub();
        double sub5gpv = cal.fifthSub();
        double sub6gpv = cal.sixthSub();
        
        double finalGpa = ((sub1gpv*3) + (sub2gpv*3) + (sub3gpv*3) + (sub4gpv*3) + (sub5gpv*4) + (sub6gpv*3))/19;
        DecimalFormat df = new DecimalFormat("0.00");
        jLabel13.setText(df.format(finalGpa));
        
        if(finalGpa >= 3.7 ){
            jLabel16.setText("First Class");
        }
        else if(finalGpa >= 3.3 && finalGpa < 3.69){
            jLabel16.setText("Upper Second Class");
        }
        else if(finalGpa >= 3.0 && finalGpa < 3.29){
            jLabel16.setText("Lower Second Class");
        }
        else if(finalGpa >= 2.0 && finalGpa < 2.99){
            jLabel16.setText("Third Class");
        }
        else{
             jLabel16.setText("Fail");
        }

        String mysql = "select users.user_id, department.dep_name, course.c_name, users.gpa from ((users inner join department on department.dep_id = users.dep_id) inner join course on course.c_id = users.c_id) where users.user_id = '"+user+"'";
        
        try {

           ResultSet res = db.stm.executeQuery(mysql);
           
            if(res.next()){            
                String depname = res.getString("dep_name");
                String cname = res.getString("c_name");
                //String class = res.getString();
               
                jLabel10.setText(depname);
                jLabel15.setText(cname);
                
              
//              gpaTxtLBL.setText(String.valueOf(cal.finalGPA));
       
//                classTxtLBL.setText();
                System.out.println(user);
                System.out.println(finalGpa);
                System.out.println(depname);
                System.out.println(cname);

            }else{
                System.out.println("fail 1");
               Failed_Alert failed = new Failed_Alert();
               failed.show();
            }
            
        } catch (SQLException e) {
           System.out.println(e);
                           System.out.println("fail 2");

            Failed_Alert failed = new Failed_Alert();
            failed.show();
            
            failed.addWindowListener(new WindowAdapter() {
            @Override
                
            public void windowClosed(WindowEvent e) {
                Dashboard db = new Dashboard();
                db.show();
                dispose();
            }
            });
        }
        
//        String mysql = "select users.user_id, department.dep_name, course.c_name, users.gpa from ((users inner join department on department.dep_id = users.dep_id) inner join course on course.c_id = users.c_id) where users.user_id = '"+user+"'";
//        try {
//            ResultSet res = db.stm.executeQuery(mysql);
//             if(res.next()){            
//                String depname = res.getString("dep_name");
//                String cname = res.getString("c_name");
//                float gpa = res.getFloat("gpa");
//                //String class = res.getString();
//                jLabel9.setText(user);
//                jLabel10.setText(depname);
//                jLabel11.setText(cname);
//                jLabel13.setText(String.valueOf(gpa));
//                //classTxtLBL.setText();
//             
//                
//                }else{
//               Failed_Alert failed = new Failed_Alert();
//               failed.show();
//            }
//
//            
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//        }

       
            
    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblstuid = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lbldep = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblgpa = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbldep1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lblgpa1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Iskoola Pota", 1, 48)); // NOI18N
        jLabel1.setText("Grade Point Average");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Go Back.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Prize.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Student ID ");

        jLabel3.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Department");

        jLabel4.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Course Name");

        jLabel6.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("GPA");

        lblstuid.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Iskoola Pota", 0, 20)); // NOI18N

        javax.swing.GroupLayout lblstuidLayout = new javax.swing.GroupLayout(lblstuid);
        lblstuid.setLayout(lblstuidLayout);
        lblstuidLayout.setHorizontalGroup(
            lblstuidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblstuidLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblstuidLayout.setVerticalGroup(
            lblstuidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblstuidLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        lbldep.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Iskoola Pota", 0, 20)); // NOI18N

        javax.swing.GroupLayout lbldepLayout = new javax.swing.GroupLayout(lbldep);
        lbldep.setLayout(lbldepLayout);
        lbldepLayout.setHorizontalGroup(
            lbldepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbldepLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        lbldepLayout.setVerticalGroup(
            lbldepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbldepLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 41, Short.MAX_VALUE))
        );

        lblgpa.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Iskoola Pota", 0, 20)); // NOI18N

        javax.swing.GroupLayout lblgpaLayout = new javax.swing.GroupLayout(lblgpa);
        lblgpa.setLayout(lblgpaLayout);
        lblgpaLayout.setHorizontalGroup(
            lblgpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblgpaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(421, Short.MAX_VALUE))
        );
        lblgpaLayout.setVerticalGroup(
            lblgpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblgpaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Grade");

        lbldep1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Iskoola Pota", 0, 20)); // NOI18N

        javax.swing.GroupLayout lbldep1Layout = new javax.swing.GroupLayout(lbldep1);
        lbldep1.setLayout(lbldep1Layout);
        lbldep1Layout.setHorizontalGroup(
            lbldep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbldep1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        lbldep1Layout.setVerticalGroup(
            lbldep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbldep1Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        lblgpa1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Iskoola Pota", 0, 20)); // NOI18N

        javax.swing.GroupLayout lblgpa1Layout = new javax.swing.GroupLayout(lblgpa1);
        lblgpa1.setLayout(lblgpa1Layout);
        lblgpa1Layout.setHorizontalGroup(
            lblgpa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblgpa1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblgpa1Layout.setVerticalGroup(
            lblgpa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblgpa1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12)))
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldep1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbldep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblgpa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblstuid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblgpa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblstuid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lbldep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(lbldep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblgpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(lblgpa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        lecturer_examinations GPA = new lecturer_examinations();
        GPA.show();
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(lecturer_see_GPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lecturer_see_GPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lecturer_see_GPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lecturer_see_GPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new lecturer_see_GPA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel lbldep;
    private javax.swing.JPanel lbldep1;
    private javax.swing.JPanel lblgpa;
    private javax.swing.JPanel lblgpa1;
    private javax.swing.JPanel lblstuid;
    // End of variables declaration//GEN-END:variables
}
