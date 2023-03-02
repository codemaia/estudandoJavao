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
		// TODO Auto-generated method stub
		return null;
	}

}
