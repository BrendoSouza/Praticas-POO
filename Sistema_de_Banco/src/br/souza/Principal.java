package br.souza;

public class Principal {

	public static void main(String[] args) {
		ContaBanco pessoa1 = new ContaBanco();
		pessoa1.setNumConta(123456);
		pessoa1.setDono("Brendo");
		pessoa1.abrirConta("CP");
		pessoa1.depositar(300);
		pessoa1.EstadoConta();
		
		ContaBanco pessoa2 = new ContaBanco();
		pessoa2.setNumConta(654321);
		pessoa2.setDono("Alguém");
		pessoa2.abrirConta("CC");
		pessoa2.sacar(20);
		pessoa2.EstadoConta();

	}

}
