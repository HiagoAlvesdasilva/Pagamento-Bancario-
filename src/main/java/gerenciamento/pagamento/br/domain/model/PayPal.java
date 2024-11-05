package gerenciamento.pagamento.br.domain.model;

public class PayPal extends Pagamento{

    private String nomeUsuario;
    private String emailUsuario;

    public PayPal(double valor, String status, String nomeUsuario, String emailUsuario) {
        super(valor, status);
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
    }


    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado com PayPal na Conta de: "+ getNomeUsuario()+ " com email: "+ getEmailUsuario());
        this.setStatus("Pago");
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
