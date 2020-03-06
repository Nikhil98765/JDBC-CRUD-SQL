package com.java.operations;

import com.java.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete{
    Connection conn = null;


    public Delete(Connection conn) {

        this.conn =  conn;
    }


    public void init() throws SQLException {

        deleteRow();

    }

    public void deleteRow() throws SQLException {

        Scanner s = new Scanner(System.in);
        String query = "DELETE FROM EMPLOYEE WHERE ID=?";
        PreparedStatement stmt = conn.prepareStatement(query);
        int id = s.nextInt();
        s.nextLine();
        stmt.setInt(1, id);
        int rowsInserted = stmt.executeUpdate();
        System.out.println(""+rowsInserted + " deleted successfully");

    }
}
