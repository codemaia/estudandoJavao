package entities;

public class BusinessAccountHeranca extends AccountHeranca{
	
	private Double loanLimit;
	
	public BusinessAccountHeranca() {
		
	}

	public BusinessAccountHeranca(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); //super é usado para trazer os gets and setters da superclasse
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	
	public void loan(Double amount) {
		balance += amount;
	}
	
}
