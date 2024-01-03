package P1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class A {

    private static String name;
    private static String emailid;
    private static String mobileNumber;
    private static String city;

    public static void main(String[] args) {
        // Make the Connection to the Database
        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the name ");
            name = scan.next();

            System.out.println("Enter the emailid ");
            emailid = scan.next();

            System.out.println("Enter the mobileNumber ");
            mobileNumber = scan.next();

            System.out.println("Enter the city ");
            city = scan.next();

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Reader", "root", "Test");

            Statement stmnt = con.createStatement();
            String query = "INSERT INTO Readerlist VALUES ('" + name + "', '" + emailid + "', '" + mobileNumber + "', '" + city + "')";
            stmnt.executeUpdate(query);


         
            // Close the connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
