package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	
	//métodos/funções
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
	 
		double increase = grossSalary * percentage/100;
		//ou
		//grossSalary += grossSalary * percentage / 100;
		
		System.out.println("Updated data: " + name + ", $ " + (netSalary() + increase));
		
		
		
	}
}
