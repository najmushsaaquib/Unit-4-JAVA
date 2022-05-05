package com.Sprint5.Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJDBC {

	public static void main(String[] args) {
		
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		String url = "jdbc:mysql://localhost:3306/najmush_db";
		
		try {
			Connection conn = DriverManager.getConnection(url, "root", "root");
			
			Statement st = conn.createStatement();
			
			int x = st.executeUpdate("insert into student values(10, 'Ravi', 800)");
			
			if(x > 0) {
				System.out.println("record inserted");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
