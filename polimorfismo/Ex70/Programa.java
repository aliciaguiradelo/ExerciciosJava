package Ex70;

import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
//		Vamos fazer um sistema de cadastro de clientes e sua respectiva conta bancária. 
//		O sistema deve permitir, inclusão de cliente, depósito na conta, saque na conta, 
//		exclusão de cliente e consulta de cliente e saldo. O cliente, deve escolher entre 
//		conta corrente e conta poupança no momento de se cadastrar. Utilize HashMap para 
//		armazenar os clientes e contas. Utilize Herança e Polimorfismo nos métodos da classe conta.
		Scanner ler = new Scanner(System.in);
		
		HashMap <Integer, Cliente> map = new HashMap <Integer, Cliente>();
		
		int opcao;
		int id;
		Cliente cli;
		int idCliente=0;
		String possuiConta;
		int tipoConta;
		
		 do {        
	        	/*Criando o menu*/
	           System.out.printf("===> Sistema de Cadastro de Clientes <===\n\n");
	           System.out.printf("Escolha uma opção:\n");          
	           System.out.printf("1 - Incluir \n" +
	                             "2 - Depositar \n" +
	                             "3 - Sacar \n" +
	                             "4 - Excluir cliente \n" +
	                             "5 - Consultar cliente e saldo \n" +
	                             "6 - Sair\n\n");
	 
	           System.out.printf("Digite a opção desejada: ");
	           opcao = ler.nextInt();
	           
	           /*Incluir*/
	           if (opcao == 1) {
	        	   
	        	   /*Instanciando um objeto cliente do tipo Cliente*/
	               Cliente cliente = new Cliente();
	               
	               //Inclementando o idCliente
	               idCliente++;
	               
	               /*Vou atualizar o id do objeto*/
	               cliente.setId(idCliente);
	               
	               /*Solicitando dados do cadastro*/
	               System.out.print("Digite o seu nome: ");
	               cliente.setNome(ler.next());
	               
	               System.out.print("Digite a seu idade: ");
	               cliente.setIdade(ler.nextInt());
	               
	               System.out.print("Digite o seu e-mail: ");
	               cliente.setEmail(ler.next());
	               
	               System.out.print("Possui conta bancária? S/N");
	               possuiConta = ler.next().toUpperCase();
	               
	               /*Se tiver conta, eu crio um objeto do tipo ContaBancaria para popular*/
	               if(possuiConta.equals("S")) {
	            	   
	            	   System.out.println("Qual tipo de conta deseja cadastrar? \n"+
	            			   			  "1 - Conta Corrente \n" +
	            			   			  "2 - Conta Poupança \n");
	            	   tipoConta = ler.nextInt();
	            	   
	            	   if (tipoConta == 1) {
	            		   
	            		   
	            		   
		                   ContaCorrente cc = new ContaCorrente();
		                   
		                   System.out.print("Digite a agencia: ");
		                   cc.setAgencia(ler.next());
		                   
		                   System.out.print("Digite o numero: ");
		                   cc.setNumero(ler.next());
		                   
		                   cc.setSaldo(0);
		                   
		                   /*Criando uma referência em cliente para o objeto do tipo Conta que foi populado
		                    * com os valores dos seus atributos*/
		                   /*Conta é um atributo de Cliente, por isso eu uso o método set (Getters and Setters)*/
		                   
	            		   
	            	   }
	            	   else {
	            		   ContaPoupanca cp = new ContaPoupanca();
	            		   
	            		   System.out.print("Digite a agencia: ");
		                   cp.setAgencia(ler.next());
		                   
		                   System.out.print("Digite o numero: ");
		                   cp.setNumero(ler.next());
	            		   
		                   cp.setSaldo(0);
	            	   }
	            	   
	            	   

	               }
	               
	               /*Se não tiver conta, deixa nulo*/
	               else {
	                   cliente.setConta(null);                
	               }
	               
	               /*Adiciona a chave e o valor no hashmap*/
	               map.put(idCliente, cliente);
	               
	               System.out.printf("Cliente incluído com sucesso!");
	               
	               /*Retorna um int -1*/
	               System.in.read();
	           }
	           else if(opcao == 2) {
	        	   //forEach para varrer o hashmap map e print cada chave com seu respectivo valor
	               map.forEach((chave, valor) -> {
	            	   System.out.println("ID: " + chave + " - " + valor.exibirNomeIdade());
	               });
	               
	               System.out.print("Digite o ID do cliente que você deseja atualizar: ");
	               id = ler.nextInt();
	               
	               if (map.containsKey(id)) {
	                   cli = map.get(id);
	                   
	                   System.out.print("Digite o seu novo nome: ");
	                   cli.setNome(ler.next());
	                   
	                   System.out.print("Digite a sua nova idade: ");
	                   cli.setIdade(ler.nextInt());
	                   
	                   System.out.print("Digite o seu novo e-mail: ");
	                   cli.setEmail(ler.next());
	                   
	                   System.out.printf("Cliente atualizado com sucesso!");
	               }
	               else {
	                   System.out.printf("Cliente não encontrado!");
	               }
	               System.in.read();
	           }
	           else if(opcao == 3) {
	               map.forEach((chave, valor) -> {
	            	   System.out.println("ID: " + chave + " - " + valor.exibirNomeIdade());
	               });
	               
	               System.out.print("Digite o ID do cliente que você deseja excluir: ");
	               id = ler.nextInt();
	               
	               if (map.containsKey(id)) {
	            	   map.remove(id);
	            	   System.out.println("Cliente  excluido com sucesso");
	               }
	               else {
	                   System.out.printf("Cliente não encontrado!");
	               }
	               System.in.read();
	           }
	           else if(opcao == 4) {
	               map.forEach((chave, valor) -> {
	            	   System.out.println("ID: " + chave + " - " + valor.exibirNomeIdade());
	               });
	               
	               System.in.read();
	           }
	           
	        }while( (opcao >= 1) && (opcao <= 4) );
		
		ler.close();

	}

}
