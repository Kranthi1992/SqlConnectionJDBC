package sqldemoclass;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnect {
	
	public static Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.driver").newInstance();
			connection = DriverManager.getConnection(connection_string, username, password);
		}catch(Exception e){
			System.out.println("Problem with this:");
			e.printStackTrace();
		}
		System.out.println("DB connection established");
		return connection;
	}
       private static String connection_string = " jdbc:mysql://127.0.0.1:3306/books ";
       private static String username = " root ";
       private static String password = "kranthi ";
       private static Connection connection = null;
       
       public static void main (String args[]){
    	   MySqlConnect my = new MySqlConnect();	
    	   my.getConnection();
    	   }
       }
