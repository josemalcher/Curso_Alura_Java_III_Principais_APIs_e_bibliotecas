package aula03.labs06;

public abstract class Conta {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroConta == null) ? 0 : numeroConta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numeroConta == null) {
			if (other.numeroConta != null)
				return false;
		} else if (!numeroConta.equals(other.numeroConta))
			return false;
		return true;
	}
	
	

}
