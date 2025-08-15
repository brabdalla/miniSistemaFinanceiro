public class ContaBancaria {

    private String nomeTitular;
    private float saldo;
    
    public ContaBancaria(String titular, float saldoInicial){
        this.nomeTitular = titular;
        this.saldo = saldoInicial;
    }
    
    public void deposito(float valorDeposito){
        this.saldo = this.saldo+valorDeposito;
    }

    public void saque(float valorSaque){
        if (this.saldo < valorSaque) {
            System.out.println("Saldo insuficiente !");
        }else{
            this.saldo = this.saldo - valorSaque;
        }  
    }

    public void verSaldo(){
        System.out.println("O saldo da conta é: "+ this.saldo);
    }

    public void verTitular(){
        System.out.println("Titular da conta: "+this.nomeTitular);
    }
}
