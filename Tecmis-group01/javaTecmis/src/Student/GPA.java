
package Student;

import Alerts.Failed_Alert;
import DBConn.DB;
import calculateGPA.CalGPA;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Hiru
 */
public class GPA extends javax.swing.JFrame {
    private String username;
    
    public GPA(String username) {
        this.username = username;
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
               
        sidTxtLBL.setText(username);
        
        CalGPA newcal = new CalGPA();
        double sub1gpv = newcal.firstSub();
        double sub2gpv = newcal.secondSub();
        double sub3gpv = newcal.thirdSub();
        double sub4gpv = newcal.fourthSub();
        double sub5gpv = newcal.fifthSub();
        double sub6gpv = newcal.sixthSub();
        
        double finalGPA = (sub1gpv + sub2gpv+ sub3gpv + sub4gpv + sub5gpv + sub6gpv)/6;
        gpaTxtLBL.setText(String.valueOf(finalGPA));
        
        String grade;
        if (finalGPA >= 4.0){
            grade = "A+";
        }else if (finalGPA >= 3.7){
            grade = "A";
        }else if (finalGPA >= 3.3){
            grade = "A-";
        }else if (finalGPA >= 3.0){
            grade = "B+";
        }else if (finalGPA >= 2.7){
            grade = "B";
        }else if (finalGPA >= 2.3){
            grade = "B-";
        }else if (finalGPA >= 2.0){
            grade = "C+";
        }else if (finalGPA >= 1.7){
            grade = "C";
        }else if (finalGPA >= 1.3){
            grade = "C-";
        }else if (finalGPA >= 1.0){
            grade = "D";
        }else{
            grade = "F";
        }
        
        classTxtLBL.setText(grade);
        
        DB db = new DB();
        db.getconnect();
        
        String mysql = "select users.user_id, department.dep_name, course.c_name, users.gpa from ((users inner join department on department.dep_id = users.dep_id) inner join course on course.c_id = users.c_id) where users.user_id = '"+username+"'";
        //System.out.println(mysql);
        try {
           ResultSet res = db.stm.executeQuery(mysql);
           
            if(res.next()){            
                String depname = res.getString("dep_name");
                String cname = res.getString("c_name");
                
                depidtxtLBL.setText(depname);
                cnameTxtLBL.setText(cname);

            }else{
               Failed_Alert failed = new Failed_Alert();
               failed.show();
            }
            
            
        } catch (SQLException e) {
           System.out.println(e);
           
            Failed_Alert failed = new Failed_Alert();
            failed.show();
            
            failed.addWindowListener(new WindowAdapter() {
            @Override
                
            public void windowClosed(WindowEvent e) {
                Dashboard db = new Dashboard(username);
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
        gpaLBL = new javax.swing.JLabel();
        gpaIconLBL = new javax.swing.JLabel();
        framePNL = new javax.swing.JPanel();
        stuIdLBL = new javax.swing.JLabel();
        depLBL = new javax.swing.JLabel();
        courseLBL = new javax.swing.JLabel();
        gpaValLBL = new javax.swing.JLabel();
        clsLBL = new javax.swing.JLabel();
        sidTxtLBL = new javax.swing.JLabel();
        depidtxtLBL = new javax.swing.JLabel();
        cnameTxtLBL = new javax.swing.JLabel();
        gpaTxtLBL = new javax.swing.JLabel();
        classTxtLBL = new javax.swing.JLabel();

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

        depLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        depLBL.setForeground(new java.awt.Color(153, 153, 153));
        depLBL.setText("Department");

        courseLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        courseLBL.setForeground(new java.awt.Color(153, 153, 153));
        courseLBL.setText("Course Name");

        gpaValLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        gpaValLBL.setForeground(new java.awt.Color(153, 153, 153));
        gpaValLBL.setText("GPA Value");

        clsLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        clsLBL.setForeground(new java.awt.Color(153, 153, 153));
        clsLBL.setText("Class");

        sidTxtLBL.setBackground(new java.awt.Color(255, 255, 255));
        sidTxtLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 16)); // NOI18N
        sidTxtLBL.setOpaque(true);
        sidTxtLBL.setPreferredSize(new java.awt.Dimension(200, 25));

        depidtxtLBL.setBackground(new java.awt.Color(255, 255, 255));
        depidtxtLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 16)); // NOI18N
        depidtxtLBL.setOpaque(true);
        depidtxtLBL.setPreferredSize(new java.awt.Dimension(53, 25));

        cnameTxtLBL.setBackground(new java.awt.Color(255, 255, 255));
        cnameTxtLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 16)); // NOI18N
        cnameTxtLBL.setOpaque(true);
        cnameTxtLBL.setPreferredSize(new java.awt.Dimension(53, 25));

        gpaTxtLBL.setBackground(new java.awt.Color(255, 255, 255));
        gpaTxtLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 16)); // NOI18N
        gpaTxtLBL.setOpaque(true);
        gpaTxtLBL.setPreferredSize(new java.awt.Dimension(53, 25));

        classTxtLBL.setBackground(new java.awt.Color(255, 255, 255));
        classTxtLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 16)); // NOI18N
        classTxtLBL.setOpaque(true);
        classTxtLBL.setPreferredSize(new java.awt.Dimension(53, 25));

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
                    .addComponent(sidTxtLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                    .addComponent(depidtxtLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cnameTxtLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gpaTxtLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(classTxtLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(107, 107, 107))
        );
        framePNLLayout.setVerticalGroup(
            framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framePNLLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stuIdLBL)
                    .addComponent(sidTxtLBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depLBL)
                    .addComponent(depidtxtLBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseLBL)
                    .addComponent(cnameTxtLBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpaValLBL)
                    .addComponent(gpaTxtLBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clsLBL)
                    .addComponent(classTxtLBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
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
                .addContainerGap(138, Short.MAX_VALUE))
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
        Dashboard gpaDb = new Dashboard(username);
        gpaDb.show();
        dispose();
    }//GEN-LAST:event_backLBLMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GPA().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLBL;
    private javax.swing.JLabel classTxtLBL;
    private javax.swing.JLabel clsLBL;
    private javax.swing.JLabel cnameTxtLBL;
    private javax.swing.JLabel courseLBL;
    private javax.swing.JLabel depLBL;
    private javax.swing.JLabel depidtxtLBL;
    private javax.swing.JPanel framePNL;
    private javax.swing.JLabel gpaIconLBL;
    private javax.swing.JLabel gpaLBL;
    private javax.swing.JLabel gpaTxtLBL;
    private javax.swing.JLabel gpaValLBL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sidTxtLBL;
    private javax.swing.JLabel stuIdLBL;
    // End of variables declaration//GEN-END:variables
}
