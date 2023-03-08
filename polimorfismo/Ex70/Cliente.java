package Ex70;

import java.util.ArrayList;

import Ex68.ContaBancaria;

public class Cliente {
	//Atributos da classe Cliente
		private int id;
		private String nome;
		private int idade;
		private String email;
		ArrayList <Conta> contas;
		
		//Construtor padrão
		public Cliente (){
			
		}
		
		//Construtor não padrão
		Cliente (int id, String nome, int idade, String email){
			this.id=id;
			this.nome=nome;
			this.idade=idade;
			this.email=email;
		}
		
		//Método para exibir nome e idade do cliente
		String exibirNomeIdade() {
			return "Nome: " + this.nome + "\nidade: " + this.idade;
		}
		
		//Método para exibir dados do objeto conta do tipo ContaBancaria
		String exibirDadosConta() {
			//Quando eu coloco o nome do objeto . método, eu estou chamando esse método
			return "Agencia: " + this.contas.getAgencia() + "\nNumero: " + this.contas.getNumero() + "\nSaldo: " + this.contas.getSaldo();
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


}
