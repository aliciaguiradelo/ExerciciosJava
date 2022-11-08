package Ex52;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*Criando um arraylist para guardar os objetos do tipo Produto*/
		Produto[] listaproduto = new Produto[3];
		
		/*Criando estrutura de repitição (FOR) para instanciar e popular os objetos 
		*e ir guardando no arraylist nas posições corretas, de acordo com o índice i
		*/
		for(int i = 0; i<3; i++) {
			Produto p = new Produto();
			System.out.println("Digite o id do " + (i+1) + " produto");
			p.id=ler.nextInt();
			System.out.println("Digite a descricao do " + (i+1) + " produto");
			p.descricao=ler.next();
			System.out.println("Digite o valor do " + (i+1) + " produto");
			p.valor=ler.nextDouble();
			System.out.println("Digite quantidade do " + (i+1) + " produto");
			p.quantidade=ler.nextDouble();
			
			listaproduto[i] = p;
		}
		for(int i = 0; i<3; i++) {
			if(listaproduto[i].valor>=100) {
				System.out.println("ID: " + listaproduto[i].id);
				System.out.println("DESCRICAO: " + listaproduto[i].descricao);
				System.out.println("VALOR: " + listaproduto[i].valor);
				System.out.println("QUANTIDADE: " + listaproduto[i].quantidade);
			}
		}
		ler.close();

	}

}
