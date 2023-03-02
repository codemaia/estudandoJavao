package entities_2;

public class IndividualPerson extends Person{

	private Double healthExpenditures;
	
	public IndividualPerson() {
		super();
	}

	
	public IndividualPerson(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}


	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}


	@Override
	public Double taxPaid() {
		// TODO Auto-generated method stub
		return null;
	}

}
