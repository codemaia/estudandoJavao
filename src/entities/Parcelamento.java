package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelamento {
    
    private LocalDate dataVencimento;
    private Double valor;

    public Parcelamento () {

    }

    public Parcelamento(LocalDate dataVencimento, Double valor) {
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
        return dataVencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
               + " - " 
               + String.format("%.2f", valor);
    }


}
