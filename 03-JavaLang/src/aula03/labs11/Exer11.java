package aula03.labs11;

public class Exer11 {
	public static void main(String[] args) {
		imprimeVestical("ALURA");
	}
	
	public static void imprimeVestical(String palavra){
		
		int tamanho = palavra.length();
		
		for (int i = 0; i < tamanho; i++) {
			System.out.println(palavra.charAt(i));
			
		}
		
		
		
		
	}
}
