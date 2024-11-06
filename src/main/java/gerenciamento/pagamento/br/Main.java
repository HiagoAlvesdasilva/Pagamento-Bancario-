package gerenciamento.pagamento.br;

import gerenciamento.pagamento.br.domain.model.Pagamento;
import gerenciamento.pagamento.br.factory.PagamentoFactory;
import gerenciamento.pagamento.br.service.SistemaDePagamentoService;

public class Main {
    public static void main(String[] args) {

        SistemaDePagamentoService sistema = new SistemaDePagamentoService();

        Pagamento pagamentoBoleto = PagamentoFactory.criarPagamento("boleto", 250.00,"Pendente");
        sistema.processarPagamento(pagamentoBoleto);

        Pagamento pagamentoCartao = PagamentoFactory.criarPagamento("cartao", 250.00, "Pendente", "João", "1234567890");
        sistema.processarPagamento(pagamentoCartao);

        Pagamento pagamentoPayPal = PagamentoFactory.criarPagamento(250.00, "Pendente", "João", "jao@email.com,",
                "paypal");
        sistema.processarPagamento(pagamentoPayPal);

    }
}