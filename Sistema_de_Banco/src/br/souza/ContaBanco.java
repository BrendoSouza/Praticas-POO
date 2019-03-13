package br.souza;

public class ContaBanco {
	
	//Atributos
	public int NumConta;
	protected String Tipo;
	private String Dono;
	private double Saldo;
	private boolean Status;
	
	//Método de descrição da conta
	public void EstadoConta() {
		System.out.println("----------------------------------------");
		System.out.println("Dono da conta: " +this.getDono());
		System.out.println("Número da conta: " +this.getNumConta());
		System.out.println("Tipo da conta: " +this.getTipo());
		System.out.println("Status da conta: " +this.getStatus());
		System.out.println("Saldo da conta: " +this.getSaldo());
	}
	
	//Método construtor
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	//Métodos especiais
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		
		if(tipo == "CC") {
			this.setSaldo(50);
		}else if(tipo == "CP") {
			this.setSaldo(150);
		}
		
		System.out.println("\nConta aberta com sucesso!");
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada pois ainda tem dinheiro!");
		}else if(this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada pois esta em débito!");
		}else {
			System.out.println("Conta fechada com sucesso!");
		}
	}
	
	public void depositar(double valor) {
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito efetuado com sucesso na conta de " +this.getDono());
		}else {
			System.out.println("Impossível depositar em uma conta fechada!");
		}
	}
	
	public void sacar(double valor) {
		if(this.getStatus()) {
			if(this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor );
				System.out.println("Saque realizado com sucesso na conta de " +this.getDono());
			}else {
				System.out.println("Saldo insuficiente para saque!");
			}
		}else {
			System.out.println("Impossível sacar de uma conta fechada!");
		}
	}
	
	public void pagarMensal() {
		int mensalidade = 0;
		
		if(this.getTipo() == "CC") {
			mensalidade = 12;
		}else if(this.getTipo() == "CP") {
			mensalidade = 20;
		}
		
		if(this.getStatus()) {
			if(this.getSaldo() >= mensalidade) {
				this.setSaldo(this.getSaldo() - mensalidade);
				System.out.println("Mensalidade paga com sucesso!");
			}else {
				System.out.println("Saldo insuficiente para pagar a mensalidade!");
			}
		}else {
			System.out.println("Impossível pagar a mensalidade de uma conta fechada!");
		}
	}
	
	//Métodos getters e setters
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
