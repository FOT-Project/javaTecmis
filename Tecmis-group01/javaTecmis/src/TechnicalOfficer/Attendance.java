/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TechnicalOfficer;

import Alerts.Failed_Alert;
import DBConn.DB;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rashmika
 */
public class Attendance extends javax.swing.JFrame {

    /**
     * Creates new form Attendance
     */
//    public Attendance() {
//        initComponents();
//        setExtendedState(MAXIMIZED_BOTH);
//    }
    
    String StudentId;
    String SubjectId;

    Attendance(String StudentId, String SubjectId) {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        
        this.StudentId = StudentId;
        this.SubjectId = SubjectId;
        
        DB db = new DB();
        db.getconnect();
        
        try{
    
             if (SubjectId.equals("ICT1143")){
                String sql = "select subject.sub_id, attendance_2023_ICT1143.attendance from subject JOIN attendance_2023_ICT1143 where subject.sub_id = 'ICT1143' and attendance_2023_ICT1143.s_id = '"+StudentId+"'";
                System.out.println(sql);
                
                ResultSet result = db.stm.executeQuery(sql);
                System.out.println(result);
                
                if(result.next()){
                    SubjectId = result.getString("sub_id");
                    String Attendance = result.getString("attendance");
                
                    subId.setText(SubjectId);
                    attend.setText(Attendance);
                
                }
                
            }
             
            else if(SubjectId.equals("ENG1114")){
                String sql = "select subject.sub_id, attendance_2023_ENG1114.attendance from subject JOIN attendance_2023_ENG1114 where subject.sub_id = 'ENG1114' and attendance_2023_ENG1114.s_id = '"+StudentId+"'";
                System.out.println(sql);
                
                ResultSet result = db.stm.executeQuery(sql);
                System.out.println(result);
                
                if(result.next()){
                    SubjectId = result.getString("sub_id");
                    String Attendance = result.getString("attendance");
                
                    subId.setText(SubjectId);
                    attend.setText(Attendance);
                
                }
                
            }
             
            else if(SubjectId.equals("ICT1113")){
                String sql = "select subject.sub_id, attendance_2023_ICT1113.attendance from subject JOIN attendance_2023_ICT1113 where subject.sub_id = 'ICT1113' and attendance_2023_ICT1113.s_id = '"+StudentId+"'";
                System.out.println(sql);
                
                ResultSet result = db.stm.executeQuery(sql);
                System.out.println(result);
                
                if(result.next()){
                    SubjectId = result.getString("sub_id");
                    String Attendance = result.getString("attendance");
                
                    subId.setText(SubjectId);
                    attend.setText(Attendance);
                
                }
                
            }
             
            else if(SubjectId.equals("ICT1123")){
                String sql = "select subject.sub_id, attendance_2023_ICT1123.attendance from subject JOIN attendance_2023_ICT1123 where subject.sub_id = 'ICT1123' and attendance_2023_ICT1123.s_id = '"+StudentId+"'";
                System.out.println(sql);
                
                ResultSet result = db.stm.executeQuery(sql);
                System.out.println(result);
                
                if(result.next()){
                    SubjectId = result.getString("sub_id");
                    String Attendance = result.getString("attendance");
                
                    subId.setText(SubjectId);
                    attend.setText(Attendance);
                
                }
                
            }
            
            else if(SubjectId.equals("ICT1133")){
                String sql = "select subject.sub_id, attendance_2023_ICT1133.attendance from subject JOIN attendance_2023_ICT1133 where subject.sub_id = 'ICT1133' and attendance_2023_ICT1133.s_id = '"+StudentId+"'";
                System.out.println(sql);
                
                ResultSet result = db.stm.executeQuery(sql);
                System.out.println(result);
                
                if(result.next()){
                    SubjectId = result.getString("sub_id");
                    String Attendance = result.getString("attendance");
                
                    subId.setText(SubjectId);
                    attend.setText(Attendance);
                
                }
                
            }
             
            else if(SubjectId.equals("TMS1113")){
                String sql = "select subject.sub_id, attendance_2023_TMS1113.attendance from subject JOIN attendance_2023_TMS1113 where subject.sub_id = 'TMS1113' and attendance_2023_TMS1113.s_id = '"+StudentId+"'";
                System.out.println(sql);
                
                ResultSet result = db.stm.executeQuery(sql);
                System.out.println(result);
                
                if(result.next()){
                    SubjectId = result.getString("sub_id");
                    String Attendance = result.getString("attendance");
                
                    subId.setText(SubjectId);
                    attend.setText(Attendance);
                
                }
                
            }
            
            else{
                Failed_Alert failed = new Failed_Alert();
                failed.show();
            }
            
        }catch(SQLException ex){
                        System.out.println(ex);

            Failed_Alert failed = new Failed_Alert();
            failed.show();
            
            
                
        }
    }

    private Attendance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        subId = new javax.swing.JLabel();
        attend = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Iskoola Pota", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Attendance");
        jLabel2.setAlignmentX(338.0F);
        jLabel2.setAlignmentY(32.0F);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(347, 76));

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));
        jPanel3.setAlignmentX(184.0F);
        jPanel3.setAlignmentY(173.0F);
        jPanel3.setPreferredSize(new java.awt.Dimension(645, 451));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Subject ID");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Attendance");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        subId.setBackground(new java.awt.Color(255, 255, 255));
        subId.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        subId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subId.setText("ICT1212");
        subId.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        attend.setBackground(new java.awt.Color(255, 255, 255));
        attend.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        attend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attend.setText("15");
        attend.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(subId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(attend, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subId)
                    .addComponent(attend))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Go Back.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 306, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(520, 520, 520))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        Officer_Find_Attendance FindAttendance = new Officer_Find_Attendance();
        FindAttendance.show();
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel subId;
    // End of variables declaration//GEN-END:variables
}
