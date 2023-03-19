/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculateGPA;

import DBConn.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        try {
            String sub1 = "SELECT C.s_id, C.q1, C.q2, C.q3, C.mid, F.theory, F.practical FROM (ca_2023_ICT1113 C INNER JOIN final_exam_2023_ICT1113 F ON C.s_id = F.s_id) WHERE C.s_id = '"+username+"'";
        
            ResultSet res1 = db.stm.executeQuery(sub1);
            while(res1.next()){
                Double q1 = res1.getDouble("q1");
                Double q2 = res1.getDouble("q2");
                Double q3 = res1.getDouble("q3");
                Double mid = res1.getDouble("mid");
                Double finalT = res1.getDouble("theory");
                Double finalP = res1.getDouble("practical");
               
                Double sub1CA = ((q1+q2+q3+mid)/4);
                Double sub1final = ((finalT+finalP)/2);
                Double sub1finalMarks = ((sub1CA+sub1final)/2);
//                System.out.println("f_marks "+sub1finalMarks); 
                
                Double grade1;
                if(sub1finalMarks >= 93)
                {
                    grade1 = 4.0;
//                    System.out.println("if 1"+  grade1);
                }else if(sub1finalMarks >= 90 && sub1finalMarks < 93)
                {
                    grade1 = 3.7;
//                     System.out.println("if 2"+  grade1);
                }else if(sub1finalMarks >= 87 && sub1finalMarks < 90)
                {
                    grade1 = 3.3;
//                    System.out.println("if 3"+  grade1);
                }else if(sub1finalMarks >= 83 && sub1finalMarks < 87)
                {
                    grade1 = 3.0;
//                    System.out.println("if 4"+  grade1);
                }else if(sub1finalMarks >= 80 && sub1finalMarks < 83)
                {
                    grade1 = 2.7;
//                    System.out.println("if 5"+  grade1);
                }else if(sub1finalMarks >= 77 && sub1finalMarks < 80)
                {
                    grade1 = 2.3;
//                    System.out.println("if 6"+  grade1);
                }else if(sub1finalMarks >= 73 && sub1finalMarks < 77)
                {
                    grade1 = 2.0;
//                    System.out.println("if 7"+  grade1);
                }else if(sub1finalMarks >= 70 && sub1finalMarks < 73)
                {
                    grade1 = 1.7;
//                    System.out.println("if 8"+  grade1);
                }else if(sub1finalMarks >= 67 && sub1finalMarks < 70)
                {
                    grade1 = 1.3;
//                    System.out.println("if 9"+  grade1);
                }else if(sub1finalMarks >= 65 && sub1finalMarks < 67)
                {
                    grade1 = 1.0;
//                    System.out.println("if 10"+  grade1);
                }else{
                    grade1 = 0.0;
//                    System.out.println("if 11"+  grade1);
                }
//                System.out.println(grade1);
                Double gpaSub1 = (3*grade1);
//                System.out.println("gpa "+gpaSub1);
            } 
      
        
        String sub2 = "SELECT C.s_id, C.q1, C.q2, C.q3, C.q4, C.ass1, C.ass2, C.mid, F.theory FROM (ca_2023_ICT1123 C INNER JOIN final_exam_2023_ICT1123 F ON C.s_id = F.s_id) WHERE C.s_id = '"+username+"'";
//        System.out.println(sub2);
       
            ResultSet res2 = db.stm.executeQuery(sub2);
            while(res2.next()){
                Double q1 = res2.getDouble("q1");
                Double q2 = res2.getDouble("q2");
                Double q3 = res2.getDouble("q3");
                Double q4 = res2.getDouble("q4");
                Double ass1 = res2.getDouble("ass1");
                Double ass2 = res2.getDouble("ass2");
                Double mid = res2.getDouble("mid");
                Double finalT = res2.getDouble("theory");System.out.println(q1+" "+q2+" "+q3+" "+ass1+" "+ass2+" "+mid+" "+finalT);
                
                Double sub2CA = ((q1+q2+q3+q4+ass1+ass2+mid)/7);
                Double sub2finalMarks = ((sub2CA+finalT)/2);
//                System.out.println(sub2finalMarks);
                
                Double grade2;
                if(sub2finalMarks >= 93)
                {
                    grade2 = 4.0;
                }else if(sub2finalMarks >= 90)
                {
                    grade2 = 3.7;
                }else if(sub2finalMarks >= 87)
                {
                    grade2 = 3.3;
                }else if(sub2finalMarks >= 83)
                {
                    grade2 = 3.0;
                }else if(sub2finalMarks >= 80)
                {
                    grade2 = 2.7;
                }else if(sub2finalMarks >= 77)
                {
                    grade2 = 2.3;
                }else if(sub2finalMarks >= 73)
                {
                    grade2 = 2.0;
                }else if(sub2finalMarks >= 70)
                {
                    grade2 = 1.7;
                }else if(sub2finalMarks >= 67)
                {
                    grade2 = 1.3;
                }else if(sub2finalMarks >= 65)
                {
                    grade2 = 1.0;
                }else{
                    grade2 = 0.0;
                }
                
                Double gpaSub2 = (3*grade2);
//                System.out.println(gpaSub2);
            }
            
        String sub3 = "SELECT C.s_id, C.q1, C.q2, C.q3, C.ass1, C.ass2, F.theory, F.practical FROM (ca_2023_ICT1133 C INNER JOIN final_exam_2023_ICT1133 F ON C.s_id = F.s_id) WHERE C.s_id = '"+username+"'";
        System.out.println(sub3);
       
            ResultSet res3 = db.stm.executeQuery(sub3);
            while(res3.next()){
                Double q1 = res3.getDouble("q1");
                Double q2 = res3.getDouble("q2");
                Double q3 = res3.getDouble("q3");
                Double ass1 = res3.getDouble("ass1");
                Double ass2 = res3.getDouble("ass2");
                Double finalT = res3.getDouble("theory");
                Double finalP = res3.getDouble("practical");
                 
                Double sub3CA = ((q1+q2+q3+ass1+ass2)/5);
                Double sub3final = ((finalT+finalP)/2);
                Double sub3finalMarks = ((sub3CA+sub3final)/2);
//                System.out.println(sub3finalMarks);
                
                Double grade3;
                if(sub3finalMarks >= 93)
                {
                    grade3 = 4.0;
                }else if(sub3finalMarks >= 90)
                {
                    grade3 = 3.7;
                }else if(sub3finalMarks >= 87)
                {
                    grade3 = 3.3;
                }else if(sub3finalMarks >= 83)
                {
                    grade3 = 3.0;
                }else if(sub3finalMarks >= 80)
                {
                    grade3 = 2.7;
                }else if(sub3finalMarks >= 77)
                {
                    grade3 = 2.3;
                }else if(sub3finalMarks >= 73)
                {
                    grade3 = 2.0;
                }else if(sub3finalMarks >= 70)
                {
                    grade3 = 1.7;
                }else if(sub3finalMarks >= 67)
                {
                    grade3 = 1.3;
                }else if(sub3finalMarks >= 65)
                {
                    grade3 = 1.0;
                }else{
                    grade3 = 0.0;
                }
                
                Double gpaSub3 = (3*grade3);
//                System.out.println(gpaSub3);
            }
            
        String sub4 = "SELECT C.s_id, C.q1, C.q2, C.q3, C.ass1, C.ass2, F.theory, F.practical FROM (ca_2023_ICT1143 C INNER JOIN final_exam_2023_ICT1143 F ON C.s_id = F.s_id) WHERE C.s_id = '"+username+"'";
//        System.out.println(sub4);
       
            ResultSet res4 = db.stm.executeQuery(sub4);
            while(res4.next()){
                Double q1 = res4.getDouble("q1");
                Double q2 = res4.getDouble("q2");
                Double q3 = res4.getDouble("q3");
                Double ass1 = res4.getDouble("ass1");
                Double ass2 = res4.getDouble("ass2");
                Double finalT = res4.getDouble("theory");
                Double finalP = res4.getDouble("practical"); System.out.println(q1+" "+q2+" "+q3+" "+ass1+" "+ass2+" "+finalT+" "+finalP);
                
                Double sub4CA = ((q1+q2+q3+ass1+ass2)/5);
                Double sub4final = ((finalT+finalP)/2);
                Double sub4finalMarks = ((sub4CA+sub4final)/2);
                System.out.println(sub4finalMarks);
                
                Double grade4;
                if(sub4finalMarks >= 93)
                {
                    grade4 = 4.0;
                }else if(sub4finalMarks >= 90)
                {
                    grade4 = 3.7;
                }else if(sub4finalMarks >= 87)
                {
                    grade4 = 3.3;
                }else if(sub4finalMarks >= 83)
                {
                    grade4 = 3.0;
                }else if(sub4finalMarks >= 80)
                {
                    grade4 = 2.7;
                }else if(sub4finalMarks >= 77)
                {
                    grade4 = 2.3;
                }else if(sub4finalMarks >= 73)
                {
                    grade4 = 2.0;
                }else if(sub4finalMarks >= 70)
                {
                    grade4 = 1.7;
                }else if(sub4finalMarks >= 67)
                {
                    grade4 = 1.3;
                }else if(sub4finalMarks >= 65)
                {
                    grade4 = 1.0;
                }else{
                    grade4 = 0.0;
                }
                
                Double gpaSub4 = (3*grade4);
//                System.out.println(gpaSub4);
            }
            
        String sub5 = "SELECT C.s_id, C.q1, C.q2, C.q3, C.ass1, C.ass2,C.mid, F.theory FROM (ca_2023_TMS1113 C INNER JOIN final_exam_2023_TMS1113 F ON C.s_id = F.s_id) WHERE C.s_id = '"+username+"'";
//        System.out.println(sub5);
       
            ResultSet res5 = db.stm.executeQuery(sub5);
            while(res5.next()){
                Double q1 = res5.getDouble("q1");
                Double q2 = res5.getDouble("q2");
                Double q3 = res5.getDouble("q3");
                Double ass1 = res5.getDouble("ass1");
                Double ass2 = res5.getDouble("ass2");
                Double mid = res5.getDouble("mid");
                Double finalT = res5.getDouble("theory");
                
                Double sub5CA = ((q1+q2+q3+ass1+ass2)/5);
                Double sub5finalMarks = ((sub5CA+finalT)/2);
//                System.out.println(sub5finalMarks);
                
                Double grade5;
                if(sub5finalMarks >= 93)
                {
                    grade5 = 4.0;
                }else if(sub5finalMarks >= 90)
                {
                    grade5 = 3.7;
                }else if(sub5finalMarks >= 87)
                {
                    grade5 = 3.3;
                }else if(sub5finalMarks >= 83)
                {
                    grade5 = 3.0;
                }else if(sub5finalMarks >= 80)
                {
                    grade5 = 2.7;
                }else if(sub5finalMarks >= 77)
                {
                    grade5 = 2.3;
                }else if(sub5finalMarks >= 73)
                {
                    grade5 = 2.0;
                }else if(sub5finalMarks >= 70)
                {
                    grade5 = 1.7;
                }else if(sub5finalMarks >= 67)
                {
                    grade5 = 1.3;
                }else if(sub5finalMarks >= 65)
                {
                    grade5 = 1.0;
                }else{
                    grade5 = 0.0;
                }
                
                Double gpaSub5 = (3*grade5);
//                System.out.println(gpaSub5);
            }
            
        String sub6 = "SELECT C.s_id, C.q1, C.q2, C.q3, C.ass1, C.ass2,C.mid, F.theory FROM (ca_2023_ENG1114 C INNER JOIN final_exam_2023_ENG1114 F ON C.s_id = F.s_id) WHERE C.s_id = '"+username+"'";
//        System.out.println(sub6);
       
            ResultSet res6 = db.stm.executeQuery(sub6);
            while(res6.next()){
                Double q1 = res6.getDouble("q1");
                Double q2 = res6.getDouble("q2");
                Double q3 = res6.getDouble("q3");
                Double ass1 = res6.getDouble("ass1");
                Double ass2 = res6.getDouble("ass2");
                Double mid = res6.getDouble("mid");
                Double finalT = res6.getDouble("theory");
                
                Double sub6CA = ((q1+q2+q3+ass1+ass2)/5);
                Double sub6finalMarks = ((sub6CA+finalT)/2);
//                System.out.println(sub6finalMarks);
                
                Double grade6;
                if(sub6finalMarks >= 93)
                {
                    grade6 = 4.0;
                }else if(sub6finalMarks >= 90)
                {
                    grade6 = 3.7;
                }else if(sub6finalMarks >= 87)
                {
                    grade6 = 3.3;
                }else if(sub6finalMarks >= 83)
                {
                    grade6 = 3.0;
                }else if(sub6finalMarks >= 80)
                {
                    grade6 = 2.7;
                }else if(sub6finalMarks >= 77)
                {
                    grade6 = 2.3;
                }else if(sub6finalMarks >= 73)
                {
                    grade6 = 2.0;
                }else if(sub6finalMarks >= 70)
                {
                    grade6 = 1.7;
                }else if(sub6finalMarks >= 67)
                {
                    grade6 = 1.3;
                }else if(sub6finalMarks >= 65)
                {
                    grade6 = 1.0;
                }else{
                    grade6 = 0.0;
                }
                
               Double gpaSub6 = (4*grade6);
//               System.out.println(gpaSub6);
            }
            
//            Double finalGPA = (gpaSub1 + gpaSub2 + gpaSub3 + gpaSub4 + gpaSub5 + gpaSub6)/19;
//            cal.setGPA(finalGPA);
              
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    public static void main(String[] args) {
        
    }

    private void initComponents() {
          } 
}