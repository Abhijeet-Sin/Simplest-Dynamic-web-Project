package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyUtility {
	private static Connection con =null;
	public static Connection getCon() {
		String url ="jdbc:mysql://localhost:3306/nichiIn";
		String user ="root";
		String pass ="root";
		if(con==null) 
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection(url,user,pass);
			}catch(SQLException e) 
			{e.printStackTrace();}catch(ClassNotFoundException e) {e.printStackTrace();}
		}
		return con;
	}

}
