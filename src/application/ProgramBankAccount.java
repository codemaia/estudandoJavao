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
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bankAccount = new BankAccount (numberAccount, userName, initialDeposit);
			bankAccount.deposit(initialDeposit);
		}
		
		
		System.out.println(bankAccount.getNumberAccount());
		
		
		
		System.out.println(bankAccount.getNumberAccount());
		System.out.println(bankAccount.getUserName());
		System.out.println(bankAccount.getAccountBalance());	
		
		//System.out.println("Account data:");
		//System.out.println("Account " + bankAccount.getNumberAccount() + ", Holder: " + bankAccount.userName + ", Balance: $ " );//+ depositValue);
		
		
		
		sc.close();

	}

}
