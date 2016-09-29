package aula03.modelo;

public class SaldoInsuficienteException extends RuntimeException {
	
	private final double saldoAtual;
	
	/**
	 * COment�rio qualquer... (AUla 02 - JAVADOC)
	 * @param saldoAtual
	 */
	public SaldoInsuficienteException(double saldoAtual){
		super("Saldo insuficiente (class) " + saldoAtual);
		this.saldoAtual = saldoAtual;
		
	}
	
	public double getSaldoAtual() {
		return saldoAtual;
	}
	
}
