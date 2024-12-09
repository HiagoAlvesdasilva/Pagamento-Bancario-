package gerenciamento.pagamento.br.service;

import gerenciamento.pagamento.br.domain.model.Pagamento;
import gerenciamento.pagamento.br.domain.model.enums.StatusPagamentoEnum;
import gerenciamento.pagamento.br.domain.model.enums.TiposDePagamentosEnums;
import gerenciamento.pagamento.br.factory.PagamentoFactory;

public class SistemaDePagamentoService {

    private final PagamentoFactory pagamentoFactory;

    public SistemaDePagamentoService() {
        this.pagamentoFactory = new PagamentoFactory();
    }



    public void processarPagamento(int tipoDePagamento, double valor) {
        Pagamento pagamento = pagamentoFactory.getPagamentoStrategy(tipoDePagamento, valor, StatusPagamentoEnum.PENDENTE);
        pagamento.verificarStatus();
    }
}
