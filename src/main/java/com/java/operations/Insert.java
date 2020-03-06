package com.java.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

    Connection conn = null;
    String query = null;

    public Insert(Connection conn, String query) {
        this.query = query;
        this.conn =  conn;
    }


    public void init() throws SQLException {
            insertIntoValues();

    }

    public void insertIntoValues() throws SQLException {

        Statement stmt = conn.createStatement();
        int rowsInserted = stmt.executeUpdate(this.query);
        System.out.println(""+rowsInserted + " inserted successfully");

    }

}
