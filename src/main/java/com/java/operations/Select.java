package com.java.operations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {
    Connection conn = null;

    public Select(Connection conn) {

        this.conn =  conn;
    }


    public void init() throws SQLException {

        displayData();
    }

    public void displayData() throws SQLException {

        String query = "SELECT * FROM EMPLOYEE";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(query);
        while(result.next()){

            int id = result.getInt("id");
            String name = result.getString("name");
            String city = result.getString("city");
            int age = result.getInt("age");
            String deptName = result.getString("deptname");

            System.out.println(""+ id +" "+ name +" " + city + " " + age+ " " + deptName);


        }

    }
}
