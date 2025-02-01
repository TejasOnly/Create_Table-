package com.tyss.com;

import java.sql.Connection;
import java.sql.Statement;

public class Insert_Values {
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement = null;
		 ConnectDB obj_connectDB = new ConnectDB();
	        connection = obj_connectDB.get_connection(); 
		
		try {
			String query="insert into employee(name,address)values('John','Ahemadabad')";
			
			statement=connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Values added Successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
