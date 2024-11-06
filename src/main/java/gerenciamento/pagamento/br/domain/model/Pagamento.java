package gerenciamento.pagamento.br.domain.model;

public abstract class Pagamento {
    private double valor;
    private String status;

    public Pagamento(double valor, String status) {
        this.valor = valor;
        this.status = "Pendente";
    }

    public abstract void realizarPagamento();

    public String verificarStatus() {
        return status;
    }

    public double getValor() {
        return valor;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
