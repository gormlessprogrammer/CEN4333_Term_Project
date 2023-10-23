package supplier;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import main.JBDCconnection;

public class SupplierView {
	public static void view() throws SQLException {
		Statement statement = JBDCconnection.connection().createStatement();
		
		ResultSet resultSet = statement.executeQuery("Select SupplierID, SupplierName, SupplierEmailAddress"
				+ ", SupplierPhoneNumber from Supplier");
			while (resultSet.next()) {
				int supplierID = resultSet.getInt(1);
				String supplierName = resultSet.getString(2);
				String supplierEmailAddress = resultSet.getString(3);
				String supplierPhoneNumber = resultSet.getString(4);
				System.out.println("Supplier ID: " + supplierID + "\n"
						+ "Supplier Name: " + supplierName + "\n"
						+ "Supplier Email Address: " + supplierEmailAddress + "\n"
						+ "Supplier Phone Number: " + supplierPhoneNumber);
	}
}

}
