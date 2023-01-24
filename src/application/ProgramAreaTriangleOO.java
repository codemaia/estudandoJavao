package application;

import java.util.Locale;
import java.util.Scanner;

import entities.TriangleOO;

public class ProgramAreaTriangleOO {

	public static void main(String[] args) {
		//resolvendo o problema sem Orientação a Objeto
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("Enter the measures of triangle X:");
		double xA = sc.nextDouble();
		double xB = sc.nextDouble();
		double xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		double yA = sc.nextDouble();
		double yB = sc.nextDouble();
		double yC = sc.nextDouble();
		
		
		double p = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC)); 
		
		p = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Large area: X");
		} else {
			System.out.println("Large area: Y");
		}
		*/
		
		
		// Resolvendo o problema COM Orientação a Objeto
		/*
		 * O Triangulo é uma entidade com 3 atributos (a, b, c)
		 * - criar uma classe para representar o triangulo
		 * 
		 * CLASSE:
		 *  Tipo estruturado que pode conter membros
		 *  	Membros:
		 *  	 Atributos (dados / campos)
		 *  	 Métodos (funções / operações)
		 *  
		 *  a classe pode conter muitos outros recuros como:
		 *  	- Construtores
		 *      - Sobrecarga
		 *      - Encapsulamento
		 *      - Herança
		 *      - Polimorfismo
		 *  
		 *  Exemplos: 
		 *  	Entidades: Produto, Cliente, Triangulo
		 *  	Serviço: ProdutoService, ClienteService, EmailService, StorageService
		 *  	Controladores: ProdutoController, ClientController
		 *  	Utilitários: Calculadora, Compactador
		 *  	Outros (views, repositórios, gerenciadores, etc)
		 * 
		 */
		
		TriangleOO x, y; //declarar x e y
		
		x = new TriangleOO(); //instanciar x e y para podermos usar
		y = new TriangleOO();
		
		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble(); //armazena os dados no atributo x
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area(); 
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Large area: X");
		} else {
			System.out.println("Large area: Y");
		}
		
		
		sc.close();
	}

}
