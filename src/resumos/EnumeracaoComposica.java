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
		
		OrderStudy orderStudy = new OrderStudy(1080, new Date(), OrderStatus.DELIVERED);
		
		System.out.println(orderStudy);
	
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
		sc.close();
	}

}
