package org.example;

import java.sql.*;
import java.util.ArrayList;

public class MyJDBC {
    public static void main(String[] args) throws SQLException {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database-test", "root", "Maicoldevelhope12.");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM `table-sql`");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}