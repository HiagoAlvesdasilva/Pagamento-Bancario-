package gerenciamento.pagamento.br.factory;

import gerenciamento.pagamento.br.domain.model.Pagamento;
import gerenciamento.pagamento.br.domain.model.enums.StatusPagamentoEnum;

public interface PagamentoFatoryIpl {
    Pagamento getPagamentoStrategy(int tipoDePagamento, double valor, StatusPagamentoEnum statusPagamento);
}