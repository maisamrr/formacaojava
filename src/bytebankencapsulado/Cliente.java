package bytebankencapsulado;

import bytebankherdado.AutenticacaoUtil;
import bytebankherdado.Autenticavel;

public class Cliente implements Autenticavel {

    private String nome;
    private String cpf;
    private String profissao;
    private AutenticacaoUtil autenticador; //composição(1)

    public Cliente() {
        this.autenticador = new AutenticacaoUtil(); //(1)quando criamos um cliente, automaticamente um autenticador também é criado. um depende do outro.
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
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