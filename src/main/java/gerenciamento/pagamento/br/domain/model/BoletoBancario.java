package gerenciamento.pagamento.br.domain.model;

import gerenciamento.pagamento.br.domain.model.enums.StatusPagamentoEnum;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class BoletoBancario extends Pagamento{

    private String codigoDeBarras;

    public BoletoBancario(double valor, StatusPagamentoEnum statusPagamento, String codigoDeBarras) {
        super(valor, statusPagamento);
        this.codigoDeBarras = codigoDeBarras;
    }

    public BoletoBancario(double valor, StatusPagamentoEnum statusPagamento) {
        super(0.0,statusPagamento);
    }

    public String gerarCodigoDeBarras(){
        Random random = new Random();
        StringBuilder codigoDeBarras = new StringBuilder();

        LocalDate data = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        codigoDeBarras.append(data.format(formatter));

        for (int i = 0; i< 35; i++){
            codigoDeBarras.append(random.nextInt(10));
        }
        return codigoDeBarras.toString();
    }

    public String getCodigoDeBarras(){
        return gerarCodigoDeBarras();
    }

    @Override
    public void realizarPagamento() {
        verificarStatus();
        System.out.println("Gerado Boleto Com Codigo: "+ getCodigoDeBarras());
        setValor(StatusPagamentoEnum.AGUARDANDO_CONFIRMACAO_DE_PAGAMENTO.getKey());
    }

    @Override
    public void verificarStatus() {
        if (getStatusPagamento() == StatusPagamentoEnum.PENDENTE){
            realizarPagamento();
        }else if (getStatusPagamento() == StatusPagamentoEnum.AGUARDANDO_CONFIRMACAO_DE_PAGAMENTO){
            System.out.println("Por Favor Aguarde A Confirmação do Seu Pagamento");
        }else {
            System.out.println("O Boleto :"+getCodigoDeBarras()+" já foi Pago");
        }
    }


}
