package application;

import java.util.Locale;
import java.util.Scanner;


import entities._Product;

public class ProgramProduct {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//ADD CONSTRUCTORS
		
		//COMO DECLARAMOS UM CONSTRUCTOR PADRÃO, PODEMOS CHAMA-LO SEM PROBLEMA
//		Product p = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine(); //CRIANDO VARIAVEL AUXILIAR PARA O CONSTRUCTOR
		System.out.print("Price: ");
		double price = sc.nextDouble(); //CRIANDO VARIAVEL AUXILIAR PARA O CONSTRUCTOR
		
		//ALTERADO PARA CONSTRUCTOR - SOBRECARGA
		//System.out.print("Quantity in stock: ");
		//int quantity = sc.nextInt(); //CRIANDO VARIAVEL AUXILIAR PARA O CONSTRUCTOR
		
		//CHAMANDO E INSTANCIANDO O CONSTRUCTOR
		_Product product = new _Product(name, price);
		
				
		//TESTE DE EMCAPSULAMENTO:
		product.setName("Computer");
		System.out.println("Update product: " + product.getName());
		
		product.setPrice(1200.00);;
		System.out.println("Update price: " + product.getPrice());
		
		
		
		System.out.println();
		System.out.println("Product data: " + product); // criamos o metodo toString e sobrescrevemos o
									 // toString que já por padrão no JAVA;
				
		//System.out.println("Product data: " + product.name + ", $ " + product.price + ", " + product.quantity + " units, Total: " + product.totalValueInStock());
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		
		int quantity = sc.nextInt(); // ALTERADO PARA CONSTRUCTOR - SOBRECARGA
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
