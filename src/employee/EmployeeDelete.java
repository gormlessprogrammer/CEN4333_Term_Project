package employee;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import main.JBDCconnection;

public class EmployeeDelete {
	public static void delete() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What employee ID would you like to delete?");
		int id = scanner.nextInt();
		String deletionStatement = "DELETE FROM Employee where EmployeeID = " + id;
		System.out.println(deletionStatement);
		PreparedStatement delete = JBDCconnection.connection().prepareStatement(deletionStatement);
		delete.executeUpdate();
	}
}
