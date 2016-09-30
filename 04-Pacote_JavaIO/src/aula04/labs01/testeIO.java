package aula04.labs01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * Exercício 1
Crie um projeto novo chamado testeIO. E, nele, crie um programa (simplesmente uma classe com um main) que leia da entrada padrão. Para isso, você vai precisar de um BufferedReader que leia do System.in da mesma forma como fizemos.
Não digite esses nomes de classes complicados! Lembre-se de fazer como o instrutor e escrever primeiro a parte depois do igual. Então, use o ctrl + 1 para que o Eclipse crie a variável para você! Assim mesmo, enquanto você escreve a parte da direita, abuse do ctrl + espaço porque além de te ajudar com o nome, ele colocará o import no devido lugar. 
Cuidado: existe mais de uma classe chamada InputStream: queremos a do pacote java.io.

 */
public class testeIO {
	public static void main(String[] args) throws IOException {

		//InputStream is = System.in;
		InputStream is =  new FileInputStream("arquivo.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Digite a mensagem aqui!");
		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();

	}
}
