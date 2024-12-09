package gerenciamento.pagamento.br.domain.model.enums;

public enum TiposDePagamentosEnums {

    BOLETO_BANCARIO(1,"BOLETO BANCARIO", "Boleto Bancário"),
    CARTAO_DE_CREDITO(2,"CARTAO DE CREDITO", "Cartão De Credito"),
    PAYPAL(3,"PAYPAL","PayPal");

    private final int key;
    private final String descricao;
    private final String mensagem;

    TiposDePagamentosEnums(int key, String descricao, String mensagem) {
        this.key = key;
        this.descricao = descricao;
        this.mensagem = mensagem;
    }

    public int getKey() {
        return key;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMensagem() {
        return mensagem;
    }

    public static TiposDePagamentosEnums key(int escolha){
        switch (escolha){
            case 1:
                return BOLETO_BANCARIO;
            case 2:
                return CARTAO_DE_CREDITO;
            case 3:
                return PAYPAL;
            default:
                throw  new IllegalArgumentException("Escolha inválida: "+escolha);
        }
    }
}
