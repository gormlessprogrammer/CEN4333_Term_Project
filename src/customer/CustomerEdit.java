package customer;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import main.JBDCconnection;

public class CustomerEdit {
	public static void edit() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which customer would you like to edit? Enter the customer ID here: ");
		int editID = Integer.parseInt(scanner.nextLine());
		System.out.print("Type the Customer's new first name: ");
		String custFirstName = scanner.nextLine();
		System.out.print("Type a Customer's new last name: ");
		String custLastName = scanner.nextLine();
		System.out.print("Type the Customer's new Phone Number: ");
		String custPhoneNumber = scanner.nextLine();
		System.out.print("Type the Customer's new Email Address: ");
		String custEmailAddress = scanner.nextLine();
		System.out.print("Does the customer have a product that they want? If not, then leave it empty: ");
		String productID = scanner.nextLine();
		Statement statement = JBDCconnection.connection().createStatement();
		
		int result = statement.executeUpdate("UPDATE Employee SET CustFirstName = '" + custFirstName + "'"
				+ ", CustLastName = '" + custLastName + "'"
				+ ", CustPhoneNumber = '" + custPhoneNumber + "'"
				+ ", CustEmailAddress = '" + custEmailAddress + "'"
				+ ", ProductID = '" + productID + "'"
				+ "WHERE EmployeeID = " + editID);
	}
}
