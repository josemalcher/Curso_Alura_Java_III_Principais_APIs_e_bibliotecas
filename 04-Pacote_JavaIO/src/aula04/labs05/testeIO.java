package aula04.labs05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/*
 * Repare que, no final, só usamos mesmo o 
 * BufferedReader. 
 * As referências para InputStream e para 
 * InputStreamReader são apenas utilizadas 
 * temporariamente. 
 * Portanto, é comum encontrarmos o 
 * seguinte código nesses casos:
 * BufferedReader br = new BufferedReader(
                                    new InputStreamReader(
                                        new FileInputStream("arquivo.txt")));

            String linha = br.readLine(); // primeira linha
            
   Claro que, principalmente em linguagens 
   de alto nível como o Java, preferimos 
   legibilidade em vez de um código mais curto, 
   mas este código em particular é bem comum e aceitável. Faça a alteração no seu programa!
 */

public class testeIO {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));

		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		br.close();

	}
}
