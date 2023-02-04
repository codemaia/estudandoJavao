package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Empregado;

public class ProgramEmpregado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Empregado> empregado = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1));
			
			System.out.print("id: ");
			Integer id = sc.nextInt();
			while(hasId(empregado, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			
			empregado.add(new Empregado(id, name, salary));
				
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		
		Empregado emp = empregado.stream()
				 .filter(x -> x.getId() == id)
				 .findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
			
		}
		
		for (Empregado obj : empregado) {
			System.out.println(obj);
		}
		
		
		sc.close();

	}
	
	public static boolean hasId(List<Empregado> list, int id) {
		Empregado emp = list.stream()
					    .filter(x -> x.getId() == id)
					    .findFirst()
					    .orElse(null);
		
		return emp != null;
	}

}
