package br.com.caelum.banco.util;

//usando o import
import br.com.caelum.banco.*;
/*
 * Isso faz com que não precisemos nos referenciar 
 * utilizando o ::fully qualified name::, podendo 
 * utilizar Banco dentro do nosso código em vez 
 * de escrever o longo br.com.caelum.banco.Banco.
 */

public class TesteDoBanco {
	public static void main(String[] args) {
		br.com.caelum.banco.Banco meuBanco = new br.com.caelum.banco.Banco();
		meuBanco.nome = "Banco do Brasil";
		System.out.println(meuBanco.nome);
	}
}
