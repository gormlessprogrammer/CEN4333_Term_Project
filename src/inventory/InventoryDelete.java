package inventory;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import main.JBDCconnection;

public class InventoryDelete {
	public static void delete() throws SQLException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("What item ID would you like to delete?");
		int id = scanner.nextInt();
		String deletionStatement = "DELETE FROM Product where ProductID = " + id;
		System.out.println(deletionStatement);
		PreparedStatement delete = JBDCconnection.connection().prepareStatement(deletionStatement);
		delete.executeUpdate();
	}
}
