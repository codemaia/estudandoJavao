package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.EmployeeList;

public class ProgramEmployeeList {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> listEmployee = new ArrayList<>();
		
		EmployeeList employee;
		
		System.out.print("How many employees will be registered? ");
		int numberRegister = sc.nextInt();
		
		for (int i = 0; i < numberRegister; i++) {
			
			System.out.println("Employee #" + (i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			/*
			employee.setId(id);
			employee.setName(name);
			employee.setSalary(salary);
			*/
			employee = new EmployeeList(id, name, id);
			
			listEmployee.add(employee);
		}
		
		System.out.println(employee);
		
		
		sc.close();

	}

}
