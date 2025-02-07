package service;

import entities.Contrato;
import entities.Parcelamento;
import java.time.LocalDate;

public class ContractService {
    
    private ServicoPagamentoOnLine servicoPagamentoOnLine;

    public ContractService(ServicoPagamentoOnLine servicoPagamentoOnLine) {
        this.servicoPagamentoOnLine = servicoPagamentoOnLine;
    }

    public void processContract(Contrato contrato, int meses) {
        double valorBase = contrato.getValorTotal() / meses;
        
        for (int i = 1; i <= meses; i++) {
            LocalDate dataVencimento = contrato.getDate().plusMonths(i);
            double juros = servicoPagamentoOnLine.juros(valorBase, i);
            double taxa = servicoPagamentoOnLine.taxaPagamento(valorBase + juros);
            double valorFinal = valorBase + juros + taxa;
            contrato.getParcelamentos().add(new Parcelamento(dataVencimento, valorFinal));
        }
    }

}
