package resumos;



import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ComportamentoDeMemoriaArraysListas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		// TIPOS REFÊRENCIA VS TIPOS VALOR
		
		/**
		 * Tipos referencia :
		 * 	CLASSE
		 * # Vantagem: usufrui de todos recursos OO
		 * # Variáveis são ponteiros
		 * # Objetos precisam ser instanciados usando new, ou
		 * 	apontar para um objeto já existente
		 * # Aceita valor null
		 * # Y = X
		 * 	"Y passa a apontar para onde X aponta"
		 * # Objetos instanciados no heap
		 * # Objetos não utilizados são desalocados em um
		 * 	momento próximo pelo garbage collector
		 *	
		 *
		 * Tipos primitivos
		 * 	ex: double p / int x
		 * 
		 * # Vantagem: é mais simples e mais performático
		 * # Variáveis são caixas
		 * # Não instancia. Uma vez declarados, estão prontos
		 * 	 para uso
		 * # Não aceita null
		 * # Y = X
		 * 	 "Y recebe uma cópia de X"
		 * # "Objetos" instanciados no stack
		 * # "Objetos" são desalocados imediatamente quando 
		 *  seu escopo de execução é finalizado
		 * 
		 *
		 */
		
		
		
		// DESALOCAÇÂO DE MEMORIA - GARBAGE COLLECTOR E ESCOPO LOCAL
		
		/**
		 * 
		 * Objetos alocados dinamicamente, quando não possuem mais
		 * referêcia para eles, serão desalocados pelo garbage collector.
		 * 
		 * 
		 * Váriáveis locais são desalocadas imediatamente assim 
		 * 	que seu escopo local sai de execução.
		 * 
		 */
		
		
		
		
		// VETORES (ARRAYS)
		
		/**
		 * # Vantagens
		 * 	- Acesso imediato aos elementos pela sua posição
		 * 
		 * # Desvantagens
		 *  - Tamanho fixo (precisamos alocar previamente o tamanho que precisamos)
		 *  - Dificuldade para se realizar inserções e deleções.
		 * 
		 * 
		 */
		
		
		//EXEMPLO VETOR (COM VARIAVEIS)
		
		/*
		int n = sc.nextInt();
		
		//CRIANDO VETOR / ARRAY
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.print("AVERAGE HEIGHT: " + avg);
		*/
		
		
		
	// CRIANDO VETORES (ARRAYS) COM ELEMENTOS DE OBJETOS TIPO CLASSE
		
		/*
		int n = sc.nextInt();
		
		//declarar vetor de objeto tipo classe
		ProductVetorArray[] vect = new ProductVetorArray[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new ProductVetorArray(name, price); 
			
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.print("AVERAGE HEIGHT: " + avg);
		*/
		
		
		
		
		
		//BOXING, UNBOXING E WRAPPER CLASSES
		
		/*
		 * BOXING: É o processo de conversão de um objeto tipo valor
		 *  para um objeto tipo referência compatível
		 * 
		 * 
		 * UNBOXING: É o processo de conversão de um objeto tipo referência
		 * 	para um objeto tipo valor compatível.
		 * 
		 * 
		 *  WRAPPER CLASSES:
		 *  - São classes equivalentes aos tipos primitivos
		 *   int -> primitivo (não aceita nulo)
		 *   Integer -> Wrapper class (aceita nulo) (tipo referencia)
		 *   
		 *   double -> primitivo (não aceita nulo)
		 *   Double -> Wrapper class (aceita nulo) (tipo referencia)
		 *   
		 *  - Boxing e Unboxing é natural na linguagem
		 *  - Uso Comum: Campos de entidades em sistemas de informação
		 *  	Pois tipos referência (classes) aceitam valor null e
		 *  	usufruem dos recursos OO
		 */
		
		/*
		int x = 20;		
		Object obj = x;
		System.out.println(obj);
		
		int y = (int) obj;
		System.out.println(y);
		
		
		
		//WRAPPER CLASS:
		
		Integer x = 10;
		int y = x * 2;
		
		//EX CLASS:
		
		public class Prod {
			public String nome;
			public Double price;
			public Integer quantity;
		}
		*/
	
		
		
		
		
		//LAÇO FOR EACH
		
		/**
		 * SINTAXE
		 * 
		 * for (TIPO APELIDO : COLECAO  {
		 * 
		 * }
		 * 
		 * 
		 */
		
		/*
		String[] vect = new String[] {"Livia", "Tita", "Brisa", "Marcia"};
		
		
		for (String name : vect) {
			System.out.println(name);
		}
		
		*/
		
		
		
		
		//LISTAS - 
		
		/**
		 * # Lista é uma estrutura de dados:
		 * 	- Homogenea (dados do mesmo tipo)
		 *  - Ordenada (elementos acessados por meio de posiçoes)
		 *  - Inicia vazia, e seus elementos são alocados sob demanda
		 *  - Cada elemento ocupa um "nó" (ou nodo) da lista
		 *  
		 * # Tipo (Interface): List
		 * # Classes que implementam: ArrayList, LinkedList, etc.
		 * 
		 * # Vantagem:
		 *  - Tamanho variável
		 *  - Facilidade para se realizar inserção e deleções
		 *  
		 * # Desvantagens:
		 * 	- Acesso sequencial aos elementos
		 * 
		 * 
		 * 
		 */
		
		/* # COMANDOS IMPORTANTES - LISTA - ARRAY
		 * 
		 * @ TAMANHO DA LISTA: size()
		 * @ INSERIR ELEMENTO NA LISTA: add(obj), add(int, obj)
		 * @ REMOVER ELEMENTOS DA LISTA: remove(obj), remove(int), removeIf(Predicate)
		 * @ ENCONTRAR POSICAO DE ELEMENTO: indexOf(obj), lastIndexOf(obj)
		 * @ FILTRAR LISTA COM BASE EM PREDICADO:
		 * List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList())
		 * 
		 * @ ENCONTRAR PRIMEIRA OCORRENCIA COM BASE EM PREDICADO:
		 * Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null).
		 * 
		 */
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		
		System.out.println(list.size());
		
		for (String names : list) {
			System.out.println(names);
		}
		
		System.out.println("-------------------");
		//remover
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String names : list) {
			System.out.println(names);
		}
		System.out.println("-------------------");
		
		//achar o index:
		System.out.println(list.indexOf("Bob"));
		
		//quando não achar o index retorna -1
		System.out.println(list.indexOf("Marco"));
		
		System.out.println("-------------------");
		
		//Filtrar
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A' ).collect(Collectors.toList());
		System.out.println(result);
		for (String names : result) {
			System.out.println(names);
		}
		System.out.println("-------------------");
		
		String name = list.stream().filter(x -> x.charAt(1) == 'w' ).findFirst().orElse("tem nao");
		System.out.println(name);
		
		sc.close();
	}

}
