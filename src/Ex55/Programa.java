package Ex55;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Cliente[] listacliente = new Cliente[3];
		
		String possuiConta;
		
		for (int i = 0 ; i<3 ; i++) {
			Cliente c = new Cliente();
			System.out.println("Digite o id do "+ (i+1) + " cliente");
			c.setId(ler.nextInt());
			System.out.println("Digite o nome do " + (i+1) + " cliente");
			c.setNome(ler.next());
			System.out.println("Digite a idade do "+ (i+1) + " cliente");
			c.setIdade(ler.nextInt());
			System.out.println("Digite o email do " + (i+1) + " cliente");
			c.setEmail(ler.next());
			System.out.println("Você possui conta bancaria? (S/N) ");
			possuiConta=ler.next().toUpperCase();
			
			if(possuiConta == "SIM") {
				
				ContaBancaria conta = new ContaBancaria();
				
				System.out.println("Digite a agência: ");
				conta.setAgencia(ler.next());
				System.out.println("Digite o numero da conta do " + (i+1) +" cliente: ");
				conta.setNumero(ler.next());
				
				c.setConta(conta);
			} 
			else {
				c.setConta(null);
			}
			
			listacliente[i] = c;
 		}
		
		for(int i=0; i<3; i++) {
			System.out.println(listacliente[i].exibirNomeIdade());
			if(listacliente[i].getConta()!= null) {
				System.out.println(listacliente[i].exibirDadosConta());
			}
		
		}
		ler.close();
	}

}
