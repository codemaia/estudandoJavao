package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class ProgramBankAccount {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BankAccount bankAccount;
		
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String userName = sc.nextLine();
		
		System.out.print("Is there na intial deposit (y/n) ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bankAccount = new BankAccount (numberAccount, userName, initialDeposit);
			
		} else {
			
			bankAccount = new BankAccount(numberAccount, userName);
		}
		System.out.println();
		
		
		System.out.println("Account data: ");
		System.out.println(bankAccount);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		bankAccount.deposit(depositValue);
		System.out.println("Update account data:");
		System.out.print(bankAccount);
		System.out.println();
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		bankAccount.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(bankAccount);
		
		
		
		sc.close();

	}

}
