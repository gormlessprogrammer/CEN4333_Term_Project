package supplier;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import main.JBDCconnection;

public class SupplierEdit {
	public static void edit() throws SQLException {
		Statement statement = JBDCconnection.connection().createStatement();
		Scanner scanner = new Scanner(System.in);
		System.out.println("What product would you like to edit? Enter the product ID here: ");
		int editID = Integer.parseInt(scanner.nextLine());
		
		
		System.out.print("Type a new Supplier Name:");
		String supplierName = scanner.nextLine();
		System.out.print("Type a new Supplier Email :");
		String supplierEmail = scanner.nextLine();
		System.out.print("Type a new supplier phone number :");
		String supplierPhoneNumber = scanner.nextLine();

		
		int result = statement.executeUpdate("UPDATE Supplier SET SupplierName = " + "'"+supplierName+"'"+
				",SupplierEmailAddress = '"+supplierEmail+"'"
				+",SupplierPhoneNumber = '"+supplierPhoneNumber+"'"
				+ " where SupplierID = " + editID);
		
		if (result>0) {
			System.out.println(result + " row(s) successfully altered.");
		} else {
			System.out.println("Something went wrong.");
		}
	}
}
