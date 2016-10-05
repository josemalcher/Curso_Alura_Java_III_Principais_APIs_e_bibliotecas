package aula06.labs02;

import java.util.ArrayList;
import java.util.Collection;

public class RegistroDeMensagens {
	public static void main(String[] args) {
		
		
		Collection<String> mensagens = new ArrayList<String>();
		
		Thread t1 = new Thread(new ProduzMensagens(0, 10000, mensagens));
		Thread t2 = new Thread(new ProduzMensagens(10000, 20000, mensagens));
		Thread t3 = new Thread(new ProduzMensagens(20000, 30000, mensagens));
		
		
		t1.start();
		t2.start();
		t3.start();
		
		 System.out.println("Threads produtoras de mensagens finalizadas!");

         // verifica se todas as mensagens foram guardadas
         for (int i = 0; i < 15000; i++) {
             if (!mensagens.contains("Mensagem " + i)) {
                 throw new IllegalStateException("não encontrei a mensagem: " + i);
             }
         }

         // verifica se alguma mensagem ficou nula
         if (mensagens.contains(null)) {
             throw new IllegalStateException("não devia ter null aqui dentro!");
         }

         System.out.println("Fim da execucao com sucesso");
     }
		
		
		
		
	
}
