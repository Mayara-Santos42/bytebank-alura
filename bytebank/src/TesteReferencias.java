public class TesteReferencias {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("Saldo da Primeira conta R$ " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("Valor da Segunda conta R$" + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("Valor da Segunda conta R$ " + segundaConta.saldo);

        System.out.println("E agora, qual o valor da primeira conta? R$ " + primeiraConta.saldo);

        if(primeiraConta == segundaConta) {
            System.out.println("São a mesma conta!");
        } else {
            System.out.println("São contas diferentes!");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
