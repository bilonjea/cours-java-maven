package com.test.freme.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLAccess {

    private Connection connect = null;
    private Statement statement = null;
    private String url = "jdbc:mysql://localhost:3306/feedback";
    private String user = "testuser";
    private String password = "RjqpoN5oLmiD7nE";

    public void readDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}