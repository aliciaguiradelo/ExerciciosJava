package poo;

public class Ex54_Cliente {
	private int id;
	private String nome;
	private int idade;
	private String email;
	public Ex54_ContaBancaria conta;
	
	Ex54_Cliente (){
		
	}
	
	Ex54_Cliente(int id, String nome, int idade, String email, Ex54_ContaBancaria conta){
		this.id=id;
		this.nome=nome;
		this.idade=idade;
		this.email=email;
		this.conta=conta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Ex54_ContaBancaria getConta() {
		return conta;
	}

	public void setConta(Ex54_ContaBancaria conta) {
		this.conta = conta;
	}
	
	public void atualizarEmail (String novoEmail) {
		this.email=novoEmail;
	}
	
	public String exibirDadosConta() {
		return "AGÊNCIA : " + this.conta.getAgencia() + "\nCONTA: " + this.conta.getNumero() + 
				"\nSALDO: " + this.conta.getSaldo();
	}
	
	public String exibirNomeIdade() {
		return "NOME : " + this.nome + "\nIDADE: " + this.idade ;
	}
	
	
	
	
	
	

	
}
