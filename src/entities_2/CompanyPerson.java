package entities_2;

public class CompanyPerson extends Person {

	private Integer numberEmployees;
	
	public CompanyPerson() {
		super();
	}
	
	
	public CompanyPerson(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}


	public Integer getNumberEmployees() {
		return numberEmployees;
	}


	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}


	@Override
	public Double taxPaid() {
		Double tax = 0.0;
		
		if (numberEmployees < 10) {
			tax = getAnualIncome() * 0.16;
		} else {
			tax = getAnualIncome() * 0.14;
		}
		
		return tax;
	}

}
