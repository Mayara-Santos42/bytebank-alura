public class TestaContaDaSabrina {
    //Sem Cliente

    public static void main(String[] args) {
        Conta contaDaSabrina = new Conta();
        System.out.println(contaDaSabrina.getSaldo());

        contaDaSabrina.titular = new Cliente();
        System.out.println(contaDaSabrina.titular);

        contaDaSabrina.titular.nome = "Sabrina";
        System.out.println(contaDaSabrina.titular.nome);
    }


}
