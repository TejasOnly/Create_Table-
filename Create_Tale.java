ackage com.tyss.com;

import java.sql.Connection;
import java.sql.Statement;

public class Create_Table {
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement = null;
		ConnectDB obj_connectDB=new ConnectDB();
		System.out.println(obj_connectDB.get_connection());
		connection=obj_connectDB.get_connection();
		
		
		try {
			String query="create table employee(Sl_no SERIAL  primary key , name varchar(200),address varchar(200))";
			statement=connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Finished");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
