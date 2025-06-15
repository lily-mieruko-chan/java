package org.example;
import org.example.FormaPagamento;

public class Pagamento {
    private FormaPagamento forma;
    private double valorTotal;

    public FormaPagamento getForma() {
        return forma;
    }

    public void setForma(FormaPagamento forma) {
        this.forma = forma;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
