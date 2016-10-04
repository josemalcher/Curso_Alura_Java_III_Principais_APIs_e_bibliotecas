package aula06;

import aula06.modelos.Conta;

public class TestaConcorrencia {

	public static void main(String[] args) {
		
/*		BarraDeProgresso barra = new BarraDeProgresso();
		Thread t1 = new Thread(barra);
		t1.start();
		
		CopiadorDeArquivos copiador = new CopiadorDeArquivos();
		Thread t2 = new Thread(copiador);
		t2.start();*/
		
		Conta c1 = new Conta(500);
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		
		System.out.println(c1.getSaldo());

	}

}
