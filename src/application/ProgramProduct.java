package application;

import java.util.Locale;
import java.util.Scanner;


import entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//ADD CONSTRUCTORS
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine(); //CRIANDO VARIAVEL AUXILIAR PARA O CONSTRUCTOR
		System.out.print("Price: ");
		double price = sc.nextDouble(); //CRIANDO VARIAVEL AUXILIAR PARA O CONSTRUCTOR
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt(); //CRIANDO VARIAVEL AUXILIAR PARA O CONSTRUCTOR
		
		//CHAMANDO E INSTANCIAND O CONSTRUCTOR
		Product product = new Product(name, price, quantity);
				
		
		System.out.println();
		System.out.println("Product data: " + product); // criamos o metodo toString e sobrescrevemos o
									 // toString que já por padrão no JAVA;
				
		//System.out.println("Product data: " + product.name + ", $ " + product.price + ", " + product.quantity + " units, Total: " + product.totalValueInStock());
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
