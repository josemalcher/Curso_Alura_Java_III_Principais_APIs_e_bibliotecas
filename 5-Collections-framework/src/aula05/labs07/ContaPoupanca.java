package aula05.labs07;

public class ContaPoupanca extends Conta /*implements Comparable<ContaPoupanca>*/{

	public double saldo;
	public Conta contaDestino;
	private String nomeDOno;
	
	
	//fiz ajuste na implementação de Conta - "desativei" comparable da implementação
	public ContaPoupanca(double saldo, String nomeDOno) {
		super(saldo);
		this.setNomeDOno(nomeDOno);
	}
	
	public void depositar(double valor){
		saldo+= valor;
	}

/*	@Override
	public int compareTo(ContaPoupanca o) {
		return this.getNumero() - o.getNumero();
	}
*/
	public String getNomeDOno() {
		return nomeDOno;
	}

	public void setNomeDOno(String nomeDOno) {
		this.nomeDOno = nomeDOno;
	}
	
	


	
	
}
