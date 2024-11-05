package gerenciamento.pagamento.br.domain.model;

public class BoletoBancario extends Pagamento{

    private String codigoDeBarras;

    public BoletoBancario(double valor, String status, String codigoDeBarras) {
        super(valor, status);
        this.codigoDeBarras = codigoDeBarras;
    }

    public String gerarCodigoBarras() {
        return "12345678901234567890";
    }

    @Override
    public void realizarPagamento() {
        String codigoBarras = gerarCodigoBarras();
        System.out.println("Gerado boleto bancário com código: " + codigoBarras+ " no valor de R$"+ this.getValor());
    this.setStatus("Aguardando Pagamento");
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
}
