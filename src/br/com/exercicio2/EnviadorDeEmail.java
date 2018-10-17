package br.com.exercicio2;

public class EnviadorDeEmail implements ExecutorDeAcoes {

    public void executa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }

}
