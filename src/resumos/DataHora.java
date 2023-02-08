package resumos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class DataHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		//OPERAÇOES IMPORTANTES COM DATA-HORA
		
	/*
	 * # INSTANCIAÇÃO
	 *  - (agora) -> Data-hora
	 *  - Texto ISO 8601 -> Data-hora
	 *  - Texto formato customizado - Data-hora
	 *  - dia, mes, ano, [horario] -> Data-hora local
	 * 
	 * 
	 * # FORMATACAO
	 *  - Data-hora -> Texto ISO 8601
	 *  - Data-hora -> Texto formato customizado
	 * 
	 * 
	 * 
	 * # OBTER DADOS DE UMA DATA-HORA LOCAL
	 *  - Data-hora local -> dia, mês, ano, horario
	 *  
	 *  
	 * # CONVERTER DATA-HORA GLOBAL PARA LOCAL
	 * 	- Data-hora global, timezone (sistema local) -> Data-hora local
	 * 
	 *  
	 * # Cálculos com data-hora
	 * 	- Data-hora +/- tempo -> Data-hora
	 * 	- Data-hora 1, Data-hora 2 -> Duração 
	 * 
	 * 
	 *  #PRINCIPAIS TIPOS
	 *  
	 *  @Data-hora local
	 *   - LocalDate
	 *   - LocalDateTime
	 *   
	 *  @Data-hora globl
	 *   - Instant
	 *   
	 *   
	 *  @Duração
	 *   - Duration
	 *   
	 *  @Outros
	 *   - ZoneId
	 *   - ChronoUnit
	 * 
	 * 
	 */

		// INSTANCIANDO LOCALDATE
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//Customizando uma data-hora "Instant"
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());   
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 =  LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-02-07");
		LocalDateTime d05 = LocalDateTime.parse("2023-02-07T09:30:30");
		Instant d06 = Instant.parse("2023-02-08T01:30:30Z");
		Instant d07 = Instant.parse("2023-02-07T09:30:30-03:00");
		
		LocalDate d08 = LocalDate.parse("01/01/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("01/01/2023 00:35", fmt2);
		LocalDate d10 = LocalDate.of(2023, 02, 07);
		LocalDateTime d11 = LocalDateTime.of(2033, 02, 07, 1, 30);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);	
		
		//imprimir data formatada / customizada	
		System.out.println("d04 customizado = " + d04.format(fmt1));
		//ou
		System.out.println("ou d04 customizado = " + fmt1.format(d04));
		
		//customizando Instant
		System.out.println("d06 customizado = " + fmt3.format(d06));
		
		
		
		// CONVERTENDO DATA-HORA GLOBAL PARA LOCAL

		/**
		 *  # converter daa-hora global para local necessita colocar 
		 *  o TIMEZONE
		 * 
		 * 
		 */
		 
		
		LocalDateTime r1 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
//		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		System.out.println("r1 = " + r1);
		
		//pegar dia / mes / ano / hora / minuto
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d06 minuto = " + d05.getMinute());
		
		
		sc.close();

	}

}
