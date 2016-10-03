package aula05.labs01;

public class SaldoInsuficienteException extends RuntimeException {
	
	private final double saldoAtual;
	
	/**
	 * COmentário qualquer... (AUla 02 - JAVADOC)
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
