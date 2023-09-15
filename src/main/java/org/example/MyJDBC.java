package org.example;

import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) throws SQLException {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database-test", "root", "Maicoldevelhope12.");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM `table-sql`");

            while (resultSet.next()) {
                String studentId = resultSet.getString("student_id");
                String lastName = resultSet.getString("last_name");
                String firstName = resultSet.getString("first_name");

                String resultRow = "Student ID: " + studentId + ", Last Name: " + lastName + ", First Name: " + firstName;
                System.out.println(resultRow);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}