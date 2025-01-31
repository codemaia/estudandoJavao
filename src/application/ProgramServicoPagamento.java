package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contrato;

public class ProgramServicoPagamento {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Contrato contrato;

        System.out.println("Entre os dados do contrato:");

        System.out.print("Numero: ");
        int numberContract = sc.nextInt();
        
        System.out.print("Data (dd/MM/yyyy): ");
        String date = sc.next();
        LocalDate dataContrato = LocalDate.parse(date, formatter);
        LocalDate dataContratoMais30diDias = dataContrato.plusDays(30);

        System.out.print("Valor do contrato: ");
        double valorContrato = sc.nextDouble();

        System.out.print("Entre com o numero de parcelas: ");
        int numeroParcelas = sc.nextInt();

        System.out.println("Parcelas:");

        contrato = new Contrato(numberContract, dataContrato, valorContrato);


        System.out.println(contrato);
        //System.out.println(dataContratoMais30diDias);
      

        sc.close();
    }
}
