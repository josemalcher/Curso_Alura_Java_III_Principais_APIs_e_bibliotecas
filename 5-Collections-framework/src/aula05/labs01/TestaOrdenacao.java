package aula05.labs01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaOrdenacao {
	public static void main(String[] args) {

		List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();
		
		ContaPoupanca c1 = new ContaPoupanca(400, "Jose");
		c1.deposita(1500);
		contas.add(c1);
		
		ContaPoupanca c2 = new ContaPoupanca(450, "Maria");
		c2.deposita(1000);
		contas.add(c2);
		
		ContaPoupanca c3 = new ContaPoupanca(100, "Luciana");
		c3.deposita(500);
		contas.add(c3);
		
		
		Collections.sort(contas);
		
		for (ContaPoupanca conta : contas) {
			System.out.println(conta);
		}
		
		
		
	}
}
