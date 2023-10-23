package employee;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import main.JBDCconnection;

public class EmployeeAdd {
	public static void add() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type an Employee ID: ");
		int employeeID = Integer.parseInt(scanner.nextLine());
		System.out.print("Type the Employee's first name: ");
		String employeeFirstName = scanner.nextLine();
		System.out.print("Type a Employee's last name: ");
		String employeeLastName = scanner.nextLine();
		System.out.print("Type the Employee's Phone Number: ");
		String employeePhoneNumber = scanner.nextLine();
		System.out.print("Type the Employee's Email Address: ");
		String employeeEmailAddress = scanner.nextLine();
		System.out.print("Type the Employee's Role: ");
		String employeeRole = scanner.nextLine();
		Statement statement = JBDCconnection.connection().createStatement();
	
		  int result = statement.
		  executeUpdate("INSERT INTO Employee(EmployeeID,EmployeeFirstName,EmployeeLastName,EmployeePhoneNumber, EmployeeEmail, EmployeeRole)"
		  + "values(" +employeeID +", '" + employeeFirstName + "', " + "'" +employeeLastName + "' , '" + employeePhoneNumber + "' , '" + employeeEmailAddress + "' , '" + employeeRole + "')");
		  
		  if (result>0) { System.out.println(result + " row(s) successfully altered.");
		  } else { System.out.println("Something went wrong."); }
	}
	
}
