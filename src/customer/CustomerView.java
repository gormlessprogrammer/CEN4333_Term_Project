package customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import main.JBDCconnection;

public class CustomerView {
	public static void view() throws SQLException {
		Statement statement = JBDCconnection.connection().createStatement();
		
		ResultSet resultSet = statement.executeQuery("Select CustomerID, CustFirstName, CustLastName, CustEmailAddress"
				+ ", CustPhoneNumber, ProductID from Customer");
			while (resultSet.next()) {
				int customerID = resultSet.getInt(1);
				String custFirstName = resultSet.getString(2);
				String custLastName = resultSet.getString(3);
				String custEmailAddress = resultSet.getString(4);
				String custPhoneNumber = resultSet.getString(5);
				int productID = resultSet.getInt(6);

				System.out.println("Supplier ID: " + customerID + "\n"
						+ "Customer First Name: " + custFirstName + "\n"
						+ "Customer Last Name: " + custLastName + "\n"
						+ "Customer Email Address: " + custEmailAddress + "\n"
						+ "Customer Phone Number: " + custPhoneNumber + "\n");
	}
			
			ResultSet resultSet2 = statement.executeQuery("Select Customer.CustFirstName, Customer.CustLastName, Product.ProductName from Customer left join Product on Customer.ProductID = Product.ProductID");
				while(resultSet2.next()) {
					String custFirstName = resultSet2.getString(1);
					String custLastName = resultSet2.getString(2);
					String item = resultSet2.getString(3);
					System.out.println(custFirstName + " " +  custLastName + " wants " + item);
				}
}

}

