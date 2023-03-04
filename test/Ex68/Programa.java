package Ex68;

import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) throws IOException {
		//CTRL + Shift + O 
		Scanner ler = new Scanner(System.in);
		
		//Instanciando um hashmap para armazenar os objetos. O hash map vai guardar uma chave do tipo
		//Integer e um valor do tipo objeto Cliente
		HashMap <Integer, Cliente> map = new HashMap <Integer, Cliente>(); 
		
		//Declarando variáveis que serão utilizadas no escopo da classe programa
		int opcao;
		int id;
		Cliente cli;
		int idCliente=0;
		String possuiConta;
		
		/*Cria uma estrutura de repetição, no cado DO...WHILE, porque eu quero
         * que ele faça esse looping pelo menos uma vez*/
        do {        
        	/*Criando o menu*/
           System.out.printf("===> Sistema de Cadastro de Clientes <===\n\n");
           System.out.printf("Escolha uma opção:\n");          
           System.out.printf("1 - Incluir \n" +
                             "2 - Atualizar \n" +
                             "3 - Excluir \n" +
                             "4 - Exibir \n" +
                             "5 - Sair\n\n");
 
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
                   ContaBancaria conta = new ContaBancaria();
                   
                   System.out.print("Digite a agencia: ");
                   conta.setAgencia(ler.next());
                   
                   System.out.print("Digite o numero: ");
                   conta.setNumero(ler.next());
                   
                   /*Toda conta começa com 0 reais*/
                   conta.setSaldo(0);
                   
                   /*Criando uma referência em cliente para o objeto do tipo Conta que foi populado
                    * com os valores dos seus atributos*/
                   /*Conta é um atributo de Cliente, por isso eu uso o método set (Getters and Setters)*/
                   cliente.setConta(conta);
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
