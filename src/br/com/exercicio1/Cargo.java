package br.com.exercicio1;

public enum Cargo {
	
	DESENVOLVEDOR(new DezOuVintePorCento()),
	TESTER(new QuinzeOuVintePorCento()),
	DBA(new QuinzeOuVintePorCento());
	
	private RegraSalario regraSalario;

	private Cargo(RegraSalario regraSalario) {
		this.regraSalario = regraSalario;
	}
	
	public RegraSalario getRegraSalario() {
		return regraSalario;
	}

}
