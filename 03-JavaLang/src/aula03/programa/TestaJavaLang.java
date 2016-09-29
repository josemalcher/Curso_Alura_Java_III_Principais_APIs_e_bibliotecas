package aula03.programa;

import aula03.modelo.Cliente;
import aula03.modelo.Conta;
import aula03.modelo.GuardadorDeObjetos;

public class TestaJavaLang {
	public static void main(String[] args) {
		
		Conta c1 = new Conta(200);
		Conta c2 = new Conta(200);
		
		GuardadorDeObjetos armario = new GuardadorDeObjetos();
		armario.adiciona(c1);
		armario.adiciona(c2);
		
		//adicionando Cliente
		Cliente joao = new Cliente();
		armario.adiciona(joao);
		
		//Casting - Responsabilidade do desenvolvedor
		Conta c1NoArmario = (Conta)armario.pega(0);
		Cliente joaoNoArmario = (Cliente)armario.pega(2);
		
		
		System.out.println(c1);
		
		//comparando 2 objetos - valores semanticos
		if(c1.equals(c2)){
			System.out.println("São iguais");
		}else{
			System.out.println("São Diferentes");
		}
		
		System.out.println();
		System.out.println("Sobre Métodos STRING");
		
		String curso = "fj11";
		curso = curso.replace("j", "k");
		curso = curso.toUpperCase();
		System.out.println(curso);
		
		System.out.println();
		System.out.println("Sobre Métodos Matemáticos Math");
		
		double pi = 3.14;
		long numeroArrendodado = Math.round(pi);
		System.out.println(numeroArrendodado);
		
  	}
}
