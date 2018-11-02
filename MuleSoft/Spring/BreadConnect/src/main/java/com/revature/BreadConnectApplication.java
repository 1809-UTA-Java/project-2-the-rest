package com.revature;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BreadConnectApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(BreadConnectApplication.class, args);
		
		//Declare Connection and Statement objects
		Connection myConnection = null;
		
		java.sql.Statement myStatement = null;
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			
			myConnection = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.56.105:1521:xe",
					"bread",
					"bread");
			
			//create statment
			myStatement = myConnection.createStatement();
			ResultSet test = ((java.sql.Statement) myStatement).executeQuery("SELECT * FROM breads"); 
			
			while(test.next()) {
				
				System.out.println(test.getString("TYPE"));
				
			}//end of while loop
			
		}catch(SQLException ex){
			ex.getMessage();
		}finally {
			//myStatement.close();
			
		}//end finally
	}
}
