package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {

    private static final String url = "jdbc:mysql://localhost:3306/codelearner";
    private static final String user = "root";
    private static final String password = "";

    private Connection con = null;

    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            if (conn != null) System.out.println("Successfully connected to MySQL database");
            else System.out.println("Connection Error");
            return conn;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
