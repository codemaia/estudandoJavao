package resumos;

import java.util.Scanner;

public class ComportamentoDeMemoriaArraysListas {

	public static void main(String[] args) {
		
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
		
		
		
		
		// VETORES
		
		/**
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		sc.close();

	}

}
