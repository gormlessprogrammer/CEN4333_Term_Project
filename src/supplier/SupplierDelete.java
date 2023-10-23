package supplier;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import main.JBDCconnection;

public class SupplierDelete {
	public static void delete() throws SQLException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("What supplier ID would you like to delete?");
		int id = scanner.nextInt();
		String deletionStatement = "DELETE FROM Supplier where SupplierID = " + id;
		System.out.println(deletionStatement);
		PreparedStatement delete = JBDCconnection.connection().prepareStatement(deletionStatement);
		delete.executeUpdate();
	}
}
