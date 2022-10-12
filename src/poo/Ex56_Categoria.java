package poo;

public class Ex56_Categoria {
	private String nome;
	private int id;
	
	Ex56_Categoria(){
		
	}
	
	Ex56_Categoria(int id, String nome){
		this.id=id;
		this.nome=nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
