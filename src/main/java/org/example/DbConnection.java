package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public final static String URL = "jdbc:mysql://localhost:3306/truck";
    public final static String USERNAME = "root";
    public final static String PASSWORD = "Syed@1310";

    static Connection conn;

    public static Connection Connect(){
        try {
            conn = DriverManager.getConnection(URL,USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
