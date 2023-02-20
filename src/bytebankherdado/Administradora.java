package bytebankherdado;

public class Administradora extends Funcionaria implements Autenticavel {

    private AutenticacaoUtil autenticador; //composição

    public Administradora() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return 0.9*super.getSalario();
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
