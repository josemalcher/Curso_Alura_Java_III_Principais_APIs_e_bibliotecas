package aula05.labs14;

import java.util.HashSet;

public class TestaHashSetDeConta {

	public static void main(String[] args) {
		
		HashSet<Conta> contas = new HashSet<Conta>();
		
		ContaPoupanca c1 = new ContaPoupanca(123,"jose");
		ContaPoupanca c2 = new ContaPoupanca(123,"Adriano");
		ContaPoupanca c3 = new ContaPoupanca(444,"Maria");
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		System.out.println("Total de Cotnas no Hashset:" + contas.size());

	}

}
