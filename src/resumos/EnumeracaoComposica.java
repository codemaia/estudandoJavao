package resumos;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.OrderStudy;
import entities.enums.OrderStatus;

public class EnumeracaoComposica {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// ENUMERAÇÕES
		
		/*
		 * É um tipo especial que serve para especificar de forma
		 * literal um conjunto de constantes relacionadas
		 * 
		 * Palavra chave em Java: enum
		 * 
		 * Vantagem: melhor semantica, codigo mais legivel e auxiliado
		 * pelo compilador
		 * 
		 * 
		 * 
		 * https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
		 */
		
		
		
		//testing
		
		/*
		OrderStudy orderStudy = new OrderStudy(1080, new Date(), OrderStatus.DELIVERED);
		
		System.out.println(orderStudy);
	
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		*/
		
		
		
		
		
		
		
		// DESIGNER (IMPORTANTE)
		
		/**
		 * #CATEGORIA DE CLASSES
		 * 
		 * 	Em um sistema orientado a objetos, de modo geral "tudo" é objeto
		 *  
		 *  Por questoes de design tais como organização, flexibilidade, reuso,
		 *  delegação, etc., há várias categorias de classes.
		 *  
		 *  
		 *  telas do sistema	/ clientes, pedidos... entidades de negocios
		 *    |								|
		 *  VIEWS      CONTROLLERS      ENTITES
		 *  				|
		 *  			faz a conexão
		 *  		entre a tela e o sistema
		 *  
		 *  
		 *  	SERVICES 			REPOSITORES
		 *  		|						|
		 *  					Objetos responsaveis por acessar os
		 * Serviçe?     		 dados de um banco de dados.
		 * 
		 * 
		 */
		
		
		
		
		
		// COMPOSIÇAO
		
		
		/*
		 * Composição
		 * 
		 * 	- É um tipo de associação que permite que um objeto contenha outro
		 *  
		 *  - Relação "tem-um" ou "tem-vários"
		 *  
		 *  
		 *  # Vantagens
		 *  	- Organização: divisão de responsabilidades
		 *  	- Coesão
		 *  	- Flexibilidade
		 *  	- Reuso
		 *  
		 *  Nota: Embora o símbolo UML para composição (todo-parte) seja o diamante
		 *  	  preto, neste contexto estamos chamando de composição qualquer associação tipo 
		 *  	  "tem-um" e "tem-vários"
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		sc.close();
	}

}
