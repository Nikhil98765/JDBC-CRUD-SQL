import com.java.operations.Delete;
import com.java.operations.Insert;
import com.java.operations.Select;
import com.java.operations.Update;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String dbURL ="jdbc:mysql://localhost:3306/demo?autoReconnect=true&useSSL=false";
        String username = "root";
        String password = "Nikhil1234$";

        try {

            Connection conn = DriverManager.getConnection(dbURL, username, password);


            while(true){

                System.out.println("1.Insert\n2.Delete\n3.Update\n4.Select\n5.Exit\n");
                Scanner s = new Scanner(System.in);
                String sql;
                int choice = s.nextInt();
                s.nextLine();
                switch (choice){
                    case 1:
                        System.out.println("enter the query to insert values");
                        sql = s.nextLine();
                        Insert insertRow = new Insert(conn, sql);
                        insertRow.init();
                        break;
                    case 2:
                        System.out.println("enter the query to delete values");
                        sql = s.nextLine();
                        Delete deleteRow = new Delete(conn, sql);
                        deleteRow.init();
                        break;
                    case 3:
                        System.out.println("enter the query to update values");
                        sql = s.nextLine();
                        Update updateRow = new Update(conn, sql);
                        updateRow.init();
                        break;
                    case 4:
                        System.out.println("enter the query to fetch data");
                        sql = s.nextLine();
                        Select displayData = new Select(conn, sql);
                        displayData.init();
                        break;
                    case 5:
                        return;

                }
                System.out.println("\n");
            }


        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
