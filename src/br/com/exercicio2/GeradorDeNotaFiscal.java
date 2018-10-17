package br.com.exercicio2;

import java.util.List;

public class GeradorDeNotaFiscal {


    private List<ExecutorDeAcoes> executorDeAcoes;

    public GeradorDeNotaFiscal(List<ExecutorDeAcoes> executorDeAcoes) {
        this.executorDeAcoes = executorDeAcoes;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        executorDeAcoes.forEach(e -> e.executa(nf));

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}
