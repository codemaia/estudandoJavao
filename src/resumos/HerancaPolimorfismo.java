package resumos;

import java.util.Scanner;

import entities.AccountHeranca;
import entities.BusinessAccountHeranca;

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
		
		
		BusinessAccountHeranca acc1 = new BusinessAccountHeranca(111, "Renan", 0.0, 100.0);
		
		System.out.println(acc1);
		
		acc1.loan(100.0);
		System.out.println(acc1);
		
		
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
		
		
		
		
		sc.close();
	}

}
