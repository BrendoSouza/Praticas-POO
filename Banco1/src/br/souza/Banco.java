package br.souza;

import java.util.ArrayList;

public class Banco {
	
	private ArrayList<ContaCorrente> lista = new ArrayList<ContaCorrente>();

	public ArrayList<ContaCorrente> getLista() {
		return lista;
	}

	public void setLista(ArrayList<ContaCorrente> lista) {
		this.lista = lista;
	}
	
	public void adicionarConta(ContaCorrente cc) {
		if(!this.lista.contains(cc)) {
			this.lista.add(cc);
		}
	}
	
	public void remove(ContaCorrente cc) {
		this.lista.remove(cc);
	}
	
	public ContaCorrente obterConta(String numero, String agencia) {
		ContaCorrente exemplo = new ContaCorrente("", agencia, numero);
		
		int index = this.lista.indexOf(exemplo);
		if(index != -1) {
			return this.lista.get(index);
		}else {
			return null;
		}
		
	}
}
