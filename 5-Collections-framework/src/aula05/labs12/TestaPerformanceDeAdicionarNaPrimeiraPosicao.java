package aula05.labs12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {

	public static void main(String[] args) {
	
		
		System.out.println("INICIANDO...");
		
		long inicio = System.currentTimeMillis();
		
		// trocar depois por arrayList
		//List<Integer> teste = new LinkedList<>();
		ArrayList<Integer> teste = new ArrayList<>();
		
		for (int i = 0; i < 30000 ; i++) {
			teste.add(0,i);
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo Gasto = " +tempo);

	}

}
