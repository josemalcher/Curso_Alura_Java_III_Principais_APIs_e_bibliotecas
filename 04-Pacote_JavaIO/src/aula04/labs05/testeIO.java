package aula04.labs05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/*
 * Repare que, no final, s� usamos mesmo o 
 * BufferedReader. 
 * As refer�ncias para InputStream e para 
 * InputStreamReader s�o apenas utilizadas 
 * temporariamente. 
 * Portanto, � comum encontrarmos o 
 * seguinte c�digo nesses casos:
 * BufferedReader br = new BufferedReader(
                                    new InputStreamReader(
                                        new FileInputStream("arquivo.txt")));

            String linha = br.readLine(); // primeira linha
            
   Claro que, principalmente em linguagens 
   de alto n�vel como o Java, preferimos 
   legibilidade em vez de um c�digo mais curto, 
   mas este c�digo em particular � bem comum e aceit�vel. Fa�a a altera��o no seu programa!
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
