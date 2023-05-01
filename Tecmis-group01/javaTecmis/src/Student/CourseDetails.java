
package Student;


/**
 *
 * @author Hiru
 */
public class CourseDetails extends javax.swing.JFrame {

  
    public CourseDetails() {
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
        courseDetailsLBL = new javax.swing.JLabel();
        bgImgLBL = new javax.swing.JLabel();
        framePNL = new javax.swing.JPanel();
        cIdLBL = new javax.swing.JLabel();
        depIdLBL = new javax.swing.JLabel();
        cNameLBL = new javax.swing.JLabel();
        cidTxtLBL = new javax.swing.JLabel();
        depidTxtLBL = new javax.swing.JLabel();
        cnameTxtLBL = new javax.swing.JLabel();

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

        courseDetailsLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 48)); // NOI18N
        courseDetailsLBL.setText("Course Details");

        bgImgLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/course_details.jpg"))); // NOI18N

        framePNL.setBackground(new java.awt.Color(245, 245, 245));

        cIdLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        cIdLBL.setForeground(new java.awt.Color(153, 153, 153));
        cIdLBL.setText("Course ID");

        depIdLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        depIdLBL.setForeground(new java.awt.Color(153, 153, 153));
        depIdLBL.setText("Department ID");

        cNameLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        cNameLBL.setForeground(new java.awt.Color(153, 153, 153));
        cNameLBL.setText("Course Name");

        cidTxtLBL.setBackground(new java.awt.Color(255, 255, 255));
        cidTxtLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 16)); // NOI18N
        cidTxtLBL.setOpaque(true);
        cidTxtLBL.setPreferredSize(new java.awt.Dimension(53, 25));

        depidTxtLBL.setBackground(new java.awt.Color(255, 255, 255));
        depidTxtLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 16)); // NOI18N
        depidTxtLBL.setOpaque(true);
        depidTxtLBL.setPreferredSize(new java.awt.Dimension(53, 25));

        cnameTxtLBL.setBackground(new java.awt.Color(255, 255, 255));
        cnameTxtLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 16)); // NOI18N
        cnameTxtLBL.setOpaque(true);
        cnameTxtLBL.setPreferredSize(new java.awt.Dimension(53, 25));

        javax.swing.GroupLayout framePNLLayout = new javax.swing.GroupLayout(framePNL);
        framePNL.setLayout(framePNLLayout);
        framePNLLayout.setHorizontalGroup(
            framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framePNLLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cIdLBL)
                    .addComponent(depIdLBL)
                    .addComponent(cNameLBL))
                .addGap(43, 43, 43)
                .addGroup(framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cidTxtLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                    .addComponent(depidTxtLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cnameTxtLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        framePNLLayout.setVerticalGroup(
            framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framePNLLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cIdLBL)
                    .addComponent(cidTxtLBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depIdLBL)
                    .addComponent(depidTxtLBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(framePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cNameLBL)
                    .addComponent(cnameTxtLBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(373, 373, 373)
                                .addComponent(bgImgLBL))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(419, 419, 419)
                                .addComponent(courseDetailsLBL))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(framePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(304, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLBL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(courseDetailsLBL)
                        .addGap(28, 28, 28)
                        .addComponent(bgImgLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(framePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLBLMouseClicked
        Dashboard cdDb = new Dashboard(username);
        cdDb.show();
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
            java.util.logging.Logger.getLogger(CourseDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLBL;
    private javax.swing.JLabel bgImgLBL;
    private javax.swing.JLabel cIdLBL;
    private javax.swing.JLabel cNameLBL;
    private javax.swing.JLabel cidTxtLBL;
    private javax.swing.JLabel cnameTxtLBL;
    private javax.swing.JLabel courseDetailsLBL;
    private javax.swing.JLabel depIdLBL;
    private javax.swing.JLabel depidTxtLBL;
    private javax.swing.JPanel framePNL;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
