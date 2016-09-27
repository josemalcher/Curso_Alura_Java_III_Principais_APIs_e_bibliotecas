package br.com.empresa.banco.conta;

public class SaldoInsuficienteException extends RuntimeException {
	
	private final double saldoAtual;

	public SaldoInsuficienteException(double saldoAtual){
		super("Saldo insuficiente (class) " + saldoAtual);
		this.saldoAtual = saldoAtual;
		
	}
	
	public double getSaldoAtual() {
		return saldoAtual;
	}
	
}
