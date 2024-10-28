public class Main {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        cc.depositar(200);
        Conta pp = new ContaPoupanca();

        cc.transferir(100, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}
