/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lecturer;

import Alerts.Failed_Alert;
import Auth.StudentInstance;
import DBConn.DB;
import javax.swing.JFrame;
import java.sql.ResultSet;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
/**
 *
 * @author USER
 */
public class lecturer_see_attendence extends javax.swing.JFrame {

    /**
     * Creates new form lecturer_see_attendence
     */
    
    
//    StudentInstance studentinstance = StudentInstance.getInstance();
//    String user = studentinstance.getUsername();
    //System.out.println(user);

    public lecturer_see_attendence() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        perout = new javax.swing.JLabel();
        subout = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        subid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Iskoola Pota", 1, 64)); // NOI18N
        jLabel1.setText("Attendence");

        jPanel2.setBackground(new java.awt.Color(217, 217, 217));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jLabel2.setText("Subject ID");

        jLabel3.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jLabel3.setText("Percentage");

        jLabel4.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N

        perout.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        perout.setText("......");

        subout.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        subout.setText("......");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(perout)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(138, 138, 138)
                    .addComponent(subout)
                    .addContainerGap(524, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(61, 61, 61)
                .addComponent(perout)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(106, Short.MAX_VALUE)
                    .addComponent(subout)
                    .addGap(98, 98, 98)))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        subid.setBackground(new java.awt.Color(217, 217, 217));
        subid.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jLabel9.setText("Enter Subject ID");

        jButton1.setBackground(new java.awt.Color(76, 159, 255));
        jButton1.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(subid, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel9)
                    .addContainerGap(405, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(jLabel9)
                    .addContainerGap(53, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Go Back.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        lecturer_view_StudentProfile Attenview = new lecturer_view_StudentProfile();
        Attenview.show();
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DB db = new DB();
        db.getconnect();
        
        StudentInstance studentinstance = StudentInstance.getInstance();
        String user = studentinstance.getUsername();
//        String user = "TG/2020/005";
        System.out.println(user);
        
        String subjectid = subid.getText();
        
        try {
            
            if(subjectid.equals("ICT1113")){               
            
                String sql1="Select attendance from attendance_2023_ICT1113 where s_id='"+user+"'AND (type='Theory' OR type='Practical')";
                System.out.println(sql1);            
                ResultSet res1T = db.stm.executeQuery(sql1);
                double attendance1 = 0;
             
            while(res1T.next()){
                Double attendence1 = res1T.getDouble("attendance");
                
                System.out.println(attendence1);                     
                          
                Double att1Tfinal = ((attendence1/15.0)*100.0);
                System.out.println("sub1T"+att1Tfinal);
                String s1T = String.format("%.2f%%",att1Tfinal);
                perout.setText(s1T);
                subout.setText(subjectid);
            }
            }
            
            else if(subjectid.equals("ICT1123")){
            String sub2 ="Select attendance from attendance_2023_ICT1123 where s_id='"+user+"' ";
            ResultSet res2 = db.stm.executeQuery(sub2);
                while(res2.next()){
                   Double att2 = res2.getDouble("attendance");

                   Double att2final = ((att2/15.0)*100.0);
                   System.out.println(subjectid+att2final);
                   String s2 = String.format("%.2f%%",att2final);
                   perout.setText(s2);
                   subout.setText(subjectid);
               }
            }
            else if(subjectid.equals("ICT1114")){
            String sub3="Select attendance from attendance_2023_ENG1114 where s_id='"+user+"' +";
            ResultSet res3 = db.stm.executeQuery(sub3);
                while(res3.next()){
                    Double att3 = res3.getDouble("attendance");

                    Double att3final = ((att3/15.0)*100.0);
                    System.out.println(subjectid+att3final);
                    String s3 = String.format("%.2f%%",att3final);
                    perout.setText(s3);
                    subout.setText(subjectid);
                }
            }
            
            else if(subjectid.equals("TMS1113")){
            String sub4="Select attendance from attendance_2023_TMS1133 where s_id='"+user+"' ";
            ResultSet res4 = db.stm.executeQuery(sub4);
                while(res4.next()){
                    Double att4 = res4.getDouble("attendance");

                    Double att4final = ((att4/15.0)*100.0);
                    System.out.println("sub1T"+att4final);
                    String s4 = String.format("%.2f%%",att4final);
                    perout.setText(s4);
                    subout.setText(subjectid);
                }
            }
            
            else if(subjectid.equals("ICT1133")){
            String sub5="Select attendance from attendance_2023_ICT143 where s_id='"+user+"' AND type='Theory'OR 'Practical'";
            ResultSet res5 = db.stm.executeQuery(sub5);
                while(res5.next()){
                    Double att5 = res5.getDouble("attendance");

                    Double att5final = ((att5/15.0)*100.0);
                    System.out.println("sub1T"+att5final);
                    String s5 = String.format("%.2f%%",att5final);
                    perout.setText(s5);
                    subout.setText(subjectid);
                }
            }
            
            else if(subjectid.equals("ICT1143")){
            String sub6="Select attendance from attendance_2023_ICT1433 where s_id='"+user+"' AND type='Practical'OR 'Theory'";
            ResultSet res6 = db.stm.executeQuery(sub6);
                while(res6.next()){
                    Double att6 = res6.getDouble("attendance");

                    Double att6final = ((att6/15.0)*100.0);
                    System.out.println("sub1T"+att6final);
                    String s6 = String.format("%.2f%%",att6final);
                    jLabel5.setText(s6);
                }
            }
            else {
                Failed_Alert failed = new Failed_Alert();
                failed.show();
            
            }
         
            
        } catch (Exception e) {
            //Failed_Alert failed = new Failed_Alert();
            //failed.show();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(lecturer_see_attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lecturer_see_attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lecturer_see_attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lecturer_see_attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lecturer_see_attendence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel perout;
    private javax.swing.JTextField subid;
    private javax.swing.JLabel subout;
    // End of variables declaration//GEN-END:variables
}