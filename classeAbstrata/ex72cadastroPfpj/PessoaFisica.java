package ex72cadastroPfpj;

public class PessoaFisica extends Pessoa {
	private String CPF;


    public String getCPF() {
        return CPF;
    }


    public void setCPF(String cPF) {
        CPF = cPF;
    }


    public PessoaFisica() {
        super();
    }


    public PessoaFisica(int id, String nome, String email, String cpf) {
        super(id, nome, email);
        this.CPF = cpf;
    }
}
