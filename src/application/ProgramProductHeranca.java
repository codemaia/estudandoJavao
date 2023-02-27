package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities_2.ImportedProduct;
import entities_2.Product;
import entities_2.UsedProduct;

public class ProgramProductHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		/*
		Product prod = new Product("Notebook", 1100.0);
		
		Product prodImp = new ImportedProduct("Tablet", 260.0, 20.0);
		
		LocalDate date = LocalDate.parse("13/05/2020", formatter);
		
		Product prodUsed = new UsedProduct("iPhone", 400.0, date);
		
		
		System.out.println(prodImp.priceTag());
		
		System.out.println(prod.priceTag());
		
		System.out.println(prodUsed.priceTag());
		*/
		
		List<Product> prods = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Prduct #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char productType = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			
			if (productType == 'c') {
				Product prod = new Product(name, price);
				
				prods.add(prod);
			}
			
			if (productType == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String dateStr = sc.nextLine();
				
				LocalDate date = LocalDate.parse(dateStr, formatter);
				
				Product prod = new UsedProduct(name, price, date);
				prods.add(prod);
			}
			
			if (productType == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				
				Product prod = new ImportedProduct(name, price, customsFee);
				prods.add(prod);
			}
		}
		
		System.out.println();
		
		for (Product p : prods) {
			System.out.println(p.priceTag());
		}
		
		sc.close();

	}

}
