package model.application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class ProgramAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Account account = new Account();
		
		account.setNumber(123);
		account.setHolder("Renan");
		account.setBalance(500.0);
		account.setWithdrawLimit(200.0);
		
		
		System.out.println(account);
		
		account.withdraw(200.0);
		
		System.out.println(account);
		
		
		
		sc.close();
		
	}

}
