package ex71cadastroConta;

public abstract class Conta {
    private String agencia;
    private String numero;
    private double saldo;
   
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


    protected String exibirMensagem() {
        return "Bem vindo ao Internet Banking do Prof. Joseffe!";
    }  
   
    Conta(){
       
    }
   
    Conta(String agencia, String numero, double salario){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = salario;
    }


    public abstract void Sacar();
   
   
    public void Depositar(double valor) {
        this.saldo += valor;
    }
   
    public void Depositar(double valor, String nomeDepositante) {
        this.saldo += valor;
    }
   
    public void Depositar(String nomeDepositante, double valor, String telefoneDepositante) {
        this.saldo += valor;
    }
}
