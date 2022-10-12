package poo;

import java.util.Scanner;

public class Ex54 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Ex54_Cliente [] listacliente = new Ex54_Cliente[3];
		
		String nome;
		int idade;
		String email;
		char possuiConta;
		
		System.out.println("..::CADASTRO DE CLIENTES::..");
		for(int i=0; i<=2; i++) {
			Ex54_Cliente c = new Ex54_Cliente();
			
			System.out.println("Digite o id do " + (i+1) +" cliente: ");
			c.setId(ler.nextInt());
			System.out.println("Digite o nome do " +(i+1) + " cliente: ");
			c.setNome(ler.next());
			System.out.println("Digite a idade do " + (i+1) +" cliente: ");
			c.setIdade(ler.nextInt());
			System.out.println("Digite o email do " + (i+1) + " cliente: ");
			c.setEmail(ler.next());
			System.out.println("Você possui conta bancaria? (S/N) ");
			possuiConta=ler.next().toUpperCase().charAt(0);
			
			
			if (possuiConta == 'S') {
				
				Ex54_ContaBancaria [] conta = new Ex54_ContaBancaria[3];

				System.out.println("Digite o numero da agencia do " + (i+1) +" cliente: ");
				conta.setAgencia(ler.next());
				System.out.println("Digite o numero da conta do " + (i+1) +" cliente: ");
				conta.setNumero(ler.next());
				System.out.println("Digite o saldo da conta do " + (i+1) +" cliente: ");
				conta.setSaldo(ler.nextDouble());
				
				c.setConta(conta);
		}
			else {
				c.setConta(null);
			}
			
			listacliente[i]= c;
		
			}
			for(int i=0; i<=2; i++) {
				System.out.println(listacliente[i].exibirNomeIdade());
				if(listacliente[i].getConta()!= null) {
					System.out.println(listacliente[i].exibirDadosConta());
				}
				
				
			}
			
			ler.close();
		}
		

	}

