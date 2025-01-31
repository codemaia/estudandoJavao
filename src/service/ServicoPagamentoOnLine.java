package service;

public interface ServicoPagamentoOnLine {
    
    double taxaPagamento(double valor);
    double juros(double valor, int meses);
    
}
