package resumos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.AccountHeranca;
import entities.BusinessAccountHeranca;
import entities.SavingsAccountHeranca;

public class HerancaPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		
		// HERANÇA ############################################################
		
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
		
		
		// UPCASTING E DOWNCASTING ##################################
		
		
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
		
		
		//AccountHeranca acc = new AccountHeranca(1001, "Alex", 0.0);
		BusinessAccountHeranca bacc = new BusinessAccountHeranca(1002, "Maria", 0.0, 500.0);
		
		
		// UPCASTING
		AccountHeranca acc1 = bacc;
		AccountHeranca acc2 = new BusinessAccountHeranca(1003, "Bob", 0.0, 200.0);
		AccountHeranca acc3 = new SavingsAccountHeranca(1004, "Ana", 0.0, 0.1);
		
		
		
		// DOWNCASTING					 //CASTING
		BusinessAccountHeranca acc4 = (BusinessAccountHeranca)acc2;
		acc4.loan(100.0);
		acc4.withdraw(10.0);
		
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
		
		
		
		
		// SOBREPOSIÇÃO OU SOBRESCRITA ##########################################
		
		
		/*
		 * É a implementação de um método de uma superclasse na subclasse
		 * 
		 * É fortemente recomendável usar a notação @Override em um método sobrescrito
		 * 
		 * 
		 */
		
		
		AccountHeranca acc6 = new SavingsAccountHeranca(1006, "Renan Poupança", 0.0, 0.1);
		acc6.deposit(100.0);
		
		System.out.println("SavingsAccount acc6: " + acc6);
		
		acc6.withdraw(10.0);
		
		System.out.println("SavingsAccount acc6: " + acc6);
		
		
		
		// PALAVRA SUPER ##########################################################
			
		/*
		 * É possivel chamar a implementação da superclasse usando a palavra super.
		 * 
		 *  Exemplo: suponha que, na classe BusinessAccount, a regra para saque seja realizar o
			saque normalmente da superclasse, e descontar mais 2.0.
			
			
			@Override
			public void withdraw(Double amount) {
				super.withdraw(amount);
				balance -= 2.0;
			}
			
			
		 */
		
		acc2.deposit(17.0);
		System.out.println(acc2);
		
		acc2.withdraw(5.0);
		System.out.println(acc2);
		
		
		
		
		
		
		
		
		// CLASSES E METODOS FINAL ##########################################
		
		/*
		 * @ Palavra chave: final
		 * 
		 * 	 @ Classe: evita que a classe seja herdada
		 * 		
		 * 		public final class SavingsAccount {
		 * 
		 * 		}
		 * 
		 * 	
		 * 	 @ Metodo: evita que o metodo seja sobreposto
		 * 
		 * 
		 * 	Suponha que voce queira evitar que sejam criadas subclasses
		 * 	de SavingsAccount
		 * 
		 * 		public final class SavingsAccount {
		 * 			(...)
		 * 
		 * 
		 * 	@ Metodo final
		 * 
		 * 		Suponha que voce nao queira que o metodo withdraw de SavingsAccount
		 * 		seja sobreposto
		 * 
		 * 		
		 * 		@Override
		 * 		public final void withdraw(Double amount) {
		 * 		
		 * 			balance -= amount;
		 * 		}
		 * 
		 * 	
		 * 	@ PRA QUE?
		 * 
		 * 		# Segurança: dependendo das regras de negocio, as vezes é desejavel
		 * 			garantir que uma classe nao seja herdada, ou que um metodo nao seja
		 * 			sobreposto.
		 * 		  - Geralmente convem acrescentar final em metodos sobrepostos, pois 
		 * 			sobreposical multiplas podem ser uma porta de entrada para 
		 * 			inconsistencias.
		 * 
		 * 		
		 * 		# Performance: atributos de tipo de uma classe final são analisados	 de
		 * 			forma mais rapida em tempo de execucao.
		 * 			Exemplo classico: String
		 * 
		 *  
		 */
		
		
		
		
		
		
		
		
		// POLIMORFISMO ############################################################
		
		/*
		 * @ PILARES DA OOP
		 * 
		 * 	- Encapsulamento (private) 
		 * 	- Herança (extends)
		 * 	- Polimorfismo
		 * 	
		 * 	
		 * 	@ Em programação orientada a objetos, polimorfismo é o recurso que permite
		 * 	que variaveis de um mesmo tipo mais genérico possam apontar para objetos
		 * 	de tipos especificos diferentes, tendo assim comportamentos diferentes conforme
		 * 	cada tipo especifico.
		 * 
		 *  EX:
		 *  
		 */
		
			//AccountHeranca x = new AccountHeranca(1020, "Renan", 1000.0);
			AccountHeranca y = new SavingsAccountHeranca(1023, "Livia", 1000.0, 0.01);
			
			
			//x.withdraw(50.0);
			y.withdraw(50.0);
			
			//System.out.println(x.getBalance()); //945
			System.out.println(y.getBalance()); //950
		
			
			
			
		
			
			// CLASSES ABSTRATAS ############################################################
			
			/*
			 *  @ São classes que não podem ser instanciadas
			 *  
			 *  
			 *  @ É uma forma de garantir herança total: somente subclasses não
			 *  abstratas podem ser instanciadas, mas nunca a superclasse abstrata
			 * 
			 * 
			 *  <SINTAXE>
			 *  	public abstract class Account {
			 *  		(...)
			 *  	}
			 * 
			 * 
			 * 
			 * 
			 */
			
			
			//AccountHeranca acc11 = new AccountHeranca(1001, "Renan", 1000.0);  <- CLASSE ABSTRATA - NAO PODE SER INSTANCIADA
			// não é possivel instanciar AccountHeranca pois a mesma foi alterada
			// para uma classe abstrata;
			
			AccountHeranca acc22 = new SavingsAccountHeranca(1002, "Tita", 1000.0, 0.01);
			AccountHeranca acc33 = new BusinessAccountHeranca(1003, "Livia", 1000.0, 500.0);
			
			/*
			 * A superclasse generica nos permite tratar de forma facil e uniforme todos os
			 * tipos de conta, inclusive com polimorfismo se for o caso. Por exemplo, voce
			 * pode colocar todos os tipos de contas em uma mesma coleção.
			 * 
			 * Segue exemplo a baixo: 
			 */
			
			List<AccountHeranca> list = new ArrayList<>();
			
			list.add(new BusinessAccountHeranca(1101, "Renan", 1000.0, 500.0));
			list.add(new SavingsAccountHeranca(1102, "Livia", 1000.0, 0.01));
			list.add(new BusinessAccountHeranca(1103, "Tita", 1000.0, 500.0));
			list.add(new SavingsAccountHeranca(1104, "Brisa", 1000.0, 0.01));
			
			
			Double sum = 0.0;
			for (AccountHeranca account : list) {
				sum += account.getBalance();
			}
			
			System.out.println("Total accounts is: " + sum);
			
			for (AccountHeranca account : list) {
				account.deposit(10.0);
			}
			for (AccountHeranca account : list) {
				System.out.println("Updated Account: " + account.getNumber() + " Balance: " + account.getBalance());
			}
			
		sc.close();
	}

}
