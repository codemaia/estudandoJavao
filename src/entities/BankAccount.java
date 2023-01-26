package entities;

public class BankAccount {
	
	private int numberAccount;
	public String userName;
	private double accountBalance;
	
	
	public int getNumberAccount() {
		return numberAccount;
	}
	
	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public BankAccount (int numberAccount , String userName) {
		this.numberAccount = numberAccount;
		this.userName = userName;
	}
	
	
	/*
	public void createAccount(int numberAccount, String userName, double accountBalance) {
		this.numberAccount = numberAccount;
		this.userName = userName;
		this.accountBalance = accountBalance;
	}
	*/
	
	public double deposit(double value) {
		return this.accountBalance += value;
	}
	
	public double draft (double value) {
		return this.accountBalance - value - 5.00;
	}
	
}
