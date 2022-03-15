public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDaMayara = new Conta();
        contaDaMayara.saldo = 100;

        contaDaMayara.depositos(50);
        System.out.println(contaDaMayara.saldo);

        boolean conseguiuRetirar = contaDaMayara.saque(20);
        System.out.println(contaDaMayara.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaSabrina = new Conta();
        contaDaSabrina.depositos(1000);
        boolean sucessoTransferencia = contaDaSabrina.transferencia(300, contaDaMayara);

        if(sucessoTransferencia) {
            System.out.println("Transferencia realizada com sucesso");
        } else {
            System.out.println("Você não tem dinheiro suficiente!");
        }

        System.out.println(contaDaSabrina.saldo);

        System.out.println(contaDaMayara.saldo);

        contaDaMayara.titular = "Mayara Santos";
        System.out.println(contaDaMayara.titular);
    }
}
