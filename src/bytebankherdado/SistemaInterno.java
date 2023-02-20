package bytebankherdado;

public class SistemaInterno {

    private int senha = 666;

    public void autentica(Autenticavel fa) {
        boolean autenticou = fa.autentica(senha);
        if(autenticou) {
            System.out.println("Sistema autenticado.");
        } else {
            System.out.println("Falha ao autenticar o sistema.");
        }
    }

}
