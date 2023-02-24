package entities;

public class EmployeeHeranca {
	
	protected String name;
	protected Integer hours;
	protected Double valuePerHour;
	
	public EmployeeHeranca() {
		
	}

	public EmployeeHeranca(String name, Integer hours, Double valuePerHour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Double payment() {
		return hours * valuePerHour;
	}

	@Override
	public String toString() {
		return name + " - $ " + payment();
	}
	
		
	
}
