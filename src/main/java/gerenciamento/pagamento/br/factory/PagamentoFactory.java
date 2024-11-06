package gerenciamento.pagamento.br.factory;

import gerenciamento.pagamento.br.domain.model.BoletoBancario;
import gerenciamento.pagamento.br.domain.model.CartaoDeCretido;
import gerenciamento.pagamento.br.domain.model.Pagamento;
import gerenciamento.pagamento.br.domain.model.PayPal;

public class PagamentoFactory {
    public static Pagamento criarPagamento(String tipo, double valor, String status) {
        validarParametros(tipo, status);

        if (tipo.equalsIgnoreCase("boleto")) {
            BoletoBancario boleto = new BoletoBancario(valor, status, null);
            String codigoBarras = boleto.gerarCodigoBarras();
            boleto.setCodigoDeBarras(codigoBarras);
            return boleto;
        } else {
            throw new IllegalArgumentException("Verifique od Dados do Boleto");
        }
    }

    public static Pagamento criarPagamento(String tipo, double valor, String status, String nomeDoTitular, String numeroDoCartao) {
        validarParametros(tipo, status, nomeDoTitular, numeroDoCartao);

        if (tipo.equalsIgnoreCase("cartao")) {
            return new CartaoDeCretido(valor, status, nomeDoTitular, numeroDoCartao);
        }else {
            throw new IllegalArgumentException("Veririque od Dados do Cartão");
        }
    }

    public static Pagamento criarPagamento(double valor, String status, String nomeUsuario, String emailUsuario,String tipo) {
        validarParametros(tipo, status, nomeUsuario, emailUsuario);

        if (tipo.equalsIgnoreCase("paypal")) {
            return new PayPal(valor, status, emailUsuario, nomeUsuario);
        }else {
            throw new IllegalArgumentException("Verifique os Dados do PayPal");
        }
    }

    private static void validarParametros(String... parametros) {
        for (String parametro : parametros) {
            if (parametro == null || parametro.isEmpty()) {
                throw new IllegalArgumentException("Parâmetro não pode ser nulo ou vazio");
            }
        }
    }


}
