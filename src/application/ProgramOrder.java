package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

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
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(LocalDateTime.now(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
		
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			
			order.addItem(orderItem);
			
		}
		System.out.println();
		
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
			
		
		sc.close();
	}

}
