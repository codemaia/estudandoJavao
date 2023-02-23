package entities;

public class SavingsAccountHeranca extends AccountHeranca {

	private Double interestRate;
	
	public SavingsAccountHeranca() {
		super();
	}

	public SavingsAccountHeranca(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
}
