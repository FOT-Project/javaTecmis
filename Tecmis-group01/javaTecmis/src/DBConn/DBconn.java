/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package DBConn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconn {
    
    public String url = "jdbc:mysql://191.96.56.1:3306/u812963415_javag1";
    public String user = "u812963415_javag1";
    public String password = "p*lC5tH0^";
    public Connection conn;
    public Statement stm;
    
    public static void main(String[] args) {
     
    }
    
<<<<<<< HEAD
    @SuppressWarnings("UseSpecificCatch")
    public static Connection connect()
    {
       Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://191.96.56.1:3306/u812963415_javag1", "u812963415_javag1", "p*lC5tH0^");
=======
    public void connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(url, user, password);
            
            stm = conn.createStatement();
>>>>>>> a99cd2aac7a0cfffe3d0859e51a437723118616f
            //System.out.println("Connected");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Connection Error: " +ex);
        }
    }
            
}
