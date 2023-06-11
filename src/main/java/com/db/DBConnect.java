package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
		private static Connection conn;
		
		public static Connection getConn() {
			try {
				//load Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//create connection
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Bhaskar@1");
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
			return conn;
		}
}
