package aula05.labs01;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
//fiz ajuste na implementa��o de Conta - "desativei" comparable da implementa��o
	public ContaPoupanca(double saldo) {
		super(saldo);
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		return this.getNumero() - o.getNumero();
	}


	
	
}
