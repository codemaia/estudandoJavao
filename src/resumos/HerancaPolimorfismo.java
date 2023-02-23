package resumos;

import java.util.Scanner;

import entities.AccountHeranca;
import entities.BusinessAccountHeranca;
import entities.SavingsAccountHeranca;

public class HerancaPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		
		// HERANÇA
		
		/*
		 * É um tipo de associação que permite que uma classe herde todos dados
		 *  e comportamentos de outra
		 *  
		 *  #Definiçoes importantes
		 *  	Relação "é um"
		 *  	- Generalização / especialização
		 *  	- Superclasse (Classe base)	/ subclasse (classe derivada)
		 *  	- Herança / extensão
		 *  	- Herança é uma associação entre classes (e nao entre objetos)
		 *  
		 *  #Vantagens
		 *   - Reuso
		 *   - Polimorfismo
		 *   
		 *  #Sintaxe
		 *   - class A extends B;
		 *   
		 *   
		 * 
		 */
		
		
		// UPCASTING
		AccountHeranca acc10 = new BusinessAccountHeranca(111, "Renan", 0.0, 100.0);
										
		// DOWNCASTING					//CASTING
		BusinessAccountHeranca acc20 = (BusinessAccountHeranca) acc10;
		//System.out.println(acc10);
		
		acc20.loan(100.0);
		//System.out.println(acc10);
		
		
		// UPCASTING E DOWNCASTING
		
		
		/**
		 * # UPCASTING
		 * 	- Casting da subclasse para a superclasse
		 *  - Uso comum; polimorfismo
		 *  
		 *  
		 * # DOWNCASTING
		 * 	- Casting da superclasse para a subclasse
		 *  - Palavra instanceof -> Serve para comparar as instancias das classes
		 *  - Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)
		 * 
		 */
		
		
		AccountHeranca acc = new AccountHeranca(1001, "Alex", 0.0);
		BusinessAccountHeranca bacc = new BusinessAccountHeranca(1002, "Maria", 0.0, 500.0);
		
		
		// UPCASTING
		AccountHeranca acc1 = bacc;
		AccountHeranca acc2 = new BusinessAccountHeranca(1003, "Bob", 0.0, 200.0);
		AccountHeranca acc3 = new SavingsAccountHeranca(1004, "Ana", 0.0, 0.1);
		
		
		
		// DOWNCASTING					 //CASTING
		BusinessAccountHeranca acc4 = (BusinessAccountHeranca)acc2;
		acc4.loan(100.0);
		
		
		//error, acc3 não é BusinessAccount e sim SavingsAccount
		//BusinessAccountHeranca acc5 = (BusinessAccountHeranca)acc3;
		
		// MODO CORRETO:
		if (acc3 instanceof BusinessAccountHeranca) {
			BusinessAccountHeranca acc5 = (BusinessAccountHeranca)acc3;
			acc5.loan(200.0);
			System.out.println("LOAN!");
		}
		
		if (acc3 instanceof SavingsAccountHeranca ) {
			SavingsAccountHeranca acc5 = (SavingsAccountHeranca)acc3;
			acc5.updateBalance();
			System.out.println("UPDATE!");
			
		}
		
		
		
		System.out.println(acc1);
		System.out.println(acc4);
		//System.out.println(acc5);
		
		sc.close();
	}

}
