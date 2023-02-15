package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.enums._WorkerLevel;

public class _Worker {
	
	private String name;
	private _WorkerLevel level;
	private Double baseSalary;
	
	//composições dos objetos;
	private _Department department;
	private List<_HourContract> contracts = new ArrayList<>();
	
	
	public _Worker() {
		
	}


	public _Worker(String name, _WorkerLevel level, Double baseSalary, _Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public _WorkerLevel getLevel() {
		return level;
	}


	public void setLevel(_WorkerLevel level) {
		this.level = level;
	}


	public Double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}


	public _Department getDepartment() {
		return department;
	}


	public void setDepartment(_Department department) {
		this.department = department;
	}


	public List<_HourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(_HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(_HourContract contract) {
		contracts.remove(contract);
	}
	
	public Double income(Integer year, Integer month) {
		Double sum = baseSalary;
		
		for (_HourContract c : contracts) {
			
			LocalDate date = LocalDate.parse(c.getDate().toString());
			
			int c_month = date.getMonthValue();
			int c_year = date.getYear();
			
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
			
		}
		
		return sum;		
		
	}


	@Override
	public String toString() {
		return  "Name: " + name + "\n" 
//				+ ", level=" + level 
//				+ ", baseSalary=" + baseSalary 
				+ "Department: " + department + "\n";
//				+ ", contracts=" + contracts;'
				
	}
	
	
	
	
}
