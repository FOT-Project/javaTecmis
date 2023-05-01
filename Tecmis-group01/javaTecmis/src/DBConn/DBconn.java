/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package DBConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {
    
    public static void main(String[] args) {
        connect();
    }
    
    public static Connection connect()
    {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://191.96.56.1:3306/u812963415_javag1", "u812963415_javag1", "p*lC5tH0^");
            //System.out.println("Connected");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Error: " +e);
        }
        return conn;
    }
            
}
