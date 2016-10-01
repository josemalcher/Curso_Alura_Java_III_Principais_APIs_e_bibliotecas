package aula05.programa;

import java.util.ArrayList;

public class TestaColecoes {
	public static void main(String[] args) {
		
		
		ArrayList nomes = new ArrayList();
		nomes.add("jose");
		nomes.add("maria");
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.contains("jose"));
		
		
		
	}
}
