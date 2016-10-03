package aula05.programa;

import java.util.ArrayList;
import java.util.Collections;

import aula05.modelo.Conta;

public class TestaColecoes {
	public static void main(String[] args) {
		
		
		ArrayList<String> nomes = new ArrayList<String>();
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
		
	}
}
