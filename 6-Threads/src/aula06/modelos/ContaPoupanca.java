package aula06.modelos;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

	public double saldo;
	public Conta contaDestino;
	private String nomeCliente;
	
	
	//fiz ajuste na implementação de Conta - "desativei" comparable da implementação
	public ContaPoupanca(double saldo, String nomeCliente) {
		super(saldo);
		this.setnomeCliente(nomeCliente);
	}
	
	public ContaPoupanca() {
		
	}

	public void depositar(double valor){
		saldo+= valor;
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		//return this.getNumero() - o.getNumero();
		return this.nomeCliente.compareTo(o.nomeCliente);
	}

	public String getnomeCliente() {
		return nomeCliente;
	}

	public void setnomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	


	
	
}
