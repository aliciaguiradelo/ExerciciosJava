package ex74;

public class Frontend extends Tecnologia implements ITecnololgia{
	private boolean compativelMobile;
	private boolean compativelWeb;
	
	
	
	public boolean isCompativelMobile() {
		return compativelMobile;
	}

	public void setCompativelMobile(boolean compativelMobile) {
		this.compativelMobile = compativelMobile;
	}

	public boolean isCompativelWeb() {
		return compativelWeb;
	}

	public void setCompativelWeb(boolean compativelWeb) {
		this.compativelWeb = compativelWeb;
	}

	public Frontend() {
		super();
	}

	public Frontend(String linguagemProgramacao, String principalFramework, String descricaoLinguagem, String descricaoFramework, boolean compativelMobile, boolean compativelWeb) {
		super(linguagemProgramacao,principalFramework,descricaoLinguagem,descricaoFramework);
		this.compativelMobile=compativelMobile;
		this.compativelWeb=compativelWeb;
	}

	
	public String exibirDescricaoLinguagem() {
		return this.getDescricaoLinguagem();
	}

	
	public String exibirDescricaoFramework() {
		return this.getDescricaoFramework();
	}
	
}
