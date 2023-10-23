package inventory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import main.JBDCconnection;

public class InventoryEdit {

	public static void edit() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		Statement statement = JBDCconnection.connection().createStatement();
		
		ResultSet resultSet = statement.executeQuery("Select ProductID, ProductName, ProductType"
				+ ", ProductExpirationDate, ProductLastReceivedDate, SupplierID from Product");
			while (resultSet.next()) {
				int productID = resultSet.getInt(1);
				String productName = resultSet.getString(2);
				String productType = resultSet.getString(3);
				String productExpirationDate = resultSet.getString(4);
				String productLastReceivedDate = resultSet.getString(5);
				int supplierID = resultSet.getInt(6);
				System.out.println("Product ID: " + productID + "\n"
						+ "Product Name: " + productName + "\n"
						+ "Product Type: " + productType + "\n"
						+ "Product Expiration Date: " + productExpirationDate + "\n"
						+ "Product Last Received Date: " + productLastReceivedDate + "\n"
						+ "Supplier ID: " + supplierID);
			}
			
			System.out.println("What product would you like to edit? Enter the product ID here: ");
			int editID = Integer.parseInt(scanner.nextLine());
			
			System.out.print("Type a new Product Name:");
			String productName = scanner.nextLine();
			System.out.print("Type a new Product Type :");
			String productType = scanner.nextLine();
			System.out.print("Type an new expiration date in the form of 'YYYY-MM-DD' :");
			String productExpirationDate = scanner.nextLine();
			System.out.print("Type an new last received date in the form of 'YYYY-MM-DD'");
			String productLastReceivedDate = scanner.nextLine();
			System.out.print("Enter a new supplier ID number");
			int supplierID = scanner.nextInt();
			
			int result = statement.executeUpdate("UPDATE Product SET ProductName = " + "'"+productName+"'"+
					",ProductType = '"+productType+"'"
					+",ProductExpirationDate = '"+productExpirationDate+"'"
					+",ProductLastReceivedDate = '" +productLastReceivedDate+"'"
					+ " where ProductID = " + editID);
			
			if (result>0) {
				System.out.println(result + " row(s) successfully altered.");
			} else {
				System.out.println("Something went wrong.");
			}
	}
}

