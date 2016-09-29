package aula03.labs10;

public abstract class Conta {
	private String nome;
	private String numeroConta;
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	private void set() {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + "]";
	}
	
	
	
	

}
