public class TestaValores {
    public static void main(String[] args) {

        Conta conta = new Conta(1337, 24226);
        //Conta incosistente referente as regras de negocio
        //conta.setAgencia(-50);
        //conta.setNumero(-330);
        System.out.println(conta.getAgencia());

        conta.setAgencia(1232123);

        Conta conta2 = new Conta(1337, 12458);

        System.out.println(Conta.getTotalDeContas());

    }
}
