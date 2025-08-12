
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("*****Mini sistema financeiro*****");
        contaBancaria primeiraConta = new contaBancaria("João", 100);
        contaBancaria segundaConta = new contaBancaria("Maria", 1000);
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
