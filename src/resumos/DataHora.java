package resumos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 =  LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-02-07");
		LocalDateTime d05 = LocalDateTime.parse("2023-02-07T09:30:30");
		Instant d06 = Instant.parse("2023-02-07T09:30:30Z");
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
		
		
		
		
		
		
		
		sc.close();

	}

}
