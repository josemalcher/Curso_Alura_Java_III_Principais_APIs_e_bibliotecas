package aula03.labs02;

import java.io.PrintStream;

public class TestaInteger {
	public static void main(String[] args) {
		
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		
		if(x1 == x2 || x1.equals(x2)){
			System.out.println("Igual");
		}else{
			System.out.println("Diferente");
		}
		
		PrintStream saida = System.out;
		saida.println("ol�");
		
		
	}
}
