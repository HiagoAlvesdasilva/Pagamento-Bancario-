package gerenciamento.pagamento.br.service;

import gerenciamento.pagamento.br.domain.model.Pagamento;

public class SistemaDePagamentoService {

    public void processarPagamento(Pagamento pagamento){
        pagamento.realizarPagamento();
        System.out.println("Status do pagamento: "+ pagamento.verificarStatus());
    }
}
