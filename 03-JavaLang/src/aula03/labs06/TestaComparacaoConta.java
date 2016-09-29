package aula03.labs06;

public class TestaComparacaoConta {
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		ContaCorrente c2 = new ContaCorrente();
		
		if(c1.equals(c2)){
			System.out.println("Iguais");
		}else{
			System.out.println("Diferentes");
		}
		
		
	}
}
