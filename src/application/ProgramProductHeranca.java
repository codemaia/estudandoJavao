package application;

import java.time.LocalDateTime;
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
		
		
		Product prod = new Product("Notebook", 1100.0);
		
		Product prodImp = new ImportedProduct("Tablet", 260.0, 20.0);
		
		Product prodUsed = new UsedProduct("iPhone", 400.0, LocalDateTime.now());
		
		System.out.println(prodImp.priceTag());
		
		System.out.println(prod.priceTag());
		
		System.out.println(prodUsed.priceTag());
		
		
		
		
		sc.close();

	}

}
