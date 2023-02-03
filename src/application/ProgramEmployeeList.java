package application;

import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeList;

public class ProgramEmployeeList {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		EmployeeList employeeList = new EmployeeList();
		
		System.out.print("How many employees will be registered? ");
		int numberRegister = sc.nextInt();
		
		for (int i = 0; i < numberRegister; i++) {
			System.out.println("Employee #" + (i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employeeList = new EmployeeList(id, name, salary);
		}
		
		System.out.println(employeeList);
		
		sc.close();

	}

}
