package Ex69;

import java.util.Scanner;
import java.io.IOException;
import java.util.HashMap;

public class Programa {

	public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
       
        HashMap<Integer, Produto> listaProduto = new HashMap<Integer, Produto>();
       
        int opcao;
        int id;
        Produto prod;
        int idCategoria=0;
        int idProduto=0;
        String possuiCategoria;
 
        do {        
           System.out.printf("===> Sistema de Cadastro de Clientes <===\n\n");
           System.out.printf("Escolha uma opção:\n");          
           System.out.printf("1 - Incluir \n" +
                             "2 - Atualizar \n" +
                             "3 - Excluir \n" +
                             "4 - Exibir \n" +
                             "5 - Sair\n\n");


           System.out.printf("Digite a opção desejada: ");
           opcao = ler.nextInt();
           
           if (opcao == 1) {
               Produto produto = new Produto();
               
               idProduto++;
               produto.setId(idProduto);
               
               System.out.print("Digite o seu nome: ");
               produto.setNome(ler.next());
               
               System.out.print("Digite seu preco: ");
               produto.setPreco(ler.nextDouble());
               
               System.out.print("Digite sua quantidade: ");
               produto.setQuantidade(ler.nextDouble());
               
               System.out.print("Possui categoria? S/N");
               possuiCategoria = ler.next().toUpperCase();
               
               if(possuiCategoria.equals("S")) {
            	   Categoria categoria = new Categoria();
                   
            	   idCategoria ++;
            	   categoria.setId(idCategoria);
            	   
                   System.out.print("Digite o nome da categoria : ");
                   categoria.setNome(ler.next());
                  
                   
                   produto.setCategoria(categoria);
               }
               else {
            	   produto.setCategoria(null);                
               }
               
               listaProduto.put(idProduto, produto);
               
               System.out.printf("Produto incluído com sucesso!");
               System.in.read();
           }
           else if(opcao == 2) {              
        	   listaProduto.forEach((chave, valor) -> {
                   System.out.println("ID: " + chave + " - " + valor.exibirNomePreco());
                 });

               System.out.print("Digite o ID do produto que você deseja atualizar: ");
               id = ler.nextInt();
               
               if (listaProduto.containsKey(id)) {
            	   prod = listaProduto.get(id);   
                   
                   System.out.print("Digite o seu novo nome: ");
                   prod.setNome(ler.next());
                   
                   System.out.print("Digite seu novo preco: ");
                   prod.setPreco(ler.nextDouble());
                   
                   System.out.print("Digite sua nova quantidade: ");
                   prod.setQuantidade(ler.nextDouble());
                   
                   System.out.printf("Produto atualizado com sucesso!");
               }
               else {
                   System.out.printf("Produto não encontrado!");
               }
               System.in.read();
           }
           else if(opcao == 3) {
        	   listaProduto.forEach((chave, valor) -> {
                   System.out.println("ID: " + chave + " - " + valor.exibirNomePreco());
                 });
               
               System.out.print("Digite o ID do produto que você deseja excluir: ");
               id = ler.nextInt();
               
               if (listaProduto.containsKey(id)) {
            	   listaProduto.remove(id);
            	   System.out.printf("Produto excluído com sucesso!");
               }
               else
            	   System.out.printf("Produto não encontrado!");
               
               System.in.read();
           }
           else if(opcao == 4) {
        	   listaProduto.forEach((chave, valor) -> {
                   System.out.println("ID: " + chave + " - " + valor.exibirNomePreco());
                 });

               System.in.read();
           }
           
        }while( (opcao >= 1) && (opcao <= 4) );
        ler.close();
    } 

}
