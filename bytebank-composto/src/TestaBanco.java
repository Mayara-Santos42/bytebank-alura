public class TestaBanco {

    public static void main(String[] args) {
        Cliente mayara = new Cliente();
        mayara.nome = "Mayara Santos";
        mayara.cpf = "48325924856";
        mayara.profissao = "programadora";

        Conta contaDaMayara = new Conta();
        contaDaMayara.depositos(100);

        //associa a cliente Mayara a contaDaMayara, fazendo uma referencia
        contaDaMayara.titular = mayara;
        System.out.println(contaDaMayara.titular.nome);
        System.out.println(contaDaMayara.titular);
        System.out.println(mayara);
    }
}
