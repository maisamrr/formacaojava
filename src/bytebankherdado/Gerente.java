package bytebankherdado;

//classe filha de Funcionário = herança
public class Gerente extends Funcionaria implements Autenticavel {

    private AutenticacaoUtil autenticador; //composição

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    //reescrita do método definido na classe mãe
    public double getBonificacao() {
        return super.getSalario(); //o salário foi definido da classe mãe, então o super indica que precisamos subir na hierarquia. esse atributo não está definido na classe em que estamos
    }

    //métodos da interface
    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
