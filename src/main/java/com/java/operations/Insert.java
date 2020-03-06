package com.java.operations;

import com.java.model.Employee;
import sun.awt.ScrollPaneWheelScroller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {

    Connection conn = null;

    public Insert(Connection conn) {

        this.conn =  conn;
    }


    public void init() throws SQLException {

            insertIntoValues();

    }

    public void insertIntoValues() throws SQLException {

        Scanner s = new Scanner(System.in);
        String query = "INSERT INTO EMPLOYEE VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        System.out.println("enter the id");
        int id = s.nextInt();
        s.nextLine();
        System.out.println("enter the name");
        String name = s.nextLine();
        System.out.println("enter the city");
        String city = s.nextLine();
        System.out.println("enter the age");
        int age = s.nextInt();
        s.nextLine();
        System.out.println("enter the department name");
        String deptName = s.nextLine();

        Employee em = new Employee(id, name, city, age, deptName);

        stmt.setInt(1, em.getId());
        stmt.setString(2, em.getName());
        stmt.setString(3, em.getCity());
        stmt.setInt(4, em.getAge());
        stmt.setString(5, em.getDeptName());

        int rowsInserted = stmt.executeUpdate();
        System.out.println(""+rowsInserted + " inserted successfully");
    }

}
