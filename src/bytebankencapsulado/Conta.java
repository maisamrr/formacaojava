package bytebankencapsulado;

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular; //olha o relacionamento entre classes aqui. nesse caso, é composição
    private static int total = 0; //atenção, isso é total do número de contas, não é o saldo!

    public Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("A conta aberta na agência " + this.agencia + " tem o número " + this.numero);
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saca(valor)) {
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0) {
            System.out.println("Número de conta inválido.");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("Número de agência inválido.");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
