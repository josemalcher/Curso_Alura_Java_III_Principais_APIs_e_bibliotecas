package aula05.programa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import aula05.modelo.Conta;

public class TestaColecoes {
	public static void main(String[] args) {
		
		//Alterando para LIST
		//ArrayList<String> nomes = new ArrayList<String>();
		List<String> nomes = new LinkedList<String>();
		nomes.add("jose");
		nomes.add("maria");
		nomes.add("ana");
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.contains("jose"));
		
		for(int i = 0 ; i < nomes.size() ; i++){
			System.out.println(nomes.get(i));
		}
		
		for(String nome: nomes){
			System.out.println(nome);
		}
		System.out.println("****** Ordenado");
		Collections.sort(nomes);
		for(String nome: nomes){
			System.out.println(nome);
		}
		//String são comparáveis
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		Conta c1 = new Conta(1500);
		Conta c2 = new Conta(700);
		 
		contas.add(c1);
		contas.add(c2);

		//Collections vai veriricar o método compareTo de Conta
		//comparar elas e ordenar
		Collections.sort(contas);
		
		//System.out.println(contas.get(0));
		for(Conta conta: contas){
			System.out.println(conta);
		}
		
		System.out.println("*************");
		nomes.add("jose");
		System.out.println(nomes.get(1));
		System.out.println(nomes.get(3));
		//permite repetiçoes
		System.out.println("Tamanho com List " + nomes.size());
		
		//hashset
		System.out.println("*****");
		Set<String> nomes2 = new HashSet<String>();
		nomes2.add("jose");
		nomes2.add("maria");
		nomes2.add("jose");
		//não permite repetições
		System.out.println("Quantidade Strins com Set "+nomes2.size());
		System.out.println("********");
		/*
		//Trabalhando com objetos - COntas
		
		Set<Conta> contas1 = new HashSet<Conta>();
		Conta con1 = new Conta(200);
		Conta con2 = new Conta(200);
		contas1.add(con1);
		contas1.add(con1);
		contas1.add(con2);
		System.out.println("Quantidades de Contas " + contas1.size());
		//RETORNO: Quantidades de Contas 1
		 * Método equal e hash igualam as contas
		*/
		Collection<Conta> contas1 = new HashSet<Conta>();
		Conta con1 = new Conta(200);
		Conta con2 = new Conta(200);
		contas1.add(con1);
		contas1.add(con1);
		contas1.add(con2);
		System.out.println("Quantidades de Contas " + contas1.size());
		
		
	}
}
