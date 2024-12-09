package gerenciamento.pagamento.br.domain.model;

import gerenciamento.pagamento.br.domain.model.enums.StatusPagamentoEnum;

public class PayPal extends Pagamento{

    private String nomeUsuario;
    private String emailUsuario;

    public PayPal(double valor, StatusPagamentoEnum statusPagamento, String nomeUsuario, String emailUsuario) {
        super(valor, statusPagamento);
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
    }

    public PayPal(double valor, StatusPagamentoEnum statusPagamento) {
        super(0.0,statusPagamento);
    }

    @Override
    public void verificarStatus() {
        if (getStatusPagamento() == StatusPagamentoEnum.PENDENTE){
            realizarPagamento();
        } else if (getStatusPagamento() == StatusPagamentoEnum.AGUARDANDO_CONFIRMACAO_DE_PAGAMENTO){
            System.out.println("Aguardando Confirmação do pagamento");
        }else {
            System.out.println("a conta ja esta Paga");
        }
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado com PayPal na Conta de: "+ getNomeUsuario()+ " com email: "+ getEmailUsuario());
        this.setStatusPagamento(StatusPagamentoEnum.PAGO);
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
}
