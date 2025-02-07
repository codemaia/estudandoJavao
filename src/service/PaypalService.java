package service;

import java.text.DecimalFormat;

public class PaypalService implements ServicoPagamentoOnLine {

    @Override
    public double taxaPagamento(double valor) {
            return valor * 0.02;

    }

    @Override
    public double juros(double valor, int meses) {
        
        DecimalFormat df = new DecimalFormat("0.00");
        /*
         * pegar o valor do contrato e dividir pelos meses
         */
        double valorParcela = valor * meses;
        double juros = valorParcela * 0.01;
        
        return juros;
    
    }
    
}   
