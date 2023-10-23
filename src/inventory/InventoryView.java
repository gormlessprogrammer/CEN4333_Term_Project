package inventory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import main.JBDCconnection;

public class InventoryView {
	public static void view() throws SQLException {
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
	}
}
