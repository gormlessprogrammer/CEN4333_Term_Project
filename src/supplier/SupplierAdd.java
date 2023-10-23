package supplier;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import main.JBDCconnection;

public class SupplierAdd {
	public static void add() throws SQLException{
		JBDCconnection.connection();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type a Supplier ID: ");
		int supplierID = Integer.parseInt(scanner.nextLine());
		System.out.print("Type a Supplier Name: ");
		String supplierName = scanner.nextLine();
		System.out.print("Type a Supplier Email: ");
		String supplierEmail = scanner.nextLine();
		System.out.print("Type a Supplier Phone Number: ");
		String supplierPhoneNumber = scanner.nextLine();
		Statement statement = JBDCconnection.connection().createStatement();
		/*
		 * System.out.
		 * println("INSERT INTO Supplier(SupplierID,SupplierName,SupplierEmailAddress,SupplierPhoneNumber)"
		 * + "values(" +supplierID +", '" + supplierName + "', " + "'" +supplierEmail +
		 * "' , '" + supplierPhoneNumber +"'");
		 */
		
		
		  int result = statement.
		  executeUpdate("INSERT INTO Supplier(SupplierID,SupplierName,SupplierEmailAddress,SupplierPhoneNumber)"
		  + "values(" +supplierID +", '" + supplierName + "', " + "'" +supplierEmail +
		  "' , '" + supplierPhoneNumber +"')");
		  
		  if (result>0) { System.out.println(result + " row(s) successfully altered.");
		  } else { System.out.println("Something went wrong."); }
		 
	}
}
