package model.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.entities.DomainException;

public class ProgramAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double withdraw = sc.nextDouble();
			
			account.withdraw(withdraw);
			
			System.out.println(account);
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid account");
		}
		
		sc.close();
		
	}

}
