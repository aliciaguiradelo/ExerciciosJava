package Ex58;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Programa {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Produto> listaProduto = new ArrayList<>();
		
		int id;
		String nome;
		double preco;
		double quantidade;
		Produto prod;
		int id_produto;
		String possuiCategoria;
		int indexProduto;
		int opcao;
		
		do {
			System.out.println("Escolha uma opção: ");
			System.out.printf("1 - Incluir produto \n" +
		                     "2 - Atualizar produto \n" +
		                     "3 - Excluir produto \n" +
		                     "4 - Exibir produtos \n" +
		                     "5 - Sair\n\n");
		   System.out.printf("Digite a opção desejada: ");
		   opcao = ler.nextInt();
		   
		   if(opcao == 1) {
			   Produto produto = new Produto();
			   
			   if(listaProduto.size()>0) {
				   id_produto = listaProduto.get(listaProduto.size()-1).getId() + 1;
			   }
			   
			   else {
				   id_produto = 1;
			   }
			   
			   produto.setId(id_produto);
			   
			   System.out.println("Digite o nome do produto: ");
			   produto.setNome(ler.next());
			   
			   System.out.println("Digite o preco do produto: ");
			   produto.setPreco(ler.nextDouble());
			   
			   System.out.println("Digite a quantidade do produto: ");
			   produto.setQuantidade(ler.nextDouble());
			   
			   System.out.println("possui categoria? (S/N)");
			   possuiCategoria = ler.next().toUpperCase();
			   
			   if(possuiCategoria.equals("S")) {
				   Categoria categoria = new Categoria();
				   
				   System.out.println("Qual é o nome da categoria?");
				   categoria.setNome(ler.next());
				   
				   System.out.println("Qual é o id da categoria?");
				   categoria.setId(ler.nextInt());
				   
				   categoria.setId(0);
				   
				   produto.setCategoria(categoria);
				   
			   }
			   
			   else {
				   produto.setCategoria(null);
			   }
			   
			   listaProduto.add(produto);
			   
			   System.out.printf("Produto incluído com sucesso!");
               
               System.in.read();
			   
		   }
		   
		   else if (opcao == 2) {
			   for(Produto p: listaProduto) {
				   System.out.println(p.exibirNomePreco());
			   }
			   
			   System.out.println("Digite o ID do produto que você deseja atualizar: ");
			   id = ler.nextInt();
			   
			   indexProduto = -1;
			   for (Produto p : listaProduto) {
				   if(p.getId()==id) {
					   indexProduto = listaProduto.indexOf(p);
					   break;
				   }
			   }
			   
			   if(indexProduto != -1) {
				   prod = listaProduto.get(indexProduto);
				   
				   System.out.println("Digite o novo nome");
				   prod.setNome(ler.next());
				   
				   System.out.print("Digite a sua nova quantidade: ");
                   prod.setQuantidade(ler.nextDouble());
                   
                   System.out.print("Digite o seu novo preco: ");
                   prod.setPreco(ler.nextDouble());
                   
                   System.out.printf("Produto atualizado com sucesso!");
               }
               else {
                   System.out.printf("Produto não encontrado!");
               }
               System.in.read();
           }
           else if(opcao == 3) {
               for(Produto p: listaProduto) {
                   System.out.println(p.exibirNomePreco());
               }
               
               System.out.print("Digite o ID do produto que você deseja excluir: ");
               id = ler.nextInt();
               
               indexProduto = -1;
               for(Produto p: listaProduto) {
                   if (p.getId() == id) {
                       indexProduto = listaProduto.indexOf(p);
                       break;
                   }
               }
               
               if (indexProduto != -1) {                              
                   listaProduto.remove(indexProduto);
                   
                   System.out.printf("Produto excluído com sucesso!");
               }
               else {
                   System.out.printf("Produto não encontrado!");
               }
               System.in.read();
           }
           else if(opcao == 4) {
               for(Produto p: listaProduto) {
                   System.out.println(p.exibirNomePreco());
                   
                   if (p.getCategoria() != null)
                       System.out.println(p.exibirNomeQuantidade());
               }
               
               System.in.read();
           }
           
        }while( (opcao >= 1) && (opcao <= 4) );
        
        ler.close();
    }
}
