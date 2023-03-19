/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Student;

import Alerts.Failed_Alert;
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
     Attendance(String username) {
        this.username = username;
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);   
       
        DB db = new DB();
        db.getconnect();
 
        try {
            String sub1T = "SELECT attendance FROM attendance_2023_ICT1113 WHERE s_id = '"+username+"' AND type = 'T'";
            ResultSet res1T = db.stm.executeQuery(sub1T);
            while(res1T.next()){
                Double att1T = res1T.getDouble("attendance");
             //   System.out.println(att1);
                
                Double att1Tfinal = ((att1T/15)*100);
                System.out.println("sub1T "+att1Tfinal);
                String s1T =  String.format("%.2f%%",att1Tfinal);
                perLBL1.setText(s1T);
            } 
            
            String sub1P = "SELECT attendance FROM attendance_2023_ICT1113 WHERE s_id = '"+username+"' AND type = 'P'";
            ResultSet res1P = db.stm.executeQuery(sub1P);
            while(res1P.next()){
                Double att1P = res1P.getDouble("attendance");
             //   System.out.println(att1);
                
                Double att1Pfinal = ((att1P/15)*100);
                System.out.println("sub1P "+att1Pfinal);
                String s1P =  String.format("%.2f%%",att1Pfinal);
                perLBL2.setText(s1P);
            } 
            
//            String sub1 = "SELECT attendance FROM attendance_2023_ICT1113 WHERE s_id = '"+username+"'";
//            ResultSet res1 = db.stm.executeQuery(sub1);
//            while(res1.next()){
//                Double att1 = res1.getDouble("attendance");
//              //  System.out.println(att2);
//                
//                Double att1final = ((att1/30)*100);
//                String s1 =  String.format("%.2f%%",att1final);
//                perLBL3.setText(s1);
//            } 
      
        
            String sub2 = "SELECT attendance FROM attendance_2023_ICT1123 WHERE s_id = '"+username+"'";
            ResultSet res2 = db.stm.executeQuery(sub2);
            while(res2.next()){
                Double att2 = res2.getDouble("attendance");
              //  System.out.println(att2);
                
                Double att2final = ((att2/15)*100);
                System.out.println("sub2 "+att2final);
                String s2 =  String.format("%.2f%%",att2final);
                perLBL3.setText(s2);
            } 
            
            
            String sub3T = "SELECT attendance FROM attendance_2023_ICT1133 WHERE s_id = '"+username+"' AND type = 'T'";
            ResultSet res3T = db.stm.executeQuery(sub3T);
            while(res3T.next()){
                Double att3T = res3T.getDouble("attendance");
            //    System.out.println(att3);
                
                Double att3Tfinal = ((att3T/15)*100);
                System.out.println("sub3T "+att3Tfinal);
                String s3T =  String.format("%.2f%%",att3Tfinal);
                perLBL4.setText(s3T);
            }
            
            String sub3P = "SELECT attendance FROM attendance_2023_ICT1133 WHERE s_id = '"+username+"' AND type = 'P'";
            ResultSet res3P = db.stm.executeQuery(sub3P);
            while(res3P.next()){
                Double att3P = res3P.getDouble("attendance");
             //   System.out.println(att1);
                
                Double att3Pfinal = ((att3P/15)*100);
                System.out.println("sub3P "+att3Pfinal);
                String s3P =  String.format("%.2f%%",att3Pfinal);
                perLBL5.setText(s3P);
            } 
            
            String sub4T = "SELECT attendance FROM attendance_2023_ICT1143 WHERE s_id = '"+username+"' AND type = 'T'";
            ResultSet res4T = db.stm.executeQuery(sub4T);
            while(res4T.next()){
                Double att4T = res4T.getDouble("attendance");
             //   System.out.println(att4);
                
                Double att4Tfinal = ((att4T/15)*100);
                System.out.println("sub4T "+att4Tfinal);;
                String s4T =  String.format("%.2f%%",att4Tfinal);
                perLBL6.setText(s4T);
            }
            
            String sub4P = "SELECT attendance FROM attendance_2023_ICT1143 WHERE s_id = '"+username+"' AND type = 'P'";
            ResultSet res4P = db.stm.executeQuery(sub4P);
            while(res4P.next()){
                Double att4P = res4P.getDouble("attendance");
             //   System.out.println(att1);
                
                Double att4Pfinal = ((att4P/15)*100);
                System.out.println("sub4P "+att4Pfinal);
                String s4P =  String.format("%.2f%%",att4Pfinal);
                perLBL7.setText(s4P);
            } 
            
            String sub5 = "SELECT attendance FROM attendance_2023_TMS1113 WHERE s_id = '"+username+"'";
            ResultSet res5 = db.stm.executeQuery(sub5);
            while(res5.next()){
                Double att5 = res5.getDouble("attendance");
            //    System.out.println(att5);
                
                Double att5final = ((att5/15)*100);
                System.out.println("sub5 "+att5final);
                String s5 =  String.format("%.2f%%",att5final);
                perLBL9.setText(s5);
            }
            
            String sub6 = "SELECT attendance FROM attendance_2023_ENG1114 WHERE s_id = '"+username+"'";
            ResultSet res6 = db.stm.executeQuery(sub6);
            while(res6.next()){
                Double att6 = res6.getDouble("attendance");
             //   System.out.println(att6);
                
                Double att6final = ((att6/15)*100);
                System.out.println("sub6 "+att6final);
                String s6 =  String.format("%.2f%%",att6final);
                perLBL10.setText(s6);
            }
         } catch(SQLException ex){
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
            
             System.out.println(ex);
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
        perLBL1 = new javax.swing.JLabel();
        ICT1113PLbl = new javax.swing.JLabel();
        ICT1123TLbl = new javax.swing.JLabel();
        ICT1133TLbl = new javax.swing.JLabel();
        ICT1143TLbl = new javax.swing.JLabel();
        ICT1143PLbl = new javax.swing.JLabel();
        percent3LBL = new javax.swing.JLabel();
        percent4LBL = new javax.swing.JLabel();
        percent5LBL = new javax.swing.JLabel();
        percent6LBL = new javax.swing.JLabel();
        ICT1133PLbl = new javax.swing.JLabel();
        TMS1113TLbl = new javax.swing.JLabel();
        ENG1114TLbl = new javax.swing.JLabel();
        perLBL2 = new javax.swing.JLabel();
        perLBL3 = new javax.swing.JLabel();
        perLBL4 = new javax.swing.JLabel();
        perLBL5 = new javax.swing.JLabel();
        perLBL6 = new javax.swing.JLabel();
        perLBL7 = new javax.swing.JLabel();
        perLBL9 = new javax.swing.JLabel();
        perLBL10 = new javax.swing.JLabel();

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
        ICT1113TLbl.setText("ICT1113 - T");
        ICT1113TLbl.setPreferredSize(new java.awt.Dimension(100, 25));

        perLBL1.setBackground(new java.awt.Color(255, 255, 255));
        perLBL1.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        perLBL1.setOpaque(true);
        perLBL1.setPreferredSize(new java.awt.Dimension(45, 25));

        ICT1113PLbl.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        ICT1113PLbl.setText("ICT1113 - P");
        ICT1113PLbl.setPreferredSize(new java.awt.Dimension(100, 25));

        ICT1123TLbl.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        ICT1123TLbl.setText("ICT1123 - T");
        ICT1123TLbl.setPreferredSize(new java.awt.Dimension(100, 25));

        ICT1133TLbl.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        ICT1133TLbl.setText("ICT1133 - T");
        ICT1133TLbl.setPreferredSize(new java.awt.Dimension(100, 25));

        ICT1143TLbl.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        ICT1143TLbl.setText("ICT1143 - T");
        ICT1143TLbl.setPreferredSize(new java.awt.Dimension(100, 25));

        ICT1143PLbl.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        ICT1143PLbl.setText("ICT1143 - P");
        ICT1143PLbl.setPreferredSize(new java.awt.Dimension(100, 25));

        percent3LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        percent3LBL.setPreferredSize(new java.awt.Dimension(45, 25));

        percent4LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        percent4LBL.setPreferredSize(new java.awt.Dimension(45, 25));

        percent5LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        percent5LBL.setPreferredSize(new java.awt.Dimension(45, 25));

        percent6LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        percent6LBL.setPreferredSize(new java.awt.Dimension(45, 25));

        ICT1133PLbl.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        ICT1133PLbl.setText("ICT1133 - P");
        ICT1133PLbl.setPreferredSize(new java.awt.Dimension(37, 25));

        TMS1113TLbl.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        TMS1113TLbl.setText("TMS1113 - T");
        TMS1113TLbl.setPreferredSize(new java.awt.Dimension(100, 25));
        TMS1113TLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TMS1113TLblMouseClicked(evt);
            }
        });

        ENG1114TLbl.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        ENG1114TLbl.setText("ENG1134 - T");

        perLBL2.setBackground(new java.awt.Color(255, 255, 255));
        perLBL2.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        perLBL2.setOpaque(true);
        perLBL2.setPreferredSize(new java.awt.Dimension(45, 25));

        perLBL3.setBackground(new java.awt.Color(255, 255, 255));
        perLBL3.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        perLBL3.setOpaque(true);
        perLBL3.setPreferredSize(new java.awt.Dimension(45, 25));

        perLBL4.setBackground(new java.awt.Color(255, 255, 255));
        perLBL4.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        perLBL4.setOpaque(true);
        perLBL4.setPreferredSize(new java.awt.Dimension(45, 25));

        perLBL5.setBackground(new java.awt.Color(255, 255, 255));
        perLBL5.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        perLBL5.setOpaque(true);
        perLBL5.setPreferredSize(new java.awt.Dimension(45, 25));

        perLBL6.setBackground(new java.awt.Color(255, 255, 255));
        perLBL6.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        perLBL6.setOpaque(true);
        perLBL6.setPreferredSize(new java.awt.Dimension(45, 25));

        perLBL7.setBackground(new java.awt.Color(255, 255, 255));
        perLBL7.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        perLBL7.setOpaque(true);
        perLBL7.setPreferredSize(new java.awt.Dimension(45, 25));

        perLBL9.setBackground(new java.awt.Color(255, 255, 255));
        perLBL9.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        perLBL9.setOpaque(true);
        perLBL9.setPreferredSize(new java.awt.Dimension(45, 25));

        perLBL10.setBackground(new java.awt.Color(255, 255, 255));
        perLBL10.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        perLBL10.setOpaque(true);
        perLBL10.setPreferredSize(new java.awt.Dimension(45, 25));

        javax.swing.GroupLayout innerFramePNLLayout = new javax.swing.GroupLayout(innerFramePNL);
        innerFramePNL.setLayout(innerFramePNLLayout);
        innerFramePNLLayout.setHorizontalGroup(
            innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerFramePNLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(percent3LBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(percent4LBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(percent5LBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(percent6LBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141))
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
                                .addComponent(ICT1113PLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ICT1113TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ICT1123TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ICT1133TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ICT1133PLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ICT1143TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TMS1113TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ICT1143PLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(innerFramePNLLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(perLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(percentageLBL)))
                    .addGroup(innerFramePNLLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(perLBL2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(innerFramePNLLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(perLBL4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perLBL3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perLBL5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perLBL6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perLBL7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perLBL9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perLBL10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(182, Short.MAX_VALUE))
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
                        .addGap(18, 18, 18)
                        .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ICT1113TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ICT1113PLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perLBL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(innerFramePNLLayout.createSequentialGroup()
                                .addComponent(perLBL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(percent3LBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(perLBL4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(innerFramePNLLayout.createSequentialGroup()
                                .addComponent(ICT1123TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ICT1133TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(percent4LBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ICT1133PLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perLBL5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(percent5LBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ICT1143TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perLBL6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(percent6LBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ICT1143PLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(perLBL7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(TMS1113TLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(perLBL9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ENG1114TLbl)
                    .addComponent(perLBL10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout outerFramePNLLayout = new javax.swing.GroupLayout(outerFramePNL);
        outerFramePNL.setLayout(outerFramePNLLayout);
        outerFramePNLLayout.setHorizontalGroup(
            outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outerFramePNLLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(innerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        outerFramePNLLayout.setVerticalGroup(
            outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outerFramePNLLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
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
                .addComponent(outerFramePNL, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
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
    private javax.swing.JLabel ICT1113PLbl;
    private javax.swing.JLabel ICT1113TLbl;
    private javax.swing.JLabel ICT1123TLbl;
    private javax.swing.JLabel ICT1133PLbl;
    private javax.swing.JLabel ICT1133TLbl;
    private javax.swing.JLabel ICT1143PLbl;
    private javax.swing.JLabel ICT1143TLbl;
    private javax.swing.JLabel TMS1113TLbl;
    private javax.swing.JLabel attendanceLBL;
    private javax.swing.JLabel backLBL;
    private javax.swing.JPanel innerFramePNL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel outerFramePNL;
    private javax.swing.JLabel perLBL1;
    private javax.swing.JLabel perLBL10;
    private javax.swing.JLabel perLBL2;
    private javax.swing.JLabel perLBL3;
    private javax.swing.JLabel perLBL4;
    private javax.swing.JLabel perLBL5;
    private javax.swing.JLabel perLBL6;
    private javax.swing.JLabel perLBL7;
    private javax.swing.JLabel perLBL9;
    private javax.swing.JLabel percent3LBL;
    private javax.swing.JLabel percent4LBL;
    private javax.swing.JLabel percent5LBL;
    private javax.swing.JLabel percent6LBL;
    private javax.swing.JLabel percentageLBL;
    private javax.swing.JLabel subIDLBL;
    // End of variables declaration//GEN-END:variables
}
