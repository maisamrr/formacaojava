package bytebankherdado;

public class TesteContas {

    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(555, 5555);
        cc1.deposita(700);

        ContaPoupanca cp1 = new ContaPoupanca(555, 7611);
        cp1.deposita(45);

        cc1.transfere(100, cp1);

        System.out.println("CC: " + cc1.getSaldo());
        System.out.println("CP: " + cp1.getSaldo());
    }
}
