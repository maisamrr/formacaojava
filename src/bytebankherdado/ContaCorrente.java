package bytebankherdado;

import bytebankencapsulado.Conta;

public class ContaCorrente extends Conta implements Tributavel {
    //extendendo a Conta você herda atributos e métodos, mas NÃO herda construtores. ele nunca passa para os filhos
    //por isso, esse construtor tem que ser criado na classe ContaCorrente e, como na mãe-Conta temos dois parâmetros no método, aqui também tem que ter
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.saldo*0.01;
    }
}
