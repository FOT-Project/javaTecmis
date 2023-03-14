package DBConn;

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/tecmis";
        String username = "root";
        String password = "";

        // Declare the JDBC objects
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(url, username, password);

            // Execute a query
//            System.out.println("Creating statement...");
//            stmt = conn.createStatement();
//            String sql = "SELECT id, name, age FROM mytable";
//            rs = stmt.executeQuery(sql);

            // Extract data from result set
//            while (rs.next()) {
//                // Retrieve by column name
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                int age = rs.getInt("age");
//
//                // Display values
//                System.out.print("ID: " + id);
//                System.out.print(", Name: " + name);
//                System.out.println(", Age: " + age);
//            }
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Close JDBC objects
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
