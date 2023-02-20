package bytebankherdado;

//dentro de uma interface, não pode ter nada concreto
public interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}


/*
* As interfaces são uma alternativa a herança referente ao polimorfismo. Elas são um contrato que determina que quem o implementa deve obrigatoriamente implementar seus métodos abstratos (sem corpo). A vantagem é que, como os métodos são abstratos, uma classe pode implementar mais de uma interface sem haver “briga” por qual método implementar, já que é a própria classe que vai dizer como isso deve ser feito.
* */