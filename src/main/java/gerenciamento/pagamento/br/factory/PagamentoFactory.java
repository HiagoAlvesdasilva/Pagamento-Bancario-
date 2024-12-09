package gerenciamento.pagamento.br.factory;


import gerenciamento.pagamento.br.domain.model.BoletoBancario;
import gerenciamento.pagamento.br.domain.model.CartaoDeCretido;
import gerenciamento.pagamento.br.domain.model.Pagamento;
import gerenciamento.pagamento.br.domain.model.PayPal;
import gerenciamento.pagamento.br.domain.model.enums.StatusPagamentoEnum;
import gerenciamento.pagamento.br.domain.model.enums.TiposDePagamentosEnums;

public class PagamentoFactory {

    public Pagamento getPagamentoStrategy(int tipoDePagamento, double valor, StatusPagamentoEnum statusPagamento){

        if (tipoDePagamento == TiposDePagamentosEnums.CARTAO_DE_CREDITO.getKey() ){
            return new CartaoDeCretido(valor,statusPagamento);
        } else if (tipoDePagamento == TiposDePagamentosEnums.BOLETO_BANCARIO.getKey()) {
            return new BoletoBancario(valor,statusPagamento);
        } else if (tipoDePagamento == TiposDePagamentosEnums.PAYPAL.getKey()) {
            return new PayPal(valor,statusPagamento);
        }else {
            throw new IllegalArgumentException("Tipo de Pagamento Invalido");
        }
    }
}