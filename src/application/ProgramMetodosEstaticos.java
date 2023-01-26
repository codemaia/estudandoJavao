package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

//MEMBROS ESTATICOS 

		/**
		 * 
		 * CLASSE possui membros 
		 * 	que são ATRIBUTOS e MÉTODOS
		 * 
		 * Também chamados membros de classe
		 *  - Em oposiçao a membros e instância
		 *  
		 *  São membros que fazem sentido idependente do objeto.
		 *  Não precisam de objeto para serem chamados.
		 *  São chamados a partir do próprio nome da classe.
		 *  
		 *  
		 *  Aplicações comuns:
		 *  - Classes utilitárias ---> Math.sqrt(double)
		 *  - Declarações de constantes
		 *  
		 *  
		 *  Uma classe que possui somente membros estátios, pode ser
		 *	 uma classe estática também.
		 *	Esta classe não poderá ser instanciada.
		 *
		 *	
		 *	DECLARAR UMA CONSTANTE:
		 *	
		 *	fora do main declarar:
		 *	EX: PI
		 *	
		 *	public static final double PI = 3.14159;
		 *		//uma const é escrita com todas as letras maiusculas
		 *		//e não utilizamos camelCase e sim _ -> NET_SALARY
		 *
		 *	
		 *	# resumao
		 *	# metodos estaticos são utilizados quando precisamos usar a função
		 *	# em 'coisas' que não vão mudar o seu valor
		 *
		 *	PODEMOS CHAMAR OS METODOS DIRETAMENTE DO NOME DA CLASSE
		 *	SEM PRECISAR INSTANCIAR. :D
		 * 	
		 */

public class ProgramMetodosEstaticos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.Circumference(radius);
		double v = Calculator.Volum(radius);
		
		System.out.println("Circumference: " + c);
		System.out.println("Volume: " + v);
		System.out.println("PI value: " + Calculator.PI);
		
		sc.close();

	}

}
