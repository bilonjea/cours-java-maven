package com.test.freme.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLAccess {
	private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private String url = "jdbc:mysql://localhost:3306/feedback?useSSL=false&serverTimezone=UTC";
    private String user = "toto";
    private String password = "toto";

    public void readDataBase() {
        // This will load the MySQL driver, each DB has its own driver
        //com.mysql.jdbc.Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

             // Setup the connection with the DB
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
