package entities;

import java.time.LocalDate;

public class Contrato {
    
    private int numeroContrato;
    private LocalDate date;
    private Double valorTotal;

    public Contrato () {

    }

    public Contrato(int numeroContrato, LocalDate date, Double valorTotal) {
        this.numeroContrato = numeroContrato;
        this.date = date;
        this.valorTotal = valorTotal;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contrato{");
        sb.append("numeroContrato=").append(numeroContrato);
        sb.append(", date=").append(date);
        sb.append(", valorTotal=").append(valorTotal);
        sb.append('}');
        return sb.toString();
    }


    
}
