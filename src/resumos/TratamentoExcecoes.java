package resumos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TratamentoExcecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		// # INICIO SOBRE EXCECOES
		
		/*
		 * Exceçoes
		 * 
		 * 	- Uma exceção é qualquer condição de erro ou comportamento inesperado
		 * 	  encontrado por um programa em execução
		 * 
		 *  - Em Java, uma execução é um objeto herdado da classe:
		 *    @ java.lang.Exception - o compilador obriga a tratar ou propagar
		 *    
		 *    @ java.lang.RuntimeException - o compilador não obriga a tratar ou propagar
		 * 
		 *  
		 *  - Quando lançada, uma execução é propagada na pilha de chamadas de métodos
		 *    em execução, até que seja capturada (tratada) ou o programa seja encerrado.
		 * 
		 * 
		 * 
		 *   # Hierarquia de exceções do Java
		 *   
		 *   https://docs.oracle.com/javase/10/docs/api/java/lang/package-tree.html
		 *   
		 *   
		 *   
		 *   
		 *   Excecoes que não é obrigado a tratar:
		 *   
		 *   - Error -> OutOfMemoryError = erro de estouro de memoria
		 *   		 -> VirtualMachineError = erro na maquina virtual do java
		 *   
		 * 
		 * 	 - Exception -> IOException = erro de entrada e saída
		 * 					RuntimeException = não te obriga a tratar ex:
		 * 						- IndexOutOfBoundsException = quando tenta acessar uma posição
		 * 													  do array que não existe.
		 * 						- NullPointerException = quando tenta acessar uma variavel
		 * 										         que esta valendo nulo
		 * 
		 * 
		 * 
		 *  @ Vantagens :
		 *  	- Delega a lógica do erro para a classe responsavel por conhecer as regras
		 *  		que ocasionam o erro
		 *  
		 *      - Trata de forma organizada (inclusive hierarquica) execeções de tipos diferentes
		 *      - A excecao pode carregar dados quaisquer.
		 * 
		 * 
		 */
		
		
		
		
		// # ESTRUTURA TRY-CATCH
		
		
		/*
		 * 
		 * Estrutura try-catch
		 * 
		 * 	# Bloco try
		 * 	 - Contém o código que representa a execução normal do trecho de código que 
		 * 		pode acarretar em uma exceção
		 * 
		 * 
		 *  # Bloco catch
		 *   - Contém o código a ser executado caso uma exceção ocorra
		 *   - Deve ser especificado o tipo da exceção a ser tratada (upcasting é permitido)
		 *   
		 *   
		 *   
		 *   Sintaxe
		 *   
		 *   
		 *   try {
		 *   	Logica que podera acarretar em um erro
		 *   }
		 *   catch (ExceptionType e) {
		 *   	captura e tratamento do erro.
		 *   }
		 *   catch (ExceptionType e) { -> Tipo do erro + apelido
		 *   	posso ter quantos catch for necessário
		 *   }
		 *  
		 * 
		 * 
		 * 
		 */
		
		
		/*
		try {
			
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} 
		catch (InputMismatchException e) {
			System.out.println("Error - Digite um numero inteiro");
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + " é um erro que ocorro quando não encontro a posicao do array");
		}
		
		System.out.println("End of Program");
		*/
		
		
		
		
		
		
		// # PILHA DE CHAMADAS DE MÉTODOS (STACK TRACE)
		
		
		/*
		 * e.printStackTrace()
		 * 
		 *  para verificarmos o tracker das chamadas de erro
		 * 
		 * 
		 * 
		 */
		
		
		

		//method1();
		//System.out.println("End of Program");
		
		
		
		


		
		
		
		// # BLOCO FINALLY
		
		
		/*
		 *  É um bloco que contém código a ser executado independentemente de ter
		 *   ocorrido ou não uma exceção.
		 * 
		 *  Exemplo clássico: fechar um arquvio, conexão de banco de dados, ou outro
		 *   recurso especifico ao final do processamento
		 *   
		 *   
		 *   Sintaxe:
		 *   
		 *   try {
		 *   
		 *   }
		 *   catch (ExceptionType e) {
		 *   
		 *   }
		 *   finally {
		 *   
		 *   }
		 * 
		 *  ## Sempre é executado!
		 * 
		 */
		
		
		/*
		File file = new File("E:\\java.txt");
		Scanner sc2 = null;
		
		try {
			sc2 = new Scanner(file);
			
			while(sc.hasNextLine()) {
				System.out.println(sc2.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if (sc2 != null) {
				sc2.close();
			}
			
			System.out.println("Finally block executed");
		}
		*/
		
		
		
		
		
		
		
		// # CRIANDO EXCECOES PERSONALIZADAS
		
		/*
		 * 
		 *  @ SUGESTAO DE PACOTES "MODEL"
		 * 		
		 * 		MODEL 
		 *        L entities
		 *        L enums
		 *        L exception
		 *        L services
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		

	}

	
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		
		try {
			
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} 
		catch (InputMismatchException e) {
			System.out.println("Error - Digite um numero inteiro");
			
			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + " é um erro que ocorro quando não encontro a posicao do array");
			e.printStackTrace();
			sc.next();
		}
		
		
		sc.close();
		System.out.println("***METHOD2 END***");
		
	}
	
}
