public class TesteSaqueNegativos {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositos(100);
        System.out.println(conta.saque(101));

        conta.saque(101);

        System.out.println(conta);

        System.out.println(conta.getSaldo());

        conta.numero = -1377;

        //proibido
        //conta.saldo = conta.saldo - 101;
        //System.out.println(conta.saldo);
    }
}
