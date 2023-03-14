/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package DBConn;

import java.sql.*;

public class DBconn {
    
   
    public Connection conn;
    public Statement stm;
    
    public static void main(String[] args) {
     
    }
    
    public Connection connect()throws Exception{
    
        
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://191.96.56.1:3306/u812963415_javag1";
            String user = "u812963415_javag1";
            String password = "p*lC5tH0^";
            conn = DriverManager.getConnection(url, user, password);
            
            
            System.out.println("Connected");
            return conn;
        
    }
            
}
