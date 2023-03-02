package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entities.EmployeeHeranca;
import entities.OutsourcedEmployee;

public class ProgramEmployeeHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		EmployeeHeranca emp = new EmployeeHeranca("Renan", 60 , 20.0);
		
		System.out.println(emp);
		
		EmployeeHeranca emp2 = new OutsourcedEmployee("Livia", 100, 15.0, 200.0);
		
		System.out.println(emp2);
		*/
		
		List<EmployeeHeranca> empList = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			
			System.out.print("Outsourced (y/n)? ");
			char yesOrNo = sc.next().charAt(0);
			
			if (yesOrNo == 'n') {
				
				System.out.print("Name: ");
				String name = sc.next();
				
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				
				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
				
				EmployeeHeranca emp = new EmployeeHeranca(name, hours, valuePerHour);
				
				empList.add(emp);
			}
			
		
			
			if (yesOrNo == 'y') {
				System.out.print("Name: ");
				String name = sc.next();
				
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				
				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
				
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				
				EmployeeHeranca emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				
				empList.add(emp);
			}
			
			
		}
		
		System.out.println();
		
		System.out.println("PAYMENTS:");
		for (EmployeeHeranca emp : empList) {
			System.out.println(emp);
		}
		
		sc.close();

	}

}
