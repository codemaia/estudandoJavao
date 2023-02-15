package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities._Department;
import entities._HourContract;
import entities._Worker;
import entities.enums._WorkerLevel;

public class _ProgramWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		_Department department = new _Department();
		_Worker worker = new _Worker();
				
		List<_HourContract> contracts = new ArrayList<>();
		
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.next();
		department.setName(departmentName);

		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.next();
		
		System.out.print("Level: ");
		String levelStrr = sc.next();
		_WorkerLevel level = _WorkerLevel.valueOf(levelStrr);
		
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		worker.setName(name);
		worker.setLevel(level);
		worker.setBaseSalary(baseSalary);
		worker.setDepartment(department);
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Enter contract #" + (i+1) + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			String dateStr = sc.next();
			LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			Integer hours = sc.nextInt();
			
			_HourContract contract = new _HourContract(date, valuePerHour, hours);
			
			contracts.add(contract);
			worker.addContract(contract);	
			
		}
		
		System.out.println();
		
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String  dateStr = sc.next();

		int month = Integer.parseInt(dateStr.substring(0, 2));
		int year = Integer.parseInt(dateStr.substring(3, 7));
	
		
		System.out.print(worker);
		System.out.println("Income for " + dateStr + ": " + worker.income(year, month));
			

		
		
		sc.close();
	}

}
