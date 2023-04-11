package ex74;

public class Backend extends Tecnologia implements ITecnololgia{
	private boolean possivelContainerizar;

	public boolean isPossivelContainerizar() {
		return possivelContainerizar;
	}

	public void setPossivelContainerizar(boolean possivelContainerizar) {
		this.possivelContainerizar = possivelContainerizar;
	}
	
	public Backend() {
		super();
	}

	public Backend(String linguagemProgramacao, String principalFramework, String descricaoLinguagem, String descricaoFramework, boolean possivelContainerizar) {
		super(linguagemProgramacao,principalFramework,descricaoLinguagem,descricaoFramework);
		this.possivelContainerizar=possivelContainerizar;
	}
	
	public String exibirDescricaoLinguagem() {
		// TODO Auto-generated method stub
		return "A descricao da linguagem é: " + this.getDescricaoLinguagem();
	}

	public String exibirDescricaoFramework() {
		// TODO Auto-generated method stub
		return "A descricao da linguagem é: " + this.getDescricaoFramework();
	}
}
