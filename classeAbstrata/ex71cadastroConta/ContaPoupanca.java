package ex71cadastroConta;

public class ContaPoupanca extends Conta{
    private double rentabilidade;


    public double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
   
    public ContaPoupanca() {
    }
   
    public ContaPoupanca(String agencia, String numero, double salario, double rentabilidade) {
        super(agencia, numero, salario);
       
        this.rentabilidade = rentabilidade;
    }
   
    public void Depositar(double valor) {
        super.Depositar(valor);
       
        valor = valor + 0.50;
        this.setSaldo(valor);
    }

	@Override
	public void Sacar() {
		// TODO Auto-generated method stub
		
	}
}
