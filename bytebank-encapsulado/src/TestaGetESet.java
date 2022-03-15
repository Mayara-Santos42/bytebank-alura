public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(1337,2448);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente mayara = new Cliente();
        mayara.setNome("Mayara Santos");

        conta.setTitular(mayara); //faz uma referencia do titular até o nome

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programadora Jr");

        System.out.println(conta.getTitular().getProfissao());

        System.out.println(mayara + " " + conta.getTitular());


    }
}

