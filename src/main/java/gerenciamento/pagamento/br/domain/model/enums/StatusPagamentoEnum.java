package gerenciamento.pagamento.br.domain.model.enums;

public enum StatusPagamentoEnum {

    PAGO(1,"Pago","Debito Quitado"),
    AGUARDANDO_CONFIRMACAO_DE_PAGAMENTO(2,"Aguardando","Aguardando Confirmação de Pagamento"),
    PENDENTE(3,"Pendente","Debito Pendente");

    private final int key;
    private final String descricao;
    private final String mensagem;

    StatusPagamentoEnum(int key, String descricao, String mensagem) {
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

    public static StatusPagamentoEnum escolha(int key){
        switch (key){
            case 1:
                return PAGO;
            case 2:
                return AGUARDANDO_CONFIRMACAO_DE_PAGAMENTO;
            case 3:
                return PENDENTE;
            default:
                throw new IllegalArgumentException("Escolha Invlálida: "+ key);

        }
    }
}
