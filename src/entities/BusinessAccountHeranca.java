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
		if (amount <= loanLimit) {
			balance += amount - 10.0;			
		} else {
			System.out.print("Não é possivel realizar o emprestim, verifique o seu limite");
		}
	}

	@Override
	public String toString() {
		return "Account: " + number
			   + " Holder: " + holder
			   + " Balance: " + balance
			   + " loanLimit: " + loanLimit;
	}
	
	
	
}
