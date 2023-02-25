package application;

import java.util.Locale;
import java.util.Scanner;

import applicationTwo.Product;

public class ProgramProductHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Product prod = new Product("Notebook", 1100.0);
		
		System.out.println(prod.priceTag());
		
		
		
		sc.close();

	}

}
