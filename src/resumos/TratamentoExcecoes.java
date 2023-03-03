package resumos;

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
		
		
		
		try {
			
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} 
		catch (InputMismatchException e) {
			System.out.println("Error - Digite um numero inteiro");
		} 
		
		
		System.out.println("End Program");
		
		
		
		sc.close();

	}

}
