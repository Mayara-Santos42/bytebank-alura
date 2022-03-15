 public class Conta {

        private double saldo;
        private int agencia;
        private int numero;
        private Cliente titular;
        private static int totalDeContas = 0; //Instancia

        //Este é o construtor
        public Conta(int agencia, int numero){
            Conta.totalDeContas++;
            //System.out.println("Qual é o total de contas? " + Conta.totalDeContas);
            //this.saldo = 100;
            this.agencia = agencia;
            this.numero = numero;
            //System.out.println("Estou criando uma conta" + this.numero);
        }

        public void depositos(double valor) {
            this.saldo += valor;
        }

        public boolean saque(double valor) {
            if(this.saldo >= valor) {
                this.saldo -= valor;
                return true;
            } else {
                return false;
            }
        }

        public boolean transferencia(double valor, Conta destino) {
            if(this.saldo >= valor) {
                this.saldo -= valor;
                destino.depositos(valor);
                return true;
            } else {
                return false;
            }

        }

        public double getSaldo(){

            return this.saldo;
        }

        public int getNumero() {

            return this.numero;
        }

     public Conta() {
         super();
     }

     public void setNumero(int numero) {
            if(numero <= 0) {
                System.out.println("Não pode valor <=0 ");
            }
            this.numero = numero;
        }

        public int getAgencia() {
            return this.agencia;
         }

        public void setAgencia(int agencia) {
            if(agencia <= 0) {
                System.out.println("Não pode valor menor igual a 0");
                return;
            }
            this.agencia = agencia;
        }

     public void setTitular(Cliente titular) {
         this.titular = titular;
     }

     public Cliente getTitular() {
         return titular;
     }

     public static int getTotalDeContas() {
            return Conta.totalDeContas;
     }
 }


