package aula05.labs14;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	 private List<Conta> contas = new ArrayList<>();

     public void adiciona(Conta conta) {
         contas.add(conta);
     }

     public Conta pega(int posicao) {
         return contas.get(posicao);
     }

     public int getQuantidadeDeContas() {
         return contas.size();
     }
}
