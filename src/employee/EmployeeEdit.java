package employee;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import main.JBDCconnection;

public class EmployeeEdit {
	public static void edit() throws SQLException {
		Statement statement = JBDCconnection.connection().createStatement();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which employee would you like to edit? Enter the employee ID here: ");
		int editID = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Enter the new first name of the employee: ");
			String employeeFirstName = scanner.nextLine();
		System.out.println("Enter the new last name of the employee: ");
			String employeeLastName = scanner.nextLine();
		System.out.println("Enter the new phone number of the employee: ");
			String employeePhoneNumber = scanner.nextLine();
		System.out.println("Enter the employee's new email address: ");
			String employeeEmailAddress = scanner.nextLine();
		System.out.println("Enter the employee's new role: ");
			String employeeRole = scanner.nextLine();
			
			int result = statement.executeUpdate("UPDATE Employee SET EmployeeFirstName = '" + employeeFirstName + "'"
					+ ", EmployeeLastName = '" + employeeLastName + "'"
					+ ", EmployeePhoneNumber = '" + employeePhoneNumber + "'"
					+ ", EmployeeEmail = '" + employeeEmailAddress + "'"
					+ ", EmployeeRole = '" + employeeRole + "'"
					+ "WHERE EmployeeID = " + editID);
			
			if (result>0) {
				System.out.println(result + " row(s) successfully altered.");
			} else {
				System.out.println("Something went wrong.");
			}
	}
}
