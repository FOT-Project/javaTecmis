package DBConn;

import java.sql.*;

public class DBconn {
    
    public static void main(String[] args) {
        connect();
    }
    
    public static Connection connect()
    {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://191.96.56.1:3306/u812963415_javag1", "u812963415_javag1", "p*lC5tH0^");
            //System.out.println("Connected");
        } catch (Exception e) {
            System.out.println("Connection Error: " +e);
        }
        
        return conn;
    }
            
}
