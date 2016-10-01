package aula05.programa;

import java.util.ArrayList;

import aula05.modelo.Conta;

public class TestaColecoes {
	public static void main(String[] args) {
		
		
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("jose");
		nomes.add("maria");
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.contains("jose"));
		
		for(int i = 0 ; i < nomes.size() ; i++){
			System.out.println(nomes.get(i));
		}
		
		for(String nome: nomes){
			System.out.println(nome);
		}
		
		
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		Conta c1 = new Conta(500);
		Conta c2 = new Conta(700);
		
		contas.add(c1);
		contas.add(c2);
		
		//System.out.println(contas.get(0));
		for(Conta conta: contas){
			System.out.println(conta);
		}
		
	}
}
