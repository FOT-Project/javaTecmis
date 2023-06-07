/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package DBConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {

    
    public static Connection connect()
    {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecmis", "root", "");
            System.out.println("Connected");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Error: " +e);
        }
        return conn;
    }
            
}
