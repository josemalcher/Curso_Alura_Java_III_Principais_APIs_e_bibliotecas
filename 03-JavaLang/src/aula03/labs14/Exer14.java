package aula03.labs14;

public class Exer14 {

	public static void main(String[] args) {
		inverteComStringBuilder("Socorram-me, subi no ônibus em Marrocos");
	}

	public static void inverteComStringBuilder(String texto) {
		System.out.print("\t");
		StringBuilder invertido = new StringBuilder(texto).reverse();
		System.out.println(invertido);
	}

}
