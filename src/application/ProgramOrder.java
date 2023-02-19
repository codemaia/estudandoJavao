package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter clien data:");
		
		System.out.print("Name: ");
		String nameClient = sc.nextLine();
		
		System.out.print("Email: ");
		String emailClient = sc.next();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.next();
		
		
		sc.close();
	}

}
