package com.tyss.com;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB 
{
	public static void main(String[] args) {
		ConnectDB obj_connectDB=new ConnectDB();
		System.out.println(obj_connectDB.get_connection());
		
	}
	public Connection get_connection()   {
		Connection connection=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Practice","postgres","root");
			if (connection!=null) {
				System.out.println("Connection OK");
			}else {
					System.out.println("Not OK");
				}
						
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
		
	}

}
 
