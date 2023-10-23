package employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import main.JBDCconnection;

public class EmployeeView {
	public static void view() throws SQLException {
		Statement statement = JBDCconnection.connection().createStatement();
		
		ResultSet resultSet = statement.executeQuery("Select EmployeeID, EmployeeFirstName, EmployeeLastName, EmployeeEmail"
				+ ",EmployeePhoneNumber, EmployeeRole from Employee");
			while (resultSet.next()) {
				int employeeID = resultSet.getInt(1);
				String employeeFirstName = resultSet.getString(2);
				String employeeLastName = resultSet.getString(3);
				String employeeEmailAddress = resultSet.getString(4);
				String employeePhoneNumber = resultSet.getString(5);
				String employeeRole = resultSet.getString(6);
				System.out.println("Employee ID: " + employeeID + "\n"
						+ "Employee First Name: " + employeeFirstName + "\n"
						+ "Employee Last Name: " + employeeLastName + "\n"
						+ "Employee Email Address: " + employeeEmailAddress + "\n"
						 + "Employee Phone Number: " + employeePhoneNumber + "\n"
						+ "Employee Role: " + employeeRole);
			}
	}
}
