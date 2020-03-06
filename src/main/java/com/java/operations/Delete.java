package com.java.operations;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    Connection conn = null;
    String query = null;

    public Delete(Connection conn, String query) {
        this.query = query;
        this.conn =  conn;
    }


    public void init() throws SQLException {

        deleteRow();

    }

    public void deleteRow() throws SQLException {

        Statement stmt = conn.createStatement();
        int rowsInserted = stmt.executeUpdate(this.query);
        System.out.println(""+rowsInserted + " deleted successfully");

    }
}
