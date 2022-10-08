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
		}
		if (listacliente[i].contaBanc.toUpperCase() == "S") {
			
		}

	}

}
