package Ex57;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		/*Criando um Arraylist para guardar as referências dos objetos do tipo Cliente*/
		ArrayList<Cliente> listaClientes = new ArrayList<>();
	    
		/*Declarando variáveis que serão usadas no escopo dessa classe Programa*/
        int opcao;
        int id;
        Cliente cli;
        int indexCliente;
        int id_cliente;
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
               
               /*Crio uma estrutura condicional para verificar se o arraylist está vazio ou não.
                * Uso o método nomearraylist.size(), que vai mostrar a quantidade de objetos 
                * instanciados no arraylist*/
               if(listaClientes.size() > 0) {
            	   /*Se tiver algum objeto, eu vou pegar a quantidade de objetos que tem e somar
            	    * mais um porque estou criando um objeto.*/
                   id_cliente = listaClientes.get(listaClientes.size()-1).getId() + 1;
               }
               else {
            	   /*Se não houver objetos no arraylist, o objeto que eu criar ocupará o primeiro 
            	    * espaço do array, por isso id=1*/
                   id_cliente = 1;
               }
               /*Vou atualizar a posição do objeto*/
               cliente.setId(id_cliente);
               
               System.out.print("Digite o seu nome: ");
               cliente.setNome(ler.next());
               
               System.out.print("Digite a seu idade: ");
               cliente.setIdade(ler.nextInt());
               
               System.out.print("Digite o seu e-mail: ");
               cliente.setEmail(ler.next());
               
               System.out.print("Possui conta bancária? S/N");
               possuiConta = ler.next().toUpperCase();
               
               /*Se tiver conta, eu crio um objeto para popular*/
               if(possuiConta.equals("S")) {
                   ContaBancaria conta = new ContaBancaria();
                   
                   System.out.print("Digite a agencia: ");
                   conta.setAgencia(ler.next());
                   
                   System.out.print("Digite o numero: ");
                   conta.setNumero(ler.next());
                   
                   /*Toda conta começa com 0 reais*/
                   conta.setSaldo(0);
                   
                   
                   cliente.setConta(conta);
               }
               /*Se não tiver conta, deixa nulo*/
               else {
                   cliente.setConta(null);                
               }
               
               /*Adiciona o objeto populado no arraylist*/
               listaClientes.add(cliente);
               
               System.out.printf("Cliente incluído com sucesso!");
               
               /*Retorna um int -1*/
               System.in.read();
           }
           else if(opcao == 2) {
        	   //for it para varrer um arraylist
               for(Cliente c: listaClientes) {
                   System.out.println(c.exibirNomeIdade());
               }
               
               System.out.print("Digite o ID do cliente que você deseja atualizar: ");
               id = ler.nextInt();
               
               indexCliente = -1;
               for(Cliente c: listaClientes) {
                   if (c.getId() == id) {
                       indexCliente = listaClientes.indexOf(c);
                       break;
                   }
               }
               
               if (indexCliente != -1) {
                   cli = listaClientes.get(indexCliente);
                   
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
               for(Cliente c: listaClientes) {
                   System.out.println(c.exibirNomeIdade());
               }
               
               System.out.print("Digite o ID do cliente que você deseja excluir: ");
               id = ler.nextInt();
               
               indexCliente = -1;
               for(Cliente c: listaClientes) {
                   if (c.getId() == id) {
                       indexCliente = listaClientes.indexOf(c);
                       break;
                   }
               }
               
               if (indexCliente != -1) {                              
                   listaClientes.remove(indexCliente);
                   
                   System.out.printf("Cliente excluído com sucesso!");
               }
               else {
                   System.out.printf("Cliente não encontrado!");
               }
               System.in.read();
           }
           else if(opcao == 4) {
               for(Cliente c: listaClientes) {
                   System.out.println(c.exibirN());
                   
                   if (c.getConta() != null)
                       System.out.println(c.exibirDadosConta());
               }
               
               System.in.read();
           }
           
        }while( (opcao >= 1) && (opcao <= 4) );
        
        ler.close();
    }
}
