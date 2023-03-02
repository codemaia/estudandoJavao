package application;

import java.util.Locale;
import java.util.Scanner;

import entities_2.IndividualPerson;
import entities_2.Person;

public class ProgramPersonTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Person p1 = new IndividualPerson("Renan", 20000.0, 0.0);
		Person p2 = new IndividualPerson("Livia", 50000.0, 2000.0);
		Person p3 = new IndividualPerson("Bob", 120000.0, 1000.0);
		
		System.out.println(p1.getName() + " - " + p1.taxPaid());
		System.out.println(p2.getName() + " - " + p2.taxPaid());
		System.out.println(p3.getName() + " - " + p3.taxPaid());
		
		sc.close();
	}

}
