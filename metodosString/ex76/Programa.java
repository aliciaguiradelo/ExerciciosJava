package ex76;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		String baseDados = "CJose dos Santos,42,Sao Paulo;CSandra Silva,36,Sao Jose do Rio Preto;CAugusto Soares,22,Sao Paulo;CVanderlei Azevedo,45,Santos;CVanessa Ferreira,27,Sao Paulo;PMouse,1,9.90;PTeclado,3,19.90;PMonitor,2,349.90;PHD SSD,2,199.90;PProcessador,1,350.00";
		
		String [] listaClientesProdutos = baseDados.split(";");
		//valores = [CJose dos Santos,42,Sao Paulo, CSandra Silva,36,Sao Jose do Rio Preto] 
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		
		for(String registro : listaClientesProdutos) {
			if (registro.substring(0, 1).equals("C")) {
				//System.out.println(registro);
				registro = registro.substring(1);
				//System.out.println(registro);
				String [] dadosCliente = registro.split(",");
				
				Cliente c = new Cliente();
				c.setNome(dadosCliente[0]);
				c.setIdade(Integer.parseInt(dadosCliente[1]));
				c.setCidade(dadosCliente[2]);
				
				clientes.add(c);
			}
			else if (registro.getBytes()[0] == 80) {
				registro = registro.replaceFirst("P", "");
				System.out.println(registro);
				
				String[] dadosProduto = registro.split(",");
				
				Produto p = new Produto();
				p.setNome(dadosProduto[0]);
				p.setQntdEstoque(Double.parseDouble(dadosProduto[1]));
				p.setPreco(Double.parseDouble(dadosProduto[2]));
				
				produtos.add(p);
			}
		}
		System.out.println("CLIENTES: ");
		for (Cliente c : clientes) {
			System.out.println("NOME: " + c.getNome());
			System.out.println("IDADE: " + c.getIdade());
			System.out.println("CIDADE: " + c.getCidade());
		}
		
		System.out.println("PRODUTOS: ");
		for (Produto p : produtos) {
			System.out.println("NOME: " + p.getNome());
			System.out.println("ESTOQUE: " + p.getQntdEstoque());
			System.out.println("PRECO: " + p.getPreco());
		}

	}

}
