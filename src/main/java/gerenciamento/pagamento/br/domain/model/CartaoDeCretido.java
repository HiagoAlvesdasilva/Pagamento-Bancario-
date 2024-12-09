package gerenciamento.pagamento.br.domain.model;

import gerenciamento.pagamento.br.domain.model.enums.StatusPagamentoEnum;

public class CartaoDeCretido extends Pagamento{
    private String nomeDoTitular;
    private String numeroDoCartao;

    public CartaoDeCretido(double valor, StatusPagamentoEnum statusPagamento) {
        super(0.0,StatusPagamentoEnum.PENDENTE);
    }

    public CartaoDeCretido(double valor, StatusPagamentoEnum statusPagamento, String nomeDoTitular, String numeroDoCartao) {
        super(valor, statusPagamento);
        this.nomeDoTitular = nomeDoTitular;
        this.numeroDoCartao = numeroDoCartao;
    }

    @Override
    public void verificarStatus() {
        if (getStatusPagamento() == StatusPagamentoEnum.PENDENTE){
            realizarPagamento();
        } else if (getStatusPagamento() == StatusPagamentoEnum.AGUARDANDO_CONFIRMACAO_DE_PAGAMENTO){
            System.out.println("Aguardando Confirmação do pagamento da fatura");
        }else {
            System.out.println("a Fatura ja esta Paga");
        }
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado com cartão de crédito para"+ getNomeDoTitular());
        this.setStatusPagamento(StatusPagamentoEnum.PAGO);
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
