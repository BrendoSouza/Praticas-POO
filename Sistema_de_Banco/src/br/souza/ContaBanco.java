package br.souza;

public class ContaBanco {
	public int NumConta;
	protected String Tipo;
	private String Dono;
	private double Saldo;
	private boolean Status;
	
	public void EstadoConta() {
		System.out.println("Dono da conta");
	}
	
	public void abrirConta() {
		
	}
	
	public void fecharConta() {
		
	}
	
	public void depositar() {
		
	}
	
	public void sacar() {
		
	}
	
	public void pagarMensal() {
		
	}
	
	public int getNumConta() {
		return this.NumConta;
	}
	public void setNumConta(int nc) {
		this.NumConta = nc;
		
	}
	
	public String getTipo() {
		return this.Tipo;
	}
	public void setTipo(String tipo) {
		this.Tipo = tipo;
	}
	
	public String getDono() {
		return this.Dono;
	}
	public void setDono(String dono) {
		this.Dono = dono;
	}
	
	public double getSaldo() {
		return this.Saldo;
	}
	public void setSaldo(double saldo) {
		this.Saldo = saldo;
	}
	
	public boolean getStatus() {
		return this.Status;
	}
	public void setStatus(boolean status) {
		this.Status = status;
	}
}
