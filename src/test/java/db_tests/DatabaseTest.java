package db_tests;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseTest {

    @Test
    public void validateDatabase() {

        Connection con = null;

        try {

            // Step 1 - Connect to MySQL Database
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/enterpriseqa",
                    "root",
                    "Chitti@09");

            System.out.println("Database Connected Successfully");

            // Step 2 - Create Statement
            Statement stmt = con.createStatement();

            // Step 3 - Execute Query
            ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM orders");

            System.out.println("Orders Table Data:");

            // Step 4 - Read Database Data
            while (rs.next()) {

                int id = rs.getInt("id");

                String product =
                        rs.getString("product_name");

                int amount =
                        rs.getInt("amount");

                System.out.println(
                        "ID: " + id +
                        " | Product: " + product +
                        " | Amount: " + amount);
            }

            // Step 5 - Close Connection
            con.close();

            System.out.println("Database Validation Successful");

        } catch (Exception e) {

            System.out.println("Database Error Occurred");

            System.out.println(e);
        }
    }
}