package br.souza;

import java.math.BigDecimal;

public class ContaCorrente {
	
	private String numero;
	private String agencia;
	private String nome;
	private BigDecimal saldo;
	
	public ContaCorrente(String nome) {
		this(nome, "", "");
	}
	public ContaCorrente(String nome, String agencia, String numero) {
		this(nome, agencia, numero, BigDecimal.ZERO);
	}
	public ContaCorrente(String nome, String agencia, String numero, BigDecimal saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public boolean saque(String valor) {
		BigDecimal bigdecimal = new BigDecimal(valor);
		
		return this.saque(bigdecimal);
	}
	
	public boolean saque(BigDecimal valor) {
		boolean sucesso = false;
		
		if(this.saldo.compareTo(valor) >= 0) {
			this.saldo = this.saldo.subtract(valor);
			sucesso = true;
		}
		
		return sucesso;
	}
	
	public boolean deposito(BigDecimal valor) {
		
		this.saldo = this.saldo.add(valor);
		
		return true;
	}
	
	public BigDecimal consultarSaldo() {
		return this.saldo;
	}
	
	public boolean transferencia(BigDecimal valor, ContaCorrente conta) {
		boolean sucesso = false;
		
		if(this.saldo.compareTo(valor) >= 0) {
			this.saque(valor);
			sucesso = true;
		}
		
		if(sucesso) {
			conta.deposito(valor);
		}
		
		return sucesso;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
}


