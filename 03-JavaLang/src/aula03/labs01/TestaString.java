package aula03.labs01;

public class TestaString {
	public static void main(String[] args) {

		String s = "jf11";
		s = s.replace("1", "2");
		System.out.println(s);

		int qntCarac = s.length();
		System.out.println("Quantidade de caracteres= " + qntCarac);
		/*
		 * contains: devolve true se a String contem a sequência de caracteres
		 * passada;
		 * 
		 * trim: devolve uma nova String sem caracteres brancos do início e do
		 * fim;
		 * 
		 * isEmpty: devolve true se a String está vazia. Surgiu no Java 6;
		 * 
		 * length: devolve a quantidade de caracteres da String.
		 * 
		 * http://docs.oracle.com/javase/7/docs/api/java/lang/String.html
		 * 
		 */

	}
}
