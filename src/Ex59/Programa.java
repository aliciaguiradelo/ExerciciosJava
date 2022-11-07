package Ex59;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Cliente> listaClientes = new ArrayList();
		
		int opcao;
		int id;
		String possuiConta;
		int id_cliente;
		Cliente cli;
        int indexCliente;
        double valorDeposito;
		
		do {
			System.out.printf("...::: BANCO MACGYVER :::...\n\n");
			System.out.printf("===> Sistema de Cadastro de Clientes <===\n\n");
            System.out.printf("Escolha uma opção:\n");          
            System.out.printf("1 - Criar cliente/ conta \n" +
                             "2 - Depósito \n" +
                             "3 - Saque \n" +
                             "4 - Transferência \n" +
                             "5 - Consulta de saldo \n" +
                             "6 - Sair\n\n");
 
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();
            
            if (opcao == 1) {
                Cliente cliente = new Cliente();
                
                if(listaClientes.size() > 0) {
                    id_cliente = listaClientes.get(listaClientes.size()-1).getId() + 1;
                }
                else {
                    id_cliente = 1;
                }
                cliente.setId(id_cliente);
                
                System.out.print("Digite o seu nome: ");
                cliente.setNome(ler.next());
                
                System.out.print("Digite a seu idade: ");
                cliente.setIdade(ler.nextInt());
                
                System.out.print("Possui conta bancária? S/N");
                possuiConta = ler.next().toUpperCase();
                
                if(possuiConta.equals("S")) {
                    ContaBancaria conta = new ContaBancaria();
                    
                    System.out.print("Digite a agencia: ");
                    conta.setAgencia(ler.next());
                    
                    System.out.print("Digite o numero: ");
                    conta.setNumero(ler.next());
                    
                    conta.setSaldo(0);
                    
                    cliente.setConta(conta);
                }
                else {
                    cliente.setConta(null);                
                }
                
                listaClientes.add(cliente);
                
                System.out.printf("Cliente incluído com sucesso!");
                
                System.in.read();
            }
            
            else if(opcao ==2) {
            	for(Cliente c: listaClientes) {
            		System.out.println("ID: " + c.getId());
                    System.out.println("NOME: " + c.getNome());
                    System.out.println("IDADE: " + c.getIdade());
                    
                }
                
                System.out.print("Digite o ID da conta que você deseja depositar: ");
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
                    
                    System.out.print("Digite o valor que será depositado: ");
                    valorDeposito=ler.nextDouble();
                    
                    
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
            
            
			
		} while ((opcao>0) && (opcao<7));

	}

}
