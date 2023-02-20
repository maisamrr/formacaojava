package bytebankherdado;

public class TesteFuncionaria {

    public static void main(String[] args) {
        Funcionaria laika = new Gerente();
        laika.setNome("Laika Moreira");
        laika.setCpf("000.000.000-00");
        laika.setSalario(10000);

        Gerente maisa = new Gerente();
        maisa.setNome("Maisa Moreira");
        maisa.setSalario(30000);
        maisa.setCpf("111.111.111-11");

        Diretora isabella = new Diretora();
        isabella.setNome("Isabella Vale");
        isabella.setSalario(50000);
        isabella.setCpf("222.222.222-22");

        Administradora sandra = new Administradora();
        sandra.setNome("Sandra Araujo");
        sandra.setSalario(40000);
        sandra.setCpf("333.333.333-33");

        System.out.println(maisa.getNome());
        System.out.println(maisa.getBonificacao());
        System.out.println(laika.getNome());
        System.out.println(laika.getBonificacao());
        System.out.println(isabella.getNome());
        System.out.println(isabella.getBonificacao());
        System.out.println(sandra.getNome());
        System.out.println(sandra.getBonificacao());

    }
}
