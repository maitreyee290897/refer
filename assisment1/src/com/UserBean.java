package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserBean {

	public boolean validate(String username,String pass) {
		boolean x=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		 // loads driver
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "Sapient123"); // gets a new connection
 
		PreparedStatement ps = c.prepareStatement("select * from details where id=? and pass=?");
		ps.setString(1, username);
		ps.setString(2, pass);
		 System.out.println("printbhjbv x : " + x);

		ResultSet rs = ps.executeQuery();
		 x=rs.next();
		 System.out.println("print x : " + x);
		 return x;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return x;
	}
	public int register(String username,String pass) {
		int rs=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		 // loads driver
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "Sapient123"); // gets a new connection
 
		PreparedStatement ps = c.prepareStatement("insert into details(id,pass) values (?,?)");
		ps.setString(1, username);
		ps.setString(2, pass);
		

		 rs = ps.executeUpdate();
		
		 return rs;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return rs;
	}
}
