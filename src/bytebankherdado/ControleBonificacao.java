package bytebankherdado;

public class ControleBonificacao {

    private double bonificacaoTotal;

    //exemplo - polimorfismo
    //mesmo usando uma referência mais genérica, método getBonificacao() chamado sempre será o específico de cada objeto, ou seja, quando for uma gerente, vai ser o método dela, quando for uma funcionária, vai ser o padrão
    public void registra(Funcionaria funcionaria) {
        double bonificacao = funcionaria.getBonificacao();
        this.bonificacaoTotal += bonificacao;
    }

    public double getSoma() {
        return this.bonificacaoTotal;
    }
}

/*
* OBSERVAÇÃO
* Herança com Java tem dois caminhos = reutilização de código e polimorfismo
* Polimorfismo: o objeto NUNCA muda de tipo, o que pode mudar é a referência
*      Funcionaria gerente = new Gerente(); >> mais genérico para mais específico
* */
