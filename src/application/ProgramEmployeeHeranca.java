package application;

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
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			
			
		}
		
		sc.close();

	}

}
