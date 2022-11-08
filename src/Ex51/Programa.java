package Ex51;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*Criando um arraylist para guardar os objetos do tipo Cliente*/
		Cliente [] listacliente = new Cliente [5];
		
		/*Criando estrutura de repitição (FOR) para instanciar e popular os objetos 
		*e ir guardando no arraylist nas posições corretas, de acordo com o índice i
		*/
		for(int i = 0; i<5; i++) {
			/*Criando(Instanciando) um novo objeto do tipo cliente.Qaundo atribuo valor 
			 * para os atributos de uma classe eu estou populando um objeto
			 * */
			Cliente c = new Cliente();
			System.out.println("Digite o id do "+ (i+1) + " cliente");
			c.id=ler.nextInt();
			System.out.println("Digite o nome do " + (i+1) + " cliente");
			c.nome=ler.next();
			System.out.println("Digite a idade do "+ (i+1) + " cliente");
			c.idade=ler.nextInt();
			System.out.println("Digite o email do " + (i+1) + " cliente");
			c.email=ler.next();
			
			listacliente[i] = c;
		}
		for(int i = 0; i<5; i++) {
			if(listacliente[i].idade>=18) {
				System.out.println("O cliente "+ (i+1) + " é maior de idade!");
				System.out.println("ID: " + listacliente[i].id);
				System.out.println("NOME: " + listacliente[i].nome);
				System.out.println("IDADE: " + listacliente[i].idade);
				System.out.println("EMAIL: " + listacliente[i].email);
			}
		}
		ler.close();

	}

}
