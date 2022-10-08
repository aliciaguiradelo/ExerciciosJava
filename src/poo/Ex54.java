package poo;

import java.util.Scanner;

public class Ex54 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Ex54_Cliente [] listacliente = new Ex54_Cliente[3];
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
			c.contaBanc = ler.next();
			listacliente [i] = c;
			
			if (listacliente[i].contaBanc.toUpperCase() == "S") {
				Ex54_ContaBancaria [] cadastroconta = new Ex54_ContaBancaria[3];
				//for(int i=0; i<=2; i++) {
					Ex54_ContaBancaria cb = new Ex54_ContaBancaria ();
					System.out.println("Digite o numero da agencia do " + (i+1) +" cliente: ");
					cb.setAgencia(ler.next());
					System.out.println("Digite o numero da conta do " + (i+1) +" cliente: ");
					cb.setNumero(ler.next());
					System.out.println("Digite o saldo da conta do " + (i+1) +" cliente: ");
					cb.setSaldo(ler.nextDouble());
					
					cadastroconta [i] = cb;
		}
		
			}
			for(int i=0; i<=2; i++) {
				System.out.println("NOME : " + listacliente[i].getNome());
				System.out.println("ID : " + listacliente[i].getId());
				System.out.println("IDADE : " + listacliente[i].getIdade());
				
			}
			
			ler.close();
		}
		

	}

