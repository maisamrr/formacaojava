package bytebankherdado;

//abstract = é um conceito. não posso instanciar um objeto com essa classe, não existe alguém que é apenas funcionária, sempre tem um tipo mais específico
public abstract class Funcionaria {
    private String nome;
    private String cpf;
    //protected double salario; //o modificador de visibilidade protected permite que as classes filhas consigam ver o atributo, mas outras classes não
    private double salario; //no dia a dia não se utiliza mt protected, é melhor chamar o super quando se trata da classe filha

    //o construtor default é esse, mesmo que eu não escreva ele vai funcionar assim
    public Funcionaria() {

    }
    //método sem corpo, não há implementação. mas os filhos precisam implementar
    public abstract double getBonificacao();

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
