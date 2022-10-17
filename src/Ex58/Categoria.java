package Ex58;

public class Categoria {
	private String nome;
	private int id;
	
	Categoria(){
		
	}
	
	Categoria(int id, String nome){
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
