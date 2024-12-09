package gerenciamento.pagamento.br.domain.model;

import gerenciamento.pagamento.br.domain.model.enums.StatusPagamentoEnum;

public abstract class Pagamento {
    private double valor;
    private StatusPagamentoEnum statusPagamento;

    public Pagamento(double valor, StatusPagamentoEnum statusPagamento) {
        this.valor = valor;
        this.statusPagamento = statusPagamento;
    }

    public abstract void realizarPagamento();

    public abstract void verificarStatus();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public StatusPagamentoEnum getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamentoEnum statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
}
