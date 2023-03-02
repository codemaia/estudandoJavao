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
		
		Double tax = 0.0;
		
		if (getAnualIncome() <= 20000.0 && healthExpenditures == 0.0) {
			tax = getAnualIncome() * 0.15;
			
		} else if (getAnualIncome() > 20000.0 && healthExpenditures == 0.0) {
			tax = getAnualIncome() * 0.25;
			
		} else if (getAnualIncome() > 20000.0 && healthExpenditures > 0.0){
			tax = (getAnualIncome() * 0.25) - (healthExpenditures * 0.50);    
	
		}
		
		return tax;
		
	}

}
