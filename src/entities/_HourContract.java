package entities;

import java.time.LocalDate;


public class _HourContract {

	private LocalDate date;
	private Double valuePerHour;
	private Integer hours;
	
	public _HourContract () {
	
	}

	public _HourContract(LocalDate date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double totalValue () {
		return valuePerHour * hours;
	}

	@Override
	public String toString() {
		return date + 
			   ", valuePerHour=" + valuePerHour + 
			   ", hours=" + hours;
	}

	
	
	
}
