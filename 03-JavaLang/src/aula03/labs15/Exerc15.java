package aula03.labs15;

public class Exerc15 {

	public static void main(String[] args) {
		
		String numero = "762";
		System.out.println("Imprimindo a STRING= " + numero);
		
		int resultado = convertStringInt(numero);
		System.out.println("IMPRIMINDO o INT = "+ resultado);

	}
	
	public static int convertStringInt(String numero){
		int resultado = 0;
		while(numero.length() > 0 ){
			char algoritmo = numero.charAt(0);
			resultado = resultado * 10 + (algoritmo - '0');
			numero = numero.substring(1);
		}
		return resultado;
	}

}
