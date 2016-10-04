package aula06;

import aula06.modelos.Conta;

public class FazDeposito implements Runnable {

	private final Conta conta;

	public FazDeposito(Conta conta) {
		this.conta = conta;
		
	}
	
	@Override
	public void run() {
		conta.deposita(100);
		
	}

}
