package aula05.labs01;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
//fiz ajuste na implementação de Conta - "desativei" comparable da implementação
	public ContaPoupanca(double saldo) {
		super(saldo);
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		return this.getNumero() - o.getNumero();
	}


	
	
}
