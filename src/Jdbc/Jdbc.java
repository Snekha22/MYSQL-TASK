package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emply","root","Root@123");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from emply");
	
		while(rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+ " " + rs.getInt(4));
		con.close();
		
		
	}
	catch(Exception e)
	{
		System.out.println(e);
		System.out.println(e.getMessage());
	}
}
}
