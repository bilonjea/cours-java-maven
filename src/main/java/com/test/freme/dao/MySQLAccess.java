package com.test.freme.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class MySQLAccess {
	
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private Resultset resultSet = null;
	
	
	
	
	private String url = "jdbc:mysql://localhost:3306/feedback?useSSL=false&serverTimezone=UTC";
	private String user= "testuser";
    private String password = "RjqpoN5oLmiD7nEJ";
    
    
    
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
