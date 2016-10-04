package aula05.labs14;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TestaArrayListDecrescente {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			lista.add(i);
		}

		Collections.reverse(lista);

		for (Integer i : lista) {
			System.out.println(i + " ");
		}

	}

}
