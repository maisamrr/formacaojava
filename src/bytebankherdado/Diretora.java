package bytebankherdado;

public class Diretora extends Funcionaria implements Autenticavel {

    private AutenticacaoUtil autenticador; //composição

    public Diretora() {
        this.autenticador = new AutenticacaoUtil();
    }

    public double getBonificacao() {
        return 2*super.getSalario();
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
