package br.com.exercicio5;

public class ContaDeEstudante implements Conta {

    private final ManipuladorConta manipuladorConta;
    private int milhas;

    public ContaDeEstudante() {
        this.manipuladorConta = new ManipuladorConta();
    }

    public void saca(double valor) {
        manipuladorConta.saca(valor);
    }

    public void deposita(double valor) {
        manipuladorConta.deposita(valor);
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }

    public void rende() {
        throw new RuntimeException("Não pode render");
    }

    public double saldo() {
        return manipuladorConta.saldo();
    }
}
