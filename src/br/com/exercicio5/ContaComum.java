package br.com.exercicio5;

public class ContaComum implements Conta{

    private final ManipuladorConta manipuladorConta;

    public ContaComum() {
        manipuladorConta = new ManipuladorConta();
    }

    public void deposita(double valor) {
        manipuladorConta.deposita(valor);
    }

    public void saca(double valor) {
        manipuladorConta.saca(valor);
    }

    public void rende() {
        manipuladorConta.deposita(manipuladorConta.saldo() * 0.01);
    }

    public double saldo() {
        return manipuladorConta.saldo();
    }
}
