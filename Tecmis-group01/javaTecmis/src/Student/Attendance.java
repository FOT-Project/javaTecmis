/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Student;

import Alerts.Failed_Alert;
import Auth.Auth;
import DBConn.DB;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hiru
 */
public class Attendance extends javax.swing.JFrame {
    /**
     * Creates new form Attendance
     */
    
    private String username;
     Attendance() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); 
        
        Auth auth = Auth.getInstance();
        username = auth.getUsername();
        
        DB db = new DB();
        db.getconnect();
 
        try {
            
            String sub1T = "SELECT attendance FROM attendance_2023_ICT1113 WHERE s_id = '"+username+"' AND type = 'Theory'";
            ResultSet res1T = db.stm.executeQuery(sub1T);
            int attendance1T = 0;
            if (res1T.next()) {
            attendance1T = res1T.getInt("attendanc");
            }
            System.out.println(attendance1T);
            
            String sub1P = "SELECT attendance FROM attendance_2023_ICT1113 WHERE s_id = '"+username+"' AND type = 'Practical'";
            ResultSet res1P = db.stm.executeQuery(sub1P);
            int attendance1P = 0;
            if (res1P.next()) {
            attendance1P = res1P.getInt("attendance");
}
            System.out.println(attendance1P);

               Double sumAtt1 = (double)attendance1T + (double)attendance1P;
               Double att1Tfinal = ((sumAtt1/30)*100);
               String s1 =  String.format("%.2f%%",att1Tfinal);
               s1LBL.setText(s1);
               System.out.println(s1);
            
        
            String sub2 = "SELECT attendance FROM attendance_2023_ICT1123 WHERE s_id = '"+username+"'";
            ResultSet res2 = db.stm.executeQuery(sub2);
            while(res2.next()){
                Double att2 = res2.getDouble("attendance");
              //  System.out.println(att2);
                
                Double att2final = ((att2/15)*100);
                System.out.println("sub2 "+att2final);
                String s2 =  String.format("%.2f%%",att2final);
                s2LBL.setText(s2);
            } 
            
            
            String sub3T = "SELECT attendance FROM attendance_2023_ICT1133 WHERE s_id = '"+username+"' AND type = 'Theory'";
            ResultSet res3T = db.stm.executeQuery(sub3T);
            int attendance3T = 0;
            if (res3T.next()) {
            attendance3T = res3T.getInt("attendance");
            }
            System.out.println(attendance3T);
            
            String sub3P = "SELECT attendance FROM attendance_2023_ICT1133 WHERE s_id = '"+username+"' AND type = 'Practical'";
            ResultSet res3P = db.stm.executeQuery(sub3P);
            int attendance3P = 0;
            if (res3P.next()) {
            attendance3P = res3P.getInt("attendance");
}
            System.out.println(attendance3P);

               Double sumAtt3 = (double)attendance3T + (double)attendance3P;
               Double att3Tfinal = ((sumAtt3/30)*100);
               String s3 =  String.format("%.2f%%",att3Tfinal);
               s3LBL.setText(s3);
               System.out.println(s3);

              
            String sub4T = "SELECT attendance FROM attendance_2023_ICT1143 WHERE s_id = '"+username+"' AND type = 'Theory'";
            ResultSet res4T = db.stm.executeQuery(sub4T);
            int attendance4T = 0;
            if (res4T.next()) {
            attendance4T = res4T.getInt("attendance");
            }
            System.out.println(attendance4T);
            
            String sub4P = "SELECT attendance FROM attendance_2023_ICT1143 WHERE s_id = '"+username+"' AND type = 'Practical'";
            ResultSet res4P = db.stm.executeQuery(sub4P);
            int attendance4P = 0;
            if (res4P.next()) {
            attendance4P = res4P.getInt("attendance");
}
            System.out.println(attendance4P);

               Double sumAtt4 = (double)attendance4T + (double)attendance4P;
               Double att4Tfinal = ((sumAtt4/30)*100);
               String s4 =  String.format("%.2f%%",att4Tfinal);
               s4LBL.setText(s4);
               System.out.println(s4);
            
               
            String sub5 = "SELECT attendance FROM attendance_2023_TMS1113 WHERE s_id = '"+username+"'";
            ResultSet res5 = db.stm.executeQuery(sub5);
            while(res5.next()){
                Double att5 = res5.getDouble("attendance");
            //    System.out.println(att5);
                
                Double att5final = ((att5/15)*100);
                System.out.println("sub5 "+att5final);
                String s5 =  String.format("%.2f%%",att5final);
                s5LBL.setText(s5);
            }
            
            String sub6 = "SELECT attendance FROM attendance_2023_ENG1114 WHERE s_id = '"+username+"'";
            ResultSet res6 = db.stm.executeQuery(sub6);
            while(res6.next()){
                Double att6 = res6.getDouble("attendance");
             //   System.out.println(att6);
                
                Double att6final = ((att6/15)*100);
                System.out.println("sub6 "+att6final);
                String s6 =  String.format("%.2f%%",att6final);
                s6LBL.setText(s6);
            }
         } catch(SQLException ex){
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
        attendanceLBL = new javax.swing.JLabel();
        outerFramePNL = new javax.swing.JPanel();
        innerFramePNL = new javax.swing.JPanel();
        subIDLBL = new javax.swing.JLabel();
        percentageLBL = new javax.swing.JLabel();
        ICT1113TLbl = new javax.swing.JLabel();
        s1LBL = new javax.swing.JLabel();
        ICT1123TLbl = new javax.swing.JLabel();
        ICT1133TLbl = new javax.swing.JLabel();
        ICT1143TLbl = new javax.swing.JLabel();
        TMS1113TLbl = new javax.swing.JLabel();
        ENG1114TLbl = new javax.swing.JLabel();
        s2LBL = new javax.swing.JLabel();
        s3LBL = new javax.swing.JLabel();
        s6LBL = new javax.swing.JLabel();
        s5LBL = new javax.swing.JLabel();
        s4LBL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        attendanceLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 48)); // NOI18N
        attendanceLBL.setText("Attendance");

        outerFramePNL.setBackground(new java.awt.Color(245, 245, 245));
        outerFramePNL.setPreferredSize(new java.awt.Dimension(750, 500));

        innerFramePNL.setBackground(new java.awt.Color(255, 255, 255));

        subIDLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        subIDLBL.setText("Subject ID");

        percentageLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        percentageLBL.setText("Percentage");

        ICT1113TLbl.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        ICT1113TLbl.setText("ICT1113 ");
        ICT1113TLbl.setPreferredSize(new java.awt.Dimension(100, 25));

        s1LBL.setBackground(new java.awt.Color(255, 255, 255));
        s1LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        s1LBL.setOpaque(true);
        s1LBL.setPreferredSize(new java.awt.Dimension(45, 25));

        ICT1123TLbl.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        ICT1123TLbl.setText("ICT1123");
        ICT1123TLbl.setPreferredSize(new java.awt.Dimension(100, 25));

        ICT1133TLbl.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        ICT1133TLbl.setText("ICT1133");
        ICT1133TLbl.setPreferredSize(new java.awt.Dimension(100, 25));

        ICT1143TLbl.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        ICT1143TLbl.setText("ICT1143");
        ICT1143TLbl.setPreferredSize(new java.awt.Dimension(100, 25));

        TMS1113TLbl.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        TMS1113TLbl.setText("TMS1113");
        TMS1113TLbl.setPreferredSize(new java.awt.Dimension(100, 25));
        TMS1113TLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TMS1113TLblMouseClicked(evt);
            }
        });

        ENG1114TLbl.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        ENG1114TLbl.setText("ENG1134");

        s2LBL.setBackground(new java.awt.Color(255, 255, 255));
        s2LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        s2LBL.setOpaque(true);
        s2LBL.setPreferredSize(new java.awt.Dimension(45, 25));

        s3LBL.setBackground(new java.awt.Color(255, 255, 255));
        s3LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        s3LBL.setOpaque(true);
        s3LBL.setPreferredSize(new java.awt.Dimension(45, 25));

        s6LBL.setBackground(new java.awt.Color(255, 255, 255));
        s6LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        s6LBL.setOpaque(true);
        s6LBL.setPreferredSize(new java.awt.Dimension(45, 25));

        s5LBL.setBackground(new java.awt.Color(255, 255, 255));
        s5LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        s5LBL.setOpaque(true);
        s5LBL.setPreferredSize(new java.awt.Dimension(45, 25));

        s4LBL.setBackground(new java.awt.Color(255, 255, 255));
        s4LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        s4LBL.setOpaque(true);
        s4LBL.setPreferredSize(new java.awt.Dimension(45, 25));

        javax.swing.GroupLayout innerFramePNLLayout = new javax.swing.GroupLayout(innerFramePNL);
        innerFramePNL.setLayout(innerFramePNLLayout);
        innerFramePNLLayout.setHorizontalGroup(
            innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerFramePNLLayout.createSequentialGroup()
                .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(innerFramePNLLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(subIDLBL))
                    .addGroup(innerFramePNLLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ENG1114TLbl)
                            .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ICT1113TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ICT1123TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ICT1133TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ICT1143TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TMS1113TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(120, 120, 120)
                .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(percentageLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(s3LBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(s2LBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(s1LBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(innerFramePNLLayout.createSequentialGroup()
                                    .addGap(102, 102, 102)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(innerFramePNLLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(s4LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(s5LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(s6LBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        innerFramePNLLayout.setVerticalGroup(
            innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerFramePNLLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(innerFramePNLLayout.createSequentialGroup()
                        .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subIDLBL)
                            .addComponent(percentageLBL))
                        .addGap(21, 21, 21)
                        .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ICT1113TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s1LBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ICT1123TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s2LBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ICT1133TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s3LBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ICT1143TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(s4LBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TMS1113TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s5LBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ENG1114TLbl)
                    .addComponent(s6LBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(328, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout outerFramePNLLayout = new javax.swing.GroupLayout(outerFramePNL);
        outerFramePNL.setLayout(outerFramePNLLayout);
        outerFramePNLLayout.setHorizontalGroup(
            outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outerFramePNLLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(innerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        outerFramePNLLayout.setVerticalGroup(
            outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outerFramePNLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(innerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLBL)
                .addGap(447, 447, 447)
                .addComponent(attendanceLBL)
                .addContainerGap(549, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(outerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
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
                        .addComponent(attendanceLBL)))
                .addGap(18, 18, 18)
                .addComponent(outerFramePNL, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLBLMouseClicked
        Dashboard aDb = new Dashboard();
        aDb.show();
        dispose();
    }//GEN-LAST:event_backLBLMouseClicked

    private void TMS1113TLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMS1113TLblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TMS1113TLblMouseClicked

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
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ENG1114TLbl;
    private javax.swing.JLabel ICT1113TLbl;
    private javax.swing.JLabel ICT1123TLbl;
    private javax.swing.JLabel ICT1133TLbl;
    private javax.swing.JLabel ICT1143TLbl;
    private javax.swing.JLabel TMS1113TLbl;
    private javax.swing.JLabel attendanceLBL;
    private javax.swing.JLabel backLBL;
    private javax.swing.JPanel innerFramePNL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel outerFramePNL;
    private javax.swing.JLabel percentageLBL;
    private javax.swing.JLabel s1LBL;
    private javax.swing.JLabel s2LBL;
    private javax.swing.JLabel s3LBL;
    private javax.swing.JLabel s4LBL;
    private javax.swing.JLabel s5LBL;
    private javax.swing.JLabel s6LBL;
    private javax.swing.JLabel subIDLBL;
    // End of variables declaration//GEN-END:variables
}
