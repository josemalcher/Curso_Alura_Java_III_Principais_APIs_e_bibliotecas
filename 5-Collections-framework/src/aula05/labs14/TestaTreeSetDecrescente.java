package aula05.labs14;

import java.util.TreeSet;

public class TestaTreeSetDecrescente {

	public static void main(String[] args) {
		
		
		TreeSet<Integer> conjunto = new TreeSet<>();
		for (int i = 0; i <= 1000; i++) {
			conjunto.add(i);
			
		}
		
		for(Integer i : conjunto.descendingSet()){
			System.out.println(i + " ");
		}
		
		

	}

}
