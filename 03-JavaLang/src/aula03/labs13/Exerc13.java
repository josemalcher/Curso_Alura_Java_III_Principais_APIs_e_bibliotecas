package aula03.labs13;

public class Exerc13 {
	public static void main(String[] args) {
		imprimeVestical("Socorram-me, subi no ônibus em Marrocos");
	}

	public static void imprimeVestical(String palavra) {
		
		String[] palavras = palavra.split(" ");
		

		for (int i = palavras.length - 1; i >= 0; i--) {
			System.out.print(palavras[i] + " ");

		}
		System.out.println("");
	}
}
