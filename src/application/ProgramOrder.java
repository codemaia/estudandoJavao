package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.OrderItem;
import entities.Product;

public class ProgramOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		
		System.out.print("Name: ");
		String nameClient = sc.nextLine();
		
		System.out.print("Email: ");
		String emailClient = sc.next();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		//LocalDate birthDate = LocalDate.parse(sc.next(), formatter);
		String date = sc.next();
		LocalDate birthDate = LocalDate.parse(date, formatter);
		
		Client client = new Client(nameClient, emailClient, birthDate);
		
		//System.out.println(client);
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String orderStatus = sc.next();
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		OrderItem orderItem = new OrderItem();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			orderItem = new OrderItem(quantity, productPrice);
			orderItem.addProduct(product);
			
			System.out.println(orderItem);
		}
		
		
			
		
		sc.close();
	}

}
