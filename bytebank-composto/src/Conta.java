 public class Conta {
        private double saldo;
        int agencia;
        int numero;
        Cliente titular;
       // Cliente titular = new Cliente(); Toda conta abre um cliente

        //Métodos

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
}


