package aula05.labs07;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestaOrdenacao {
	public static void main(String[] args) {

		List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();
		//List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		
		Random random = new Random();
		
		ContaPoupanca c1 = new ContaPoupanca(random.nextInt(2000), "JOse");
		c1.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(c1);
		
		ContaPoupanca c2 = new ContaPoupanca(random.nextInt(2000), "Maria");
		c2.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(c2);
		
		ContaPoupanca c3 = new ContaPoupanca(random.nextInt(2000), "Luciana");
		c3.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(c3);
		
		
		Collections.sort(contas);
		
		for (ContaPoupanca conta : contas) {
			System.out.println(conta);
		}
		
		System.out.println();
		System.out.println(contas);
		
		
		
	}
}
