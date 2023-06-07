package calculateGPA;

import Auth.Auth;
import DBConn.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalGPA{
    String username;
    public CalGPA(){ 
        
    }
    
    public double firstSub(){
        //getFirstSub
        try {
            DB db = new DB();
            db.getconnect();
            
            Auth auth = Auth.getInstance();
            username = auth.getUsername();
            
            String sub1 = "SELECT ca_2023_ICT1113.q1, ca_2023_ICT1113.q2, ca_2023_ICT1113.q3, ca_2023_ICT1113.mid, final_exam_2023_ICT1113.theory,"
                    + "final_exam_2023_ICT1113.practical FROM ca_2023_ICT1113 inner join final_exam_2023_ICT1113 on "
                    + "ca_2023_ICT1113.s_id = final_exam_2023_ICT1113.s_id WHERE ca_2023_ICT1113.s_id = '"+username+"'";
            
            ResultSet res1 = db.stm.executeQuery(sub1);
            
            if(res1.next()){
                int  s1q1 = res1.getInt("q1");
                int  s1q2 = res1.getInt("q2");
                int s1q3 = res1.getInt("q3");
                int  s1mid = res1.getInt("mid");
                int s1FinalT = res1.getInt("theory");
                int s1FinalP = res1.getInt("practical");

                int max1, max2;
                
                if (s1q1 >= s1q2 && s1q1 >= s1q3) {
                    max1 = s1q1;
                    if (s1q2 >= s1q3) {
                        max2 = s1q2;
                    } else {
                        max2 = s1q3;
                    }
                } else if (s1q2 >= s1q1 && s1q2 >= s1q3) {
                    max1 = s1q2;
                    if (s1q1 >= s1q3) {
                        max2 = s1q1;
                    } else {
                        max2 = s1q3;
                    }
                } else {
                    max1 = s1q3;
                    if (s1q1 >= s1q2) {
                        max2 = s1q1;
                    } else {
                        max2 = s1q2;
                    }
                }
                System.out.println("The two maximum values are: " + max1 + " and " + max2);
              
                double finalQuizRes1 = ((double)max1+max2)/2.0*0.1;
                double finalMidRes1 = (double)s1mid*0.2;
                double finalCaMarks1 = finalQuizRes1 + finalMidRes1;
                
                double finalT1 = ((double)s1FinalT)*0.4;
                double finalP1 = ((double)s1FinalP)*0.3;
                
                double finalMarks1 = finalCaMarks1 + finalT1 + finalP1;
                System.out.println("finalMarks1  " + finalMarks1);
                double gpvalue1 = calculateGpv(finalMarks1);

                 return gpvalue1;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CalGPA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0.0;
    }
    
    public double secondSub(){
        try {
            DB db = new DB();
            db.getconnect();
            
            String sub2 = "SELECT ca_2023_ICT1123.q1, ca_2023_ICT1123.q2, ca_2023_ICT1123.q3, ca_2023_ICT1123.q4, ca_2023_ICT1123.ass1,"
                    + " ca_2023_ICT1123.ass2, ca_2023_ICT1123.mid, final_exam_2023_ICT1123.theory "
                    + "FROM (ca_2023_ICT1123 inner join final_exam_2023_ICT1123 on final_exam_2023_ICT1123.s_id = ca_2023_ICT1123.s_id)"
                    + " WHERE ca_2023_ICT1123.s_id = '"+username+"'";
            ResultSet res2 = db.stm.executeQuery(sub2);
            
            if(res2.next()){
                int s2q1 = res2.getInt("q1");
                int s2q2 = res2.getInt("q2");
                int s2q3 = res2.getInt("q3");
                int s2q4 = res2.getInt("q4");
                int s2ass1 = res2.getInt("ass1");
                int s2ass2 = res2.getInt("ass2");
                int s2mid = res2.getInt("mid");
                int s2FinalT = res2.getInt("theory");
                
                int max1, max2, max3;

                if (s2q1 >= s2q2 && s2q1 >= s2q3 && s2q1 >= s2q4) {
                    max1 = s2q1;
                    if (s2q2 >= s2q3 && s2q2 >= s2q4) {
                        max2 = s2q2;
                        if (s2q3 >= s2q4) {
                            max3 = s2q3;
                        } else {
                            max3 = s2q4;
                        }
                    } else if (s2q3 >= s2q2 && s2q3 >= s2q4) {
                        max2 = s2q3;
                        if (s2q2 >= s2q4) {
                            max3 = s2q2;
                        } else {
                            max3 = s2q4;
                        }
                    } else {
                        max2 = s2q4;
                        if (s2q2 >= s2q3) {
                            max3 = s2q2;
                        } else {
                            max3 = s2q3;
                        }
                    }
                } else if (s2q2 >= s2q1 && s2q2 >= s2q3 && s2q2 >= s2q4) {
                    max1 = s2q2;
                    if (s2q1 >= s2q3&& s2q1 >= s2q4){
                        max2 = s2q1;
                        if (s2q3 >= s2q4) {
                            max3 = s2q3;
                        } else {
                            max3 = s2q4;
                        }
                    } else if (s2q3 >= s2q1 && s2q3 >= s2q4) {
                        max2 = s2q3;
                        if (s2q1 >= s2q4) {
                            max3 = s2q1;
                        } else {
                            max3 = s2q4;
                        }
                    } else {
                        max2 = s2q4;
                        if (s2q1 >= s2q3) {
                            max3 = s2q1;
                        } else {
                            max3 = s2q3;
                        }
                    }
                } else if (s2q3 >= s2q1 && s2q3 >= s2q2 && s2q3 >= s2q4) {
                    max1 = s2q3;
                    if (s2q1 >= s2q2 && s2q1 >= s2q4) {
                        max2 = s2q1;
                        if (s2q2 >= s2q4) {
                            max3 = s2q2;
                        } else {
                            max3 = s2q4;
                        }
                    } else if (s2q2 >= s2q1 && s2q2 >= s2q4) {
                        max2 = s2q2;
                        if (s2q1 >= s2q4) {
                            max3 = s2q1;
                        } else {
                            max3 = s2q4;
                        }
                    } else {
                        max2 = s2q4;
                        if (s2q1 >= s2q2) {
                            max3 = s2q1;
                        } else {
                            max3 = s2q2;
                        }
                    }
                } else {
                    max1 = s2q4;
                    if (s2q1 >= s2q2 && s2q1 >= s2q3) {
                        max2 = s2q1;
                        if (s2q2 >= s2q3) {
                            max3 = s2q2;
                        } else {
                            max3 = s2q3;
                        }
                    } else if (s2q2 >= s2q1 && s2q2 >= s2q3) {
                        max2 = s2q2;
                        if (s2q1 >= s2q3) {
                            max3 = s2q1;
                        } else {
                            max3 = s2q3;
                        }
                    } else {
                        max2 = s2q3;
                        if (s2q1 >= s2q2) {
                            max3 = s2q1;
                        } else {
                            max3 = s2q2;
                        }
                    }
                }
                System.out.println("The three maximum values are: " + max1 + " and " + max2 + " and " + max3);
                
                double sumQuizDouble2 = (double)max1+max2+max3;
                double finalQuizRes2 = (sumQuizDouble2/3)*0.1;
                double sumAssDouble2 = (double)s2ass1+s2ass2;
                double finalAssRes2 = (sumAssDouble2/2)*0.1;
                double finalMidRes2 = (double)s2mid*0.2;
                double finalCaMarks2 = finalQuizRes2 + finalAssRes2 + finalMidRes2 ;
                
                double finalT2 = ((double)s2FinalT)*0.6;
                
                double finalMarks2 = finalCaMarks2 + finalT2;
                System.out.println("finalMarks2  " + finalMarks2);
                double gpvalue2 = calculateGpv(finalMarks2);
                
                System.out.println("gpv2 " +gpvalue2);

                return gpvalue2;
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(CalGPA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0.0;
    }
      
        public double thirdSub(){
            try {
                DB db = new DB();
                db.getconnect();

                String sub3 = "SELECT ca_2023_ICT1133.q1, ca_2023_ICT1133.q2, ca_2023_ICT1133.q3, ca_2023_ICT1133.ass1, ca_2023_ICT1133.ass2,"
                        + " final_exam_2023_ICT1133.theory, final_exam_2023_ICT1133.practical FROM (ca_2023_ICT1133 inner join final_exam_2023_ICT1133 "
                        + "on final_exam_2023_ICT1133.s_id = ca_2023_ICT1133.s_id) WHERE ca_2023_ICT1133.s_id = '"+username+"'";


                ResultSet res3 = db.stm.executeQuery(sub3);

                if(res3.next()){
                    int s3q1 = res3.getInt("q1");
                    int s3q2 = res3.getInt("q2");
                    int s3q3 = res3.getInt("q3");
                    int s3ass1 = res3.getInt("ass1");
                    int s3ass2 = res3.getInt("ass2");
                    int s3FinalT = res3.getInt("theory");
                    int s3FinalP = res3.getInt("practical");

                    int max1, max2;

                    if (s3q1 >= s3q2 && s3q1 >= s3q3) {
                        max1 = s3q1;
                        if (s3q2 >= s3q3) {
                            max2 = s3q2;
                        } else {
                            max2 = s3q3;
                        }
                    } else if (s3q2 >= s3q1 && s3q2 >= s3q3) {
                        max1 = s3q2;
                        if (s3q1 >= s3q3) {
                            max2 = s3q1;
                        } else {
                            max2 = s3q3;
                        }
                    } else {
                        max1 = s3q3;
                        if (s3q1 >= s3q2) {
                            max2 = s3q1;
                        } else {
                            max2 = s3q2;
                        }
                    }
                    System.out.println("The two maximum values are: " + max1 + " and " + max2);

                    double sumQuizDouble3 = (double)max1+max2;
                    double finalQuizRes3 = (sumQuizDouble3/2)*0.1;
                    double sumAssDouble3 = (double)s3ass1+s3ass2;
                    double finalAssRes3 = (sumAssDouble3/2)*0.2;
                    double finalCaMarks3 = finalQuizRes3 + finalAssRes3;

                    double finalT3 = ((double)s3FinalT)*0.4;
                    double finalP3 = ((double)s3FinalP)*0.3;

                    double finalMarks3 = finalCaMarks3 + finalT3 + finalP3;
                    System.out.println("finalMarks3  " + finalMarks3);
                    double gpvalue3 = calculateGpv(finalMarks3);

                    System.out.println("gpv3 " +gpvalue3);
                    return gpvalue3;
                }
            } catch (SQLException ex) {
                Logger.getLogger(CalGPA.class.getName()).log(Level.SEVERE, null, ex);
            }
            return 0;
        }
        
        public double fourthSub(){
            try {
                DB db = new DB();
                db.getconnect();

                String sub4 = "SELECT ca_2023_ICT1143.q1, ca_2023_ICT1143.q2, ca_2023_ICT1143.q3, ca_2023_ICT1143.ass1, ca_2023_ICT1143.ass2, "
                        + "final_exam_2023_ICT1143.theory, final_exam_2023_ICT1143.practical FROM (ca_2023_ICT1143 inner join final_exam_2023_ICT1143 "
                        + "on final_exam_2023_ICT1143.s_id = ca_2023_ICT1143.s_id) WHERE ca_2023_ICT1143.s_id = '"+username+"'";

                ResultSet res4 = db.stm.executeQuery(sub4);

                if(res4.next()){
                    int s4q1 = res4.getInt("q1");
                    int s4q2 = res4.getInt("q2");
                    int s4q3 = res4.getInt("q3");
                    int s4ass1 = res4.getInt("ass1");
                    int s4ass2 = res4.getInt("ass2");
                    int s4FinalT = res4.getInt("theory");
                    int s4FinalP = res4.getInt("practical");

                    int max1, max2;

                    if (s4q1 >= s4q2 && s4q1 >= s4q3) {
                        max1 = s4q1;
                        if (s4q2 >= s4q3) {
                            max2 = s4q2;
                        } else {
                            max2 = s4q3;
                        }
                    } else if (s4q2 >= s4q1 && s4q2 >= s4q3) {
                        max1 = s4q2;
                        if (s4q1 >= s4q3) {
                            max2 = s4q1;
                        } else {
                            max2 = s4q3;
                        }
                    } else {
                        max1 = s4q3;
                        if (s4q1 >= s4q2) {
                            max2 = s4q1;
                        } else {
                            max2 = s4q2;
                        }
                    }
                    System.out.println("The two maximum values are: " + max1 + " and " + max2);

                    double sumQuizDouble4 = (double)max1+max2;
                    double finalQuizRes4 = (sumQuizDouble4/2)*0.1;
                    double sumAssDouble4 = (double)s4ass1+s4ass2;
                    double finalAssRes4 = (sumAssDouble4/2)*0.2;
                    double finalCaMarks4 = finalQuizRes4 + finalAssRes4;

                    double finalT4 = ((double)s4FinalT)*0.3;
                    double finalP4 = ((double)s4FinalP)*0.4;

                    double finalMarks4 = finalCaMarks4 + finalT4 + finalP4;
                    System.out.println("finalMarks4  " + finalMarks4);
                    double gpvalue4 = calculateGpv(finalMarks4);

                    System.out.println("gpv4 " +gpvalue4);
                    return gpvalue4;
                }
            } catch (SQLException ex) {
                Logger.getLogger(CalGPA.class.getName()).log(Level.SEVERE, null, ex);
            }
            return 0.0;
        }
        
        public double fifthSub(){
        try {
            DB db = new DB();
            db.getconnect();
            
            String sub5 = "SELECT ca_2023_ENG1114.q1, ca_2023_ENG1114.q2, ca_2023_ENG1114.q3, ca_2023_ENG1114.mid, final_exam_2023_ENG1114.theory "
                    + "FROM (ca_2023_ENG1114 inner join final_exam_2023_ENG1114 on final_exam_2023_ENG1114.s_id = ca_2023_ENG1114.s_id) "
                    + "WHERE ca_2023_ENG1114.s_id = '"+username+"'";
            
            ResultSet res5 = db.stm.executeQuery(sub5);
            
            if(res5.next()){
                int s5q1 = res5.getInt("q1");
                int s5q2 = res5.getInt("q2");
                int s5q3 = res5.getInt("q3");
                int s5mid = res5.getInt("mid");
                int s5FinalT = res5.getInt("theory");
                
                int max1, max2;
                
                if (s5q1 >= s5q2 && s5q1 >= s5q3) {
                    max1 = s5q1;
                    if (s5q2 >= s5q3) {
                        max2 = s5q2;
                    } else {
                        max2 = s5q3;
                    }
                } else if (s5q2 >= s5q1 && s5q2 >= s5q3) {
                    max1 = s5q2;
                    if (s5q1 >= s5q3) {
                        max2 = s5q1;
                    } else {
                        max2 = s5q3;
                    }
                } else {
                    max1 = s5q3;
                    if (s5q1 >= s5q2) {
                        max2 = s5q1;
                    } else {
                        max2 = s5q2;
                    }
                }
                System.out.println("The two maximum values are: " + max1 + " and " + max2);

                double sumQuizDouble5 = (double)max1+max2;
                double finalQuizRes5 = (sumQuizDouble5/2)*0.1;
                double finalMidRes2 = (double)s5mid*0.2;
                double finalCaMarks5 = finalQuizRes5 + finalMidRes2;
                
                double finalT5 = ((double)s5FinalT)*0.7;
                
                double finalMarks5 = finalCaMarks5 + finalT5;
                System.out.println("finalMarks5  " + finalMarks5);
                double gpvalue5 = calculateGpv(finalMarks5);
                
                System.out.println("gpv5 " +gpvalue5);
                   return gpvalue5;
            } 
        } catch (SQLException ex) {
            Logger.getLogger(CalGPA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0.0;
    }
        
        public double sixthSub(){
        try {
            DB db = new DB();
            db.getconnect();
            
            String sub6 = "SELECT ca_2023_TMS1113.q1, ca_2023_TMS1113.q2, ca_2023_TMS1113.q3, ca_2023_TMS1113.mid, final_exam_2023_TMS1113.theory FROM "
                    + "(ca_2023_TMS1113 inner join final_exam_2023_TMS1113 on final_exam_2023_TMS1113.s_id = ca_2023_TMS1113.s_id) "
                    + "WHERE ca_2023_TMS1113.s_id = '"+username+"'";
            
            ResultSet res6 = db.stm.executeQuery(sub6);

            if(res6.next()){
                int s6q1 = res6.getInt("q1");
                int s6q2 = res6.getInt("q2");
                int s6q3 = res6.getInt("q3");
                int s6mid = res6.getInt("mid");
                int s6FinalT = res6.getInt("theory");
                
                int max1, max2;
                
                if (s6q1 >= s6q2 && s6q1 >= s6q3) {
                    max1 = s6q1;
                    if (s6q2 >= s6q3) {
                        max2 = s6q2;
                    } else {
                        max2 = s6q3;
                    }
                } else if (s6q2 >= s6q1 && s6q2 >= s6q3) {
                    max1 = s6q2;
                    if (s6q1 >= s6q3) {
                        max2 = s6q1;
                    } else {
                        max2 = s6q3;
                    }
                } else {
                    max1 = s6q3;
                    if (s6q1 >= s6q2) {
                        max2 = s6q1;
                    } else {
                        max2 = s6q2;
                    }
                }
                System.out.println("The two maximum values are: " + max1 + " and " + max2);
                
                double sumQuizDouble6 = (double)max1+max2;
                double finalQuizRes6 = (sumQuizDouble6/2)*0.1;
                double finalMidRes6 = (double)s6mid*0.2;
                double finalCaMarks6 = finalQuizRes6 + finalMidRes6;
                
                double finalT6 = ((double)s6FinalT)*0.7;
                
                double finalMarks6 = finalCaMarks6 + finalT6;
                System.out.println("finalMarks6  " + finalMarks6);
                double gpvalue6 = calculateGpv(finalMarks6);
               
                System.out.println("gpv6 " +gpvalue6);
                return gpvalue6;
            }           
        } catch (SQLException ex) {
            Logger.getLogger(CalGPA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0.0;
    }
    
    public double calculateGpv(double finalmarks){
         String grade;
         double gpv;
         
          if(finalmarks >= 80 && finalmarks <= 100){
                    grade = "A+";
            }else if(finalmarks < 80 && finalmarks >= 75){
                    grade = "A";
            }else if(finalmarks < 75 && finalmarks >= 70){
                    grade = "A-";
            }else if(finalmarks < 70 && finalmarks >= 65){
                    grade = "B+";
            }else if(finalmarks < 65 && finalmarks >= 60){
                    grade = "B";
            }else if(finalmarks < 60 && finalmarks >=55){
                    grade = "B-";
            }else if(finalmarks < 55 && finalmarks >= 50){
                    grade = "C+";  
            }else if(finalmarks < 50 && finalmarks >= 45){
                    grade = "C";
            }else if(finalmarks < 45 && finalmarks >= 40){
                    grade = "C-";   
            }else if(finalmarks < 40 && finalmarks >= 30){
                    grade = "D";
            }else if(finalmarks < 30 && finalmarks >= 0){
                    grade = "E";          
            }else {
                    grade =  "Not Valid";
            }
          System.out.println("grade " + grade);
          
            if (grade.equals("A+") || grade.equals("A")) {
            gpv = 4.0;
        } else if (grade.equals("A-")) {
            gpv = 3.7;
        } else if (grade.equals("B+")) {
            gpv = 3.3;
        } else if (grade.equals("B")) {
            gpv = 3.0;
        } else if (grade.equals("B-")) {
            gpv = 2.7;
        } else if (grade.equals("C+")) {
            gpv = 2.3;
        } else if (grade.equals("C")) {
            gpv = 2.0;
        } else if (grade.equals("C-")) {
            gpv = 1.7;
        } else if (grade.equals("D+")) {
            gpv = 1.3;
        } else if (grade.equals("D")) {
            gpv = 1.0;
        } else if (grade.equals("E") || grade.equals("E*") || grade.equals("F")) {
            gpv = 0.0;
        } else {
            throw new IllegalArgumentException("Error in calculating GPV");
        }
        System.out.println(gpv);
        return gpv;
        
    }

        
public static void main(String[] args) {
        CalGPA newcal = new CalGPA();
    }
}