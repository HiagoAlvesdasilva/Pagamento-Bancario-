package gerenciamento.pagamento.br;

import gerenciamento.pagamento.br.domain.model.BoletoBancario;
import gerenciamento.pagamento.br.domain.model.CartaoDeCretido;
import gerenciamento.pagamento.br.domain.model.Pagamento;
import gerenciamento.pagamento.br.domain.model.enums.StatusPagamentoEnum;
import gerenciamento.pagamento.br.factory.PagamentoFactory;
import gerenciamento.pagamento.br.service.SistemaDePagamentoService;

public class Main {
    public static void main(String[] args) {

        SistemaDePagamentoService pagamentoService = new SistemaDePagamentoService();

//        pagamentoService.processarPagamento(1,100.0);
//        pagamentoService.processarPagamento(2,150.0);
//        pagamentoService.processarPagamento(3,200.0);

        CartaoDeCretido cartaoDeCretido = new CartaoDeCretido(100, StatusPagamentoEnum.PENDENTE,"Teste","123456789");
        cartaoDeCretido.verificarStatus();
        cartaoDeCretido.realizarPagamento();


        BoletoBancario boletoBancario = new BoletoBancario(150.00, StatusPagamentoEnum.PAGO);
        boletoBancario.realizarPagamento();

  }
}