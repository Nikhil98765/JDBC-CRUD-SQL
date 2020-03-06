package com.java.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {
    Connection conn = null;


    public Update(Connection conn) {

        this.conn =  conn;
    }


    public void init() throws SQLException {
        updateValues();

    }

    public void updateValues() throws SQLException {

        String query = "UPDATE EMPLOYEE SET NAME=? WHERE ID=?";

        Scanner s  = new Scanner(System.in);
        String name = s.nextLine();
        int id = s.nextInt();
        s.nextLine();

        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setInt(2, id);
        int rowsInserted = stmt.executeUpdate();
        System.out.println(""+rowsInserted + " updated successfully");

    }

}
