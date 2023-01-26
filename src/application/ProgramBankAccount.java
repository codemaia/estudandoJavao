package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class ProgramBankAccount {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		System.out.print("Enter account holder: ");
		String userName = sc.nextLine();
		//System.out.print("Enter initial deposit value: ");
		//double depositValue = sc.nextDouble();
		
		BankAccount bankAccount = new BankAccount(numberAccount, userName);
		
		
		
		
		System.out.println("Account data:");
		System.out.println("Account " + bankAccount.getNumberAccount() + ", Holder: " + bankAccount.userName + ", Balance: $ " );//+ depositValue);
		
		
		
		sc.close();

	}

}
