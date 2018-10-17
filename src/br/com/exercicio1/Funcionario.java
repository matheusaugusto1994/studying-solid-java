package br.com.exercicio1;

public class Funcionario {

	private Cargo cargo;
	private double salarioBase;

	public Cargo getCargo() {
		return this.cargo;
	}

	public double getSalarioBase() {
		return this.salarioBase;
	}

	 double calculaSalario() {
		return getCargo().getRegraSalario().calcula(this);
	}

}
