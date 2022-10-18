package poo;

import java.util.Scanner;

public class Ex55 {

	public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			
			Ex55_Cliente [] clientes = new Ex55_Cliente[2];
			
			char possuiConta;
			
			for(int i = 0; i < clientes.length; i++) {
				Ex55_Cliente cliente = new Ex55_Cliente();
				
				System.out.println("*****CADASTRO DE CLIENTE*****");
				System.out.println("Nome: ");
				cliente.setNome(scn.next());
				System.out.println("Idade: ");
				cliente.setIdade(scn.nextInt());
				System.out.println("E-mail: ");
				cliente.setEmail(scn.next());
				
				System.out.println("Possui conta? (S/N)");
				possuiConta = scn.next().toUpperCase().charAt(0);
				
				if(possuiConta == 'S') {
					
					Ex55_ContaBancaria conta = new Ex55_ContaBancaria();
					
					System.out.println("Agência: ");
					conta.setAgencia(scn.next());
					System.out.println("Nº da conta: ");
					conta.setNumero(scn.next());
					System.out.println("Saldo: ");
					conta.setSaldo(scn.nextDouble());
					
					cliente.setConta(conta);
				} else {
					cliente.setConta(null);
				}
				
				clientes[i]	= cliente;
			}
			
			for(int i = 0; i < clientes.length; i++) {
				System.out.println(clientes[i].exibirNomeIdade());
				if(clientes[i].getConta() != null) {
					System.out.println(clientes[i].exibirDadosConta());
				}
				
			}
			
			scn.close();

		

	}

}
