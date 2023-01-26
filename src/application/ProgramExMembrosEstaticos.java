package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramExMembrosEstaticos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double manyDollars = sc.nextDouble();
		double cC = CurrencyConverter.Converter(dollar, manyDollars);
		System.out.print("Amount to be paid in reai = " + cC);
		
		
		
		sc.close();

	}

}
