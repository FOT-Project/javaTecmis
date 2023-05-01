/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculateGPA;

import DBConn.DB;

/**
 *
 * @author Hiru
 */
public class CalcGPA extends javax.swing.JFrame {
    String username;
    
    public CalcGPA(String username) {
        initComponents();
        this.username = username;
        
        DB db = new DB();
        db.getconnect();
      
//            String sub1 = "SELECT C.s_id, C.q1, C.q2, C.q3, C.mid, F.theory, F.practical FROM (ca_2023_ICT1113 C INNER JOIN final_exam_2023_ICT1113 F ON C.s_id = F.s_id) WHERE C.s_id = 'TG/2020/002'";
       
//            ResultSet res1 = db.stm.executeQuery(sub1);
//            int sub1P = 0;
//            if (res1.next()) {
//            sub1P = res1.getInt("sub1P");
//            }
//            System.out.println(attendance1T);
//            
//            while(res1.next()){
//                Double q1 = res1.getDouble("q1");
//                Double q2 = res1.getDouble("q2");
//                Double q3 = res1.getDouble("q3");
//                Double mid = res1.getDouble("mid");
//                Double finalT = res1.getDouble("theory");
//                Double finalP = res1.getDouble("practical");
//               
//                Double sub1CA = ((q1+q2+q3+mid)/4);
//                Double sub1final = ((finalT+finalP)/2);
//                Double sub1finalMarks = ((sub1CA+sub1final)/2);
////                System.out.println("f_marks "+sub1finalMarks); 
//                
//                Double grade1;
//                if(sub1finalMarks >= 93)
//                {
//                    grade1 = 4.0;
////                    System.out.println("if 1"+  grade1);
//                }else if(sub1finalMarks >= 90 && sub1finalMarks < 93)
//                {
//                    grade1 = 3.7;
////                     System.out.println("if 2"+  grade1);
//                }else if(sub1finalMarks >= 87 && sub1finalMarks < 90)
//                {
//                    grade1 = 3.3;
////                    System.out.println("if 3"+  grade1);
//                }else if(sub1finalMarks >= 83 && sub1finalMarks < 87)
//                {
//                    grade1 = 3.0;
////                    System.out.println("if 4"+  grade1);
//                }else if(sub1finalMarks >= 80 && sub1finalMarks < 83)
//                {
//                    grade1 = 2.7;
////                    System.out.println("if 5"+  grade1);
//                }else if(sub1finalMarks >= 77 && sub1finalMarks < 80)
//                {
//                    grade1 = 2.3;
////                    System.out.println("if 6"+  grade1);
//                }else if(sub1finalMarks >= 73 && sub1finalMarks < 77)
//                {
//                    grade1 = 2.0;
////                    System.out.println("if 7"+  grade1);
//                }else if(sub1finalMarks >= 70 && sub1finalMarks < 73)
//                {
//                    grade1 = 1.7;
////                    System.out.println("if 8"+  grade1);
//                }else if(sub1finalMarks >= 67 && sub1finalMarks < 70)
//                {
//                    grade1 = 1.3;
////                    System.out.println("if 9"+  grade1);
//                }else if(sub1finalMarks >= 65 && sub1finalMarks < 67)
//                {
//                    grade1 = 1.0;
////                    System.out.println("if 10"+  grade1);
//                }else{
//                    grade1 = 0.0;
////                    System.out.println("if 11"+  grade1);
//                }
////                System.out.println(grade1);
//                Double gpaSub1 = (3*grade1);
////                System.out.println("gpa "+gpaSub1);
//            } 
      
       
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        public static void main(String[] args) {
        
    }
}