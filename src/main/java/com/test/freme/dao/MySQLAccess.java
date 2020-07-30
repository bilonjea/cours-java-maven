package com.test.freme.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLAccess {
	
	/******* VARIABLES *******/
	
	private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private String url = "jdbc:mysql://localhost:3308/feedback?useSSL=false&serverTimezone=UTC";
    private String user = "testuser";
    private String password = "RjqpoN5oLmiD7nEJ";
	
	/******* METHODS *******/
	
	public void readDatabase() {
		// Loads MySQL driver
		//.com.mysql.jdbc.driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
			
		//Connection with the DB
		try {
			connect = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
