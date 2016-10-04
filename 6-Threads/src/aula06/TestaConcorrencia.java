package aula06;

public class TestaConcorrencia {

	public static void main(String[] args) {
		
		BarraDeProgresso barra = new BarraDeProgresso();
		barra.executa();
		
		CopiadorDeArquivos copiador = new CopiadorDeArquivos();
		copiador.executa();

	}

}
