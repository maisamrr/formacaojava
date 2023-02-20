package bytebankherdado;

import bytebankencapsulado.Cliente;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(666);

        Administradora a = new Administradora();
        a.setSenha(666);

        Cliente c = new Cliente();
        c.setSenha(666);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(a);
        si.autentica(c);
    }
}
