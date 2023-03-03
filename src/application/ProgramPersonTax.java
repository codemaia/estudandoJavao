package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities_2.CompanyPerson;
import entities_2.IndividualPerson;
import entities_2.Person;

public class ProgramPersonTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		Person p1 = new IndividualPerson("Renan", 20000.0, 0.0);
		Person p2 = new IndividualPerson("Renan Maia", 21000.0, 0.0);
		Person p3 = new IndividualPerson("Livia", 50000.0, 2000.0);
		Person p4 = new IndividualPerson("Bob", 120000.0, 1000.0);
		
		Person p5 = new CompanyPerson("RL Ltda", 400000.00, 20);
		
		System.out.println(p1.getName() + " - " + p1.taxPaid());
		System.out.println(p2.getName() + " - " + p2.taxPaid());
		System.out.println(p3.getName() + " - " + p3.taxPaid());
		System.out.println(p4.getName() + " - " + p4.taxPaid());
		
		System.out.println();
		
		System.out.println(p5.getName() + " - " + p5.taxPaid());
		*/
		
		
		List<Person> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				
				list.add(new IndividualPerson(name, anualIncome, healthExpenditures));
				
			}
			
			if (ch == 'c') {
				System.out.print("Number of employees: ");
				Integer numberEmployees = sc.nextInt();
				
				list.add(new CompanyPerson(name, anualIncome, numberEmployees));
			}
			
			
		}
		
		System.out.println();
		
		System.out.println("TAXES PAID:");
		
		Double sum = 0.0;
		for (Person p : list) {
			System.out.println(p.getName() + ": $ " + p.taxPaid());
			sum += p.taxPaid();
		}
		
		System.out.println();
		System.out.print("TOTAL TAXES: $ " + sum);
		
		
		
		sc.close();
	}

}
