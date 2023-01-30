package application;

import java.util.Scanner;

import entities.Rent;

public class ProgramDesafioVetores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		int nStudents;
		
		System.out.print("How many rooms will be rented? ");
		nStudents = sc.nextInt();
		
		for (int i = 0; i < nStudents; i++) {
			System.out.println("Rent #" + (i+1) + ":");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			
			vect[room] = new Rent(name, email, room);
				
			
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) 
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i] ); //mostrar o index mais o conteudo do array
			}
		
		sc.close();
	}

}
