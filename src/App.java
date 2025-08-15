
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("*****Mini sistema financeiro*****");
        ContaBancaria primeiraConta = new ContaBancaria("João", 100);
        ContaBancaria segundaConta = new ContaBancaria("Maria", 1000);
        primeiraConta.deposito(150);
        primeiraConta.verTitular();
        primeiraConta.verSaldo();
        System.out.println("---------------------------------");
        segundaConta.saque(500);
        segundaConta.verTitular();
        segundaConta.verSaldo();
        System.out.println("---------------------------------");



    }
}
