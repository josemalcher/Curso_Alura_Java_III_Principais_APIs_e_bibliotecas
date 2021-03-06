package br.com.empresa.banco.conta;
/**
 * Classe respons�vel por moldar as Contas do Banco
 *
 * @author Jos� Malcher Junior
 */
public class Conta {
	protected double saldo;

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
	 * @throws Exception Lan�ando uma exce��o se houver erro!
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
}
