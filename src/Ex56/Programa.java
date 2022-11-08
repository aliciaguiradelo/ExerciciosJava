package Ex56;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Produto[] listaproduto = new Produto [3];
		
		String possuiCategoria = null;
		
		for(int i=0; i<3; i++) {
			Produto p = new Produto();
			System.out.println("*****CADASTRO DO " + (i+1) + " PRODUTO*************");
			System.out.println("Digite o ID do produto: ");
			p.setId(ler.nextInt());
			System.out.println("Digite o NOME do produto: ");
			p.setNome(ler.next());
			System.out.println("Digite seu PRECO: ");
			p.setPreco(ler.nextDouble());
			System.out.println("Digite sua QUANTIDADE: ");
			p.setQuantidade(i);
			System.out.println("Esse produto possui umaCATEGORIA? (S/N) ");
			possuiCategoria=ler.next().toUpperCase();
			
			if(possuiCategoria == "S") {
				Categoria c = new Categoria ();
				System.out.println("Digite o ID da CATEGORIA: ");
				c.setId(ler.nextInt());
				System.out.println("Digite o NOME da CATEGORIA: ");
				c.setNome(ler.next());
				
				p.setCategoria(c);
			}
			else {
				p.setCategoria(null);
			}
			listaproduto[i] = p;
		}
		for(int i=0; i<3; i++) {
			System.out.println("*****PRODUTO CADASTRADO*****");
			System.out.println(listaproduto[i].exibirNomePreco());
			if(listaproduto[i].getCategoria() != null) {
				System.out.println("*****CATEGORIA*****");
				System.out.println(listaproduto[i].exibirNomeQuantidade());
			}
		}
		ler.close();
	}

}
