package gerenciamento.pagamento.br.domain.model.enums;

public enum TiposPagamentosEnums {

    BOLETO_BANCARIO(1,"BOLETO BANCARIO", "Boleto Bancário"),
    CARTAO_DE_CREDITO(2,"CARTAO DE CREDITO", "Cartão De Credito"),
    PAYPAY(3,"PAYPAL","PayPal");

    private final int key;
    private final String descricao;
    private final String mensagem;

    TiposPagamentosEnums(int key, String descricao, String mensagem) {
        this.key = key;
        this.descricao = descricao;
        this.mensagem = mensagem;
    }

    


}
