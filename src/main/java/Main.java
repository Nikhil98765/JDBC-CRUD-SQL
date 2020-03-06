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
                System.out.println("enter your choice");
                Scanner s = new Scanner(System.in);
                String sql;
                int choice = s.nextInt();
                s.nextLine();
                switch (choice){
                    case 1:
                        System.out.println("enter the insert values");
                        Insert insertRow = new Insert(conn);
                        insertRow.init();
                        break;
                    case 2:
                        System.out.println("enter delete values");
                        Delete deleteRow = new Delete(conn);
                        deleteRow.init();
                        break;
                    case 3:
                        System.out.println("enter the query to update values");
                        Update updateRow = new Update(conn);
                        updateRow.init();
                        break;
                    case 4:
                        System.out.println("enter the query to fetch data");
                        Select displayData = new Select(conn);
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
