package Ex68;

public class ContaBancaria {
	//Atributos da classe Conta Bancaria
	private String agencia;
	private String numero;
	private double saldo;
	
	//Construtor padrão
	ContaBancaria (){
		
	}
	
	//Construtor não padrão
	ContaBancaria (String agencia, String numero, double saldo){
		this.agencia=agencia;
		this.numero=numero;
		this.saldo=saldo;
	}
	//Getters and Setters dos atributos privados
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
