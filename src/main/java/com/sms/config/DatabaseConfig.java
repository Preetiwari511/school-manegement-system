package com.sms.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConfig {
	
	public static Connection getConnection() {
		Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");
 
            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database
 
//            
           // connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
        return connection;
	}
	public static void main(String[] args) throws Exception {
		Connection connection = getConnection();
		System.out.println("connection stablished");
		Statement statement;
      statement = connection.createStatement();
      ResultSet resultSet;
      resultSet = statement.executeQuery(
          "select * from employee");
      int empID;
      String FirstName;
      while (resultSet.next()) {
          empID = resultSet.getInt("empID");
          FirstName = resultSet.getString("FirstName").trim();
          System.out.println("empID : " + empID
                             + " name : " + FirstName);
      }
      resultSet.close();
      statement.close();
      connection.close();
	}

}
