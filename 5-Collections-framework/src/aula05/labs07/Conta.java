package aula05.labs07;


/**
 * Classe responsável por moldar as Contas do Banco
 *
 * @author José Malcher Junior
 */
public class Conta /*implements Comparable<Conta>*/{
	protected double saldo;
	private int numero;
	
	public Conta(double saldo){
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Classe que realiza o deposito (AUla 2 - javadoc)
	 * @param valorDeposito
	 */
	public void deposita(double valorDeposito){
		this.saldo += valorDeposito;
	}
	
	/**
	 * Classe que realiza o saque (Aula 02 - Javadoc)
	 * @param valorSacar Valor a ser sacado em Double...
	 * @throws Exception Lançando uma exceção se houver erro!
	 */
	public void saca(double valorSacar) throws Exception{
		if(saldo >= valorSacar){
			this.saldo -= valorSacar;
			
		}else{
			throw new SaldoInsuficienteException(saldo);
		}
	}
	
	/**
	 * Atualizador do saldo com parametro tal tal:
	 * @param taxa
	 */
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}

/*	//implemetando comparação de objetos - referencias de saldos contas
	@Override
	public int compareTo(Conta outra) {
		if(this.saldo < outra.saldo) return -1;
		if(this.saldo > outra.saldo) return 1;
		return 0;
		return this.getNumero() - outra.getNumero();
	}
*/
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
	
	
	
}