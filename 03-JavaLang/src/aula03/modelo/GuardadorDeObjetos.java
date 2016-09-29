package aula03.modelo;

public class GuardadorDeObjetos {
	private Conta[] contas;
	private int posicaoLivre;
	
	public GuardadorDeObjetos(){
		contas = new Conta[100];
		posicaoLivre = 0;
	}
	
	
	public void adiciona(Conta nova){
		contas[posicaoLivre] = nova;
		posicaoLivre++;
	}
	
	public Conta pega(int posicao){
		return contas[posicao];
	}
	
	
}
