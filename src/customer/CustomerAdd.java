package customer;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import main.JBDCconnection;

public class CustomerAdd {
	public static void add() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type a Customer ID: ");
		int customerID = Integer.parseInt(scanner.nextLine());
		System.out.print("Type the Customer's first name: ");
		String custFirstName = scanner.nextLine();
		System.out.print("Type a Customer's last name: ");
		String custLastName = scanner.nextLine();
		System.out.print("Type the Customer's Phone Number: ");
		String custPhoneNumber = scanner.nextLine();
		System.out.print("Type the Customer's Email Address: ");
		String custEmailAddress = scanner.nextLine();
		System.out.print("Does the customer have a product that they want? If not, then leave it empty: ");
		String productID = scanner.nextLine();
		Statement statement = JBDCconnection.connection().createStatement();
		

		  int result = statement.
		  executeUpdate("INSERT INTO Customer(CustomerID,CustFirstName,CustLastName,CustPhoneNumber, CustEmailAddress, ProductID)"
		  + "values(" +customerID +", '" + custFirstName + "', " + "'" +custLastName + "' , '" + custPhoneNumber + "' , '" + custEmailAddress + "' , '" + productID + "')");
		  
		  if (result>0) { System.out.println(result + " row(s) successfully altered.");
		  } else { System.out.println("Something went wrong."); }
	}
}
