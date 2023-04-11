package ex74;

public abstract class Tecnologia implements ITecnololgia {
	//Atributos
	private String linguagemProgramacao;
	private String principalFramework;
	private String descricaoLinguagem;
	private String descricaoFramework;
	
	//Getters and Setters
	public String getLinguagemProgramacao() {
		return linguagemProgramacao;
	}
	public void setLinguagemProgramacao(String linguagemProgramacao) {
		this.linguagemProgramacao = linguagemProgramacao;
	}
	public String getPrincipalFramework() {
		return principalFramework;
	}
	public void setPrincipalFramework(String principalFramework) {
		this.principalFramework = principalFramework;
	}
	public String getDescricaoLinguagem() {
		return descricaoLinguagem;
	}
	public void setDescricaoLinguagem(String descricaoLinguagem) {
		this.descricaoLinguagem = descricaoLinguagem;
	}
	public String getDescricaoFramework() {
		return descricaoFramework;
	}
	public void setDescricaoFramework(String descricaoFramework) {
		this.descricaoFramework = descricaoFramework;
	}
	public String exibirDescricaoLinguagem () {
		return " ";
	}
	
	public String exibirDescricaoFramework (){
		return " ";
	}
	//Construtor padrão
	public Tecnologia() {
		
	}
	//Construtor não padrão
	public Tecnologia(String linguagemProgramacao, String principalFramework, String descricaoLinguagem, String descricaoFramework) {
		this.linguagemProgramacao=linguagemProgramacao;
		this.principalFramework=principalFramework;
		this.descricaoLinguagem=descricaoLinguagem;
		this.descricaoFramework=descricaoFramework;
	}

}
