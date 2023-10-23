package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JBDCconnection {
	public static Connection connection() throws SQLException {
		System.out.println("Connecting to the Vitamin Shop Database...");
		String url = "jdbc:mysql://root@localhost:3306/VitaminShop";
		String username = "root";
		String password = "Letmeinplease420!";
		Connection connection = DriverManager.getConnection(url,username,password);
		System.out.println("Connection is successful.");
		
		return connection;
	}
}
