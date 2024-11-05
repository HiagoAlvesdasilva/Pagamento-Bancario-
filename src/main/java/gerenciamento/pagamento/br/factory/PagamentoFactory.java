package gerenciamento.pagamento.br.factory;

import gerenciamento.pagamento.br.domain.model.BoletoBancario;
import gerenciamento.pagamento.br.domain.model.CartaoDeCretido;
import gerenciamento.pagamento.br.domain.model.Pagamento;
import gerenciamento.pagamento.br.domain.model.PayPal;

public class PagamentoFactory {
    public static Pagamento criarPagamento(String tipo, double valor, String status) {
        if (tipo.equalsIgnoreCase("boleto")) {
            BoletoBancario boleto = new BoletoBancario(valor, status, null);
            String codigoBarras = boleto.gerarCodigoBarras();
            boleto.setCodigoDeBarras(codigoBarras);
            return boleto;
        }
        return null;
    }

    public static Pagamento criarPagamento(String tipo, double valor, String status, String nomeDoTitular, String numeroDoCartao) {
        if (tipo.equalsIgnoreCase("cartao")) {
            return new CartaoDeCretido(valor, status, nomeDoTitular, numeroDoCartao);
        }
        return null;
    }

    public static Pagamento criarPagamento(double valor, String status, String nomeUsuario, String emailUsuario,String tipo) {
        if (tipo.equalsIgnoreCase("paypal")) {
            return new PayPal(valor, status, emailUsuario, nomeUsuario);
        }
        return null;
    }

}
