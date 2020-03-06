package com.java.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    String dbURL ="jdbc:mysql://localhost:3306/demo?autoReconnect=true&useSSL=false";
    String username = "root";
    String password = "Nikhil1234$";

    public Connection connect() throws SQLException {

        return DriverManager.getConnection(dbURL, username, password);
    }
}
