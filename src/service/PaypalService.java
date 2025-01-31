package service;

public class PaypalService implements ServicoPagamentoOnLine {

    public double taxaPagamento(double valor) {
            return valor * 0.02;

    }

    public double juros(double valor, int meses) {
        
    }
    
}
