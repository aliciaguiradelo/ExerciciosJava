package poo;

import java.util.Scanner;

public class Ex56 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Ex56_Produto [] listaproduto = new Ex56_Produto [5];
		
		char possuiCategoria;
		
		for(int i = 0;i<5;i++) {
			Ex56_Produto produto = new Ex56_Produto();
			
			System.out.println("*****CADASTRO DO " + (i+1) + " PRODUTO*************");
			System.out.println("NOME: ");
			produto.setNome(scn.next());
			System.out.println("PRECO: ");
			produto.setPreco(scn.nextDouble());
			System.out.println("QUANTIDADE: ");
			produto.setQuantidade(scn.nextDouble());
			
			System.out.println("Este produto possui uma categoria? (S/N)");
			possuiCategoria = scn.next().toUpperCase().charAt(0);
			
			if(possuiCategoria == 'S') {
				Ex56_Categoria categoria = new Ex56_Categoria();
				
				System.out.println("ID");
				categoria.setId(scn.nextInt());
				
				System.out.println("CATEGORIA");
				categoria.setNome(scn.next());
				
				produto.setCategoria(categoria);
				
				
			}
			
			else {
				produto.setCategoria(null);
			}
			
			listaproduto[i] = produto;
			
			
		}
		
		for(int i=0; i<5;i++) {
			System.out.println("*****PRODUTO CADASTRADO*****");
			System.out.println(listaproduto[i].exibirNomePreco());
			if(listaproduto[i].getCategoria() != null) {
				System.out.println("*****CATEGORIA*****");
				System.out.println(listaproduto[i].exibirNomeQuantidade());
			}
			
		}
		
		scn.close();

	}

}
