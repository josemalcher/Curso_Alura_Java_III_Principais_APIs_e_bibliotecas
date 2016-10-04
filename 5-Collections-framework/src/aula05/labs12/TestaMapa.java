package aula05.labs12;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {

	public static void main(String[] args) {
		
		Conta c1  = new ContaPoupanca();
		c1.deposita(10000);
		
		Conta c2 = new ContaPoupanca();
		c2.deposita(3000);
		
		//Cria map
		Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();
		
		//adicion duas chames de seues valores
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		
		//qual a conta do diretor??
		Conta contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
		
		

	}

}
