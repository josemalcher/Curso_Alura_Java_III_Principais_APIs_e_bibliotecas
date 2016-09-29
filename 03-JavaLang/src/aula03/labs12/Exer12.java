package aula03.labs12;

public class Exer12 {
	public static void main(String[] args) {
		imprimeVestical("Socorram-me, subi no ônibus em Marrocos");
		imprimeVestical("anotaram a data da maratona");
	}

	public static void imprimeVestical(String palavra) {

		int tamanho = palavra.length();

		for (int i = tamanho -1 ; i >= 0 ; i--) {
			System.out.print(palavra.charAt(i));

		}
		System.out.println("");
	}
}
