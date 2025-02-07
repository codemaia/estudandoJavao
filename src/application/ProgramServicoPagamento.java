package application;

import entities.Contrato;
import entities.Parcelamento;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import service.ContractService;
import service.PaypalService;

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

        System.out.print("Valor do contrato: ");
        double valorContrato = sc.nextDouble();

        Contrato obj = new Contrato(numberContract, dataContrato, valorContrato);

        System.out.print("Entre com o numero de parcelas: ");
        int numeroParcelas = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(obj, numeroParcelas);


        System.out.println("Parcelas:");
        for (Parcelamento parcelamento : obj.getParcelamentos()) {
            System.out.println(parcelamento);
        }

        sc.close();
    }
}
