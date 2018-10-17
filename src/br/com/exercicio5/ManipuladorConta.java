package br.com.exercicio5;

public class ManipuladorConta {

    private Double saldo;

    public ManipuladorConta() {
        saldo = 0d;
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public void saca(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double saldo() {
        return saldo;
    }
}
