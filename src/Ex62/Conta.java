package Ex62;

public class Conta {
	private String agencia;
    private String numero;
    private double saldo;
   
    public String getAgencia() {
        return agencia;
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
   
    Conta(){
        this.agencia = "001";
        this.saldo = 0.0;
    }
   
    Conta(String agencia, String numero){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
    }
}
