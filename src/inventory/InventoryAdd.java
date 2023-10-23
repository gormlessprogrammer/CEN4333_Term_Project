package inventory;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import main.JBDCconnection;

public class InventoryAdd {
	public static void add() throws SQLException { 
		JBDCconnection.connection();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type a Product ID: ");
		int productID = Integer.parseInt(scanner.nextLine());
		System.out.print("Type a Product Name:");
		String productName = scanner.nextLine();
		System.out.print("Type a Product Type :");
		String productType = scanner.nextLine();
		System.out.print("Type an expiration date in the form of 'YYYY-MM-DD' :");
		String productExpirationDate = scanner.nextLine();
		System.out.print("Type an last received date in the form of 'YYYY-MM-DD'");
		String productLastReceivedDate = scanner.nextLine();
		System.out.print("Enter a supplier ID number");
		int supplierID = scanner.nextInt();
		Statement statement = JBDCconnection.connection().createStatement();
		
			int result = statement.executeUpdate("INSERT INTO Product(ProductID,ProductName,ProductType,ProductExpirationDate,ProductLastReceivedDate,SupplierID)"
					+ "values(" + productID + ", '"+ productName +"', " + "'"+ productType +"', " + "'"+ productExpirationDate +"', " + "'"+ productLastReceivedDate +"'," + supplierID +")");
			
			if (result>0) {
				System.out.println(result + " row(s) successfully altered.");
			} else {
				System.out.println("Something went wrong.");
			}
	}
	
}
