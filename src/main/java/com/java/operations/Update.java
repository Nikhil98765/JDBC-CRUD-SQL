package com.java.operations;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    Connection conn = null;
    String query = null;

    public Update(Connection conn, String query) {
        this.query = query;
        this.conn =  conn;
    }


    public void init() throws SQLException {
        updateValues();

    }

    public void updateValues() throws SQLException {

        Statement stmt = conn.createStatement();
        int rowsInserted = stmt.executeUpdate(this.query);
        System.out.println(""+rowsInserted + " updated successfully");

    }

}
