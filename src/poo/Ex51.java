package poo;

import java.util.Scanner;

public class Ex51 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Cliente [] listapessoa = new Cliente [5];
		
		System.out.println("..::CADASTRO DE PESSOAS::..");
		
		for(int i = 0; i<=4;i++) {
			Cliente c = new Cliente();
			System.out.println("Digite o id do cliente: ");
			c.id = ler.nextInt();
			System.out.println("Digite o nome do cliente: ");
			c.nome = ler.next();
			System.out.println("Digite a idade do cliente: ");
			c.idade = ler.nextInt();
			System.out.println("Digite o email do cliente: ");
			c.email = ler.next();
			
			listapessoa [i] = c;
		}
		for(int i=0; i<=4; i++) {
			if(listapessoa[i].idade>=18) {
				System.out.println("ID : " + listapessoa[i].id);
				System.out.println("NOME : " + listapessoa[i].nome);
				System.out.println("IDADE : " + listapessoa[i].idade);
				System.out.println("EMAIL : " + listapessoa[i].email);
			}
		}
		ler.close();

	

	}

}
