package aula04.labs06;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class testeIO {
	public static void main(String[] args) throws IOException {

		InputStream is = System.in;
		Scanner entrada = new Scanner(is);

		System.out.println("Digite sua mensagem:");
		while (entrada.hasNextLine()) {
			System.out.println(entrada.nextLine());
		}
		entrada.close();
	}
}
