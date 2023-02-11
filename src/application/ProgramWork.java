package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ProgramWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Department department = new Department();
		Worker worker = new Worker();
		
		
		List<HourContract> contracts = new ArrayList<>();
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.next();
		department.setName(departmentName);

		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.next();
		
		System.out.print("Level: ");
		String levelStrr = sc.next();
		WorkerLevel level = WorkerLevel.valueOf(levelStrr);
		
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		worker.setName(name);
		worker.setLevel(level);
		worker.setBaseSalary(baseSalary);
		worker.setDepartment(department);
		
		System.out.println(worker);
			
		
		
//		System.out.println(department);
		
		
		sc.close();
	}

}
