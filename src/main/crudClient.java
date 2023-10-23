package main;
import inventory.InventoryAdd;
import inventory.InventoryDelete;
import inventory.InventoryEdit;
import inventory.InventoryView;
import supplier.SupplierAdd;
import supplier.SupplierDelete;
import supplier.SupplierEdit;
import supplier.SupplierView;

import java.sql.SQLException;
import java.util.Scanner;

import customer.CustomerAdd;
import customer.CustomerDelete;
import customer.CustomerEdit;
import customer.CustomerView;
import employee.EmployeeAdd;
import employee.EmployeeDelete;
import employee.EmployeeEdit;
import employee.EmployeeView;

public class crudClient {

	public static void main(String[] args) throws SQLException {
		System.out.println("Hello and welcome to the Vitamin Inventory Manager");
		new JBDCconnection();
		try {
			JBDCconnection.connection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean keepRunning = true;
		Scanner scanner = new Scanner(System.in);
		
		do {
			char choice = Menu();
			switch (choice) {
			case '1': 
				System.out.println("Entering inventory management...");
				System.out.println("What would you like to do?");
				 	while (true) {
				 		System.out.println("(V)iew inventory, (a)dd an inventory item, (e)dit an inventory item or (d)elete an inventory item?");
				 		System.out.println("Done? If so, enter e(x)it.\n");
				 			String selection = scanner.nextLine();
				 				if(selection.toLowerCase().equals("v")) {
				 					InventoryView.view();
				 				}
				 				else if(selection.toLowerCase().equals("a")) {
				 					InventoryAdd.add();
				 				}
				 				else if(selection.toLowerCase().equals("d")) {
				 					InventoryView.view();
				 					InventoryDelete.delete();
				 				}
				 				else if(selection.toLowerCase().equals("e")) {
				 					InventoryEdit.edit();
				 				}
				 				else if(selection.toLowerCase().equals("x")) {
				 					break;
				 				}
				 	}
				 	
				 	break;
			case '2': 
				System.out.println("Entering supplier management mode...");
				while (true) {
			 		System.out.println("(V)iew suppliers, (a)dd a supplier, (e)dit a supplier or (d)elete a supplier?");
			 		System.out.println("Done? If so, enter e(x)it.\n");
			 			String selection = scanner.nextLine();
			 				if(selection.toLowerCase().equals("v")) {
			 					SupplierView.view();
			 				}
			 				else if(selection.toLowerCase().equals("a")) {
			 					SupplierAdd.add();
			 				}
			 				else if(selection.toLowerCase().equals("d")) {
			 					SupplierView.view();
			 					SupplierDelete.delete();
			 				}
			 				else if(selection.toLowerCase().equals("e")) {
			 					SupplierView.view();
			 					SupplierEdit.edit();
			 				}
			 				else if(selection.toLowerCase().equals("x")) {
			 					break;
			 				}
			 	}
				
				break;
			case '3':
				System.out.println("Entering employee managment mode...");
				while (true) {
			 		System.out.println("(V)iew employees, (a)dd an employee, (e)dit a employee or (d)elete an employee?");
			 		System.out.println("Done? If so, enter e(x)it.\n");
			 			String selection = scanner.nextLine();
			 				if(selection.toLowerCase().equals("v")) {
			 					EmployeeView.view();
			 				}
			 				else if(selection.toLowerCase().equals("a")) {
			 					EmployeeAdd.add();
			 				}
			 				else if(selection.toLowerCase().equals("d")) {
			 					EmployeeView.view();
			 					EmployeeDelete.delete();
			 				}
			 				else if(selection.toLowerCase().equals("e")) {
			 					EmployeeView.view();
			 					EmployeeEdit.edit();
			 				}
			 				else if(selection.toLowerCase().equals("x")) {
			 					break;
			 				}
			 	}
				break;
			case '4':
				System.out.print("Entering customer management mode...");
				while (true) {
			 		System.out.println("(V)iew customers, (a)dd a customer, (e)dit a customer or (d)elete a customer?");
			 		System.out.println("Done? If so, enter e(x)it.\n");
			 			String selection = scanner.nextLine();
			 				if(selection.toLowerCase().equals("v")) {
			 					CustomerView.view();
			 				}
			 				else if(selection.toLowerCase().equals("a")) {
			 					CustomerAdd.add();
			 				}
			 				else if(selection.toLowerCase().equals("d")) {
			 					CustomerView.view();
			 					CustomerDelete.delete();
			 				}
			 				else if(selection.toLowerCase().equals("e")) {
			 					CustomerView.view();
			 					CustomerEdit.edit();
			 				}
			 				else if(selection.toLowerCase().equals("x")) {
			 					break;
			 				}
			 	}
				break;
			case '5':
				keepRunning = false;
			}
			
		} while(keepRunning); {
			System.out.println("Thank you for using the vitamin shop manager!");
		}
	}
	
	private static char Menu() {
		Scanner keyboard = new Scanner(System.in);
		String choice = "0";
		char response = choice.charAt(0);
		System.out.println("\nEnter 1 to enter inventory management");
		System.out.println("Enter 2 to enter supplier management");
		System.out.println("Enter 3 to enter employee management");
		System.out.println("Enter 4 to enter customer management.");
		System.out.println("Enter 5 to stop the to-do list program.");
		choice = keyboard.nextLine();
		response = choice.charAt(0);
		if (response != '1' && response != '2' && response != '3' && response != '4' && response != '5'){
			System.out.println("Invalid menu selection. Try again.");
		}
		
		return response;
	}
}
