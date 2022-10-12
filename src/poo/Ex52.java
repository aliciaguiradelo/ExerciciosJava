package poo;

import java.util.Scanner;

public class Ex52 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Ex52_Produto [] listaproduto = new Ex52_Produto[9];
		
		System.out.println("..::CADASTRO DE PRODUTOS::..");
		
		for(int i = 0; i<=9;i++) {
			Ex52_Produto p = new Ex52_Produto();
			System.out.println("PRODUTO" + (i+1));
			System.out.println("Digite o id do produto: ");
			p.id = ler.nextInt();
			System.out.println("Digite a descrição do produto: ");
			p.descricao = ler.next();
			System.out.println("Digite o valor do produto: ");
			p.valor = ler.nextDouble();
			System.out.println("Digite a quantidade: ");
			p.quantidade = ler.nextDouble();
			
			listaproduto [i] = p;
		}
		for(int i=0; i<=9; i++) {
			if(listaproduto[i].valor <100) {
				System.out.println("PRODUTO" + (i+1));
				System.out.println("ID : " + listaproduto[i].id);
				System.out.println("DESCRIÇÃO : " + listaproduto[i].descricao);
				System.out.println("VALOR : " + listaproduto[i].valor);
				System.out.println("QUANTIDADE : " + listaproduto[i].quantidade);
			}
		}
		ler.close();

		

	}

}
