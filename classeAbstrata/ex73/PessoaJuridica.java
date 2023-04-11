package ex73;

import ex72cadastroPfpj.Pessoa;

public class PessoaJuridica extends Pessoa implements IPessoa {
	private String CNPJ;
	   
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }

    public PessoaJuridica() {
    }
   
    public PessoaJuridica(int id, String nome, String email, String cnpj) {
        super(id, nome, email);
        this.CNPJ = cnpj;
    }
}
