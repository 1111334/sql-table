package org.example;

import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) throws SQLException {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database-test", "root", "Maicoldevelhope12.");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM `table-sql`");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("student_id"));
                System.out.println(resultSet.getString("last_name"));
                System.out.println(resultSet.getString("first_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}