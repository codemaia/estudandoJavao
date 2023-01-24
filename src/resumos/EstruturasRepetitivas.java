package resumos;

import java.util.Scanner;

public class EstruturasRepetitivas {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//ESTRUTURA REPETITIVA PARA (FOR) ##################
		/* 
		 * Usa-se quando se sabe previamente a quantidade de
		 * 	repetições, ou o intevalo de valores.
		 * 
		 * for (inicio ; condição ; increvemento ) {
		 * 	comando 1
		 * 	comando 2
		 * }
		 * 
		 
		
		int N = sc.nextInt();
		int soma = 0 ;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
			
		}
		
		System.out.println(soma);
		
		*/
			
		
		// EXERCICO FOR #############
		
		
		
		// EXERCICO 1
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). 
		 * Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
			X, se for o caso.
		 * 
		
		
		int x = sc.nextInt();
			
		for (int i = 0; i <= x; i++) {
			if (i % 2 !=0) {
				System.out.println(i);
			}
		}
		
		*/
		
		
		
		//EXERCICIO 2
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

		 * 
		 
		int x = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < x; i++) {
			int values = sc.nextInt();
			
			if (values >= 10 && values <= 20) {
				in++;
				
			} else {
				out++;
				
			}
			
		}	
		
		System.out.println(in + " in\n" + out + " out");		
		*/
		
		
		
		
		// EXERCICIO 3
		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
		 * Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
		 * Apresente a média ponderada para cada um destes conjuntos de 3 valores, 
		 * sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
		 * 
		 
		
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
			
			double result = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;
			
			System.out.printf("%.1f%n", result);
		}
		
		
		*/
		
		
		
		
		// EXERCICIO 4
		
		/*
		 * Fazer um programa para ler um número N. 
		 * Depois leia N pares de números e mostre a divisão do primeiro pelo
		  segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		 * 
		 * 
		 
		
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				double result = (double) x / y;
				System.out.println(result);
			}
			
		}
		
		*/
		
		
		
		// EXERCICIO 6
		
		/*
		 * 
		 * Ler um número inteiro N e calcular todos os seus divisores.
		 * 
		 */
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			
			if (N %  i == 0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		sc.close();
	}
}
