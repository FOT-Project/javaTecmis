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
 * @author WW
 */
//    Auth auth = Auth.getInstance();
//    String username = auth.getUsername();
public class CalCA {
    String username;
    
    public CalCA(String username) throws SQLException{
        initComponents();
        this.username = username;
        
        DB db = new DB();
        db.getconnect();
        
        String sub1 = "SELECT q1, q2, q3, mid FROM ca_2023_ICT1113 WHERE s_id = TG/2020/002";
        ResultSet res1 = db.stm.executeQuery(sub1);
                
            if(res1.next()){            
                int q1 = res1.getInt("q1");
                int q2 = res1.getInt("q2");
                int q3 = res1.getInt("q3");
                int mid = res1.getInt("mid");
            
                int sumCAsub1 = q1+q2+q3+mid;
                double sumsub1 = (double)sumCAsub1;
                double sub1CaAvg = sumsub1/4;
                System.out.println(sub1CaAvg);
                
            }
            
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String[] args) {
        
    }
}
