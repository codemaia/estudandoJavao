package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class ProgramOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter clien data:");
		
		System.out.print("Name: ");
		String nameClient = sc.nextLine();
		
		System.out.print("Email: ");
		String emailClient = sc.next();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		//LocalDate birthDate = LocalDate.parse(sc.next(), formatter);
		String date = sc.next();
		LocalDate birthDate = LocalDate.parse(date, formatter);
		
		Client client = new Client(nameClient, emailClient, birthDate);
		
		System.out.println(client);
		
		
		sc.close();
	}

}
