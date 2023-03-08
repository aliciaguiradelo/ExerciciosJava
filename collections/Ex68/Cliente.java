package Ex68;

public class Cliente {
	//Atributos da classe Cliente
	private int id;
	private String nome;
	private int idade;
	private String email;
	private ContaBancaria conta;
	
	//Construtor padrão
	Cliente (){
		
	}
	
	//Construtor não padrão
	Cliente (int id, String nome, int idade, String email, ContaBancaria conta){
		this.id=id;
		this.nome=nome;
		this.idade=idade;
		this.email=email;
		this.conta=conta;
	}
	
	//Método para exibir nome e idade do cliente
	String exibirNomeIdade() {
		return "Nome: " + this.nome + "\nidade: " + this.idade;
	}
	
	//Método para exibir dados do objeto conta do tipo ContaBancaria
	String exibirDadosConta() {
		//Quando eu coloco o nome do objeto . método, eu estou chamando esse método
		return "Agencia: " + this.conta.getAgencia() + "\nNumero: " + this.conta.getNumero() + "\nSaldo: " + this.conta.getSaldo();
	}
	
	//Getters and Setters dos atributos da classe Cliente
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

	public ContaBancaria getConta() {
		return conta;
	}

	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}

}
