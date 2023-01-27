package entities;

public class BankAccount {
	
	private int numberAccount;
	private String userName;
	private double accountBalance;
	
	
	public BankAccount (int numberAccount , String userName, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.userName = userName;
		deposit(initialDeposit);
	}
	
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
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void deposit(double value) {
		accountBalance += value;
	}
	
	public void withdraw (double value) {
		accountBalance -= value + 5.00;
	}

	
}
