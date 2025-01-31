package entities;

import java.time.LocalDate;

public class Parcela {
    
    private LocalDate dataVencimento;
    private Double valor;

    public Parcela () {

    }

    public Parcela(LocalDate dataVencimento, Double valor) {
        this.dataVencimento = dataVencimento;
        this.valor = valor;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parcela{");
        sb.append("dataVencimento=").append(dataVencimento);
        sb.append(", valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }


}
