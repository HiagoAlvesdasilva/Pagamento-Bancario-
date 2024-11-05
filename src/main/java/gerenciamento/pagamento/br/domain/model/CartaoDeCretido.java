package gerenciamento.pagamento.br.domain.model;

public class CartaoDeCretido extends Pagamento{
    private String nomeDoTitular;
    private String numeroDoCartao;

    public CartaoDeCretido(double valor, String status, String nomeDoTitular, String numeroDoCartao) {
        super(valor, status);
        this.nomeDoTitular = nomeDoTitular;
        this.numeroDoCartao = numeroDoCartao;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado com cartão de crédito para"+ nomeDoTitular);
        this.setStatus("Pago");
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }
}
