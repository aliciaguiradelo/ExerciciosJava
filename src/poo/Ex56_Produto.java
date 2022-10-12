package poo;

public class Ex56_Produto {
	private int id;
	private String nome;
	private double preco;
	private double quantidade;
	private Ex56_Categoria categoria;
	
	Ex56_Produto (){
		
	}
	
	Ex56_Produto (int id, String nome, double preco, double quantidade, Ex56_Categoria categoria){
		this.id=id;
		this.nome=nome;
		this.preco=preco;
		this.quantidade=quantidade;
		this.categoria=categoria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public Ex56_Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Ex56_Categoria categoria) {
		this.categoria = categoria;
	}
	
	public String exibirNomePreco() {
		return "NOME: " + this.nome + "\nPRECO: " + this.preco;
	}
	
	public String exibirNomeQuantidade() {
		return "NOME: " + this.categoria.getNome() + "\nID: " + this.categoria.getId();
	}

}
