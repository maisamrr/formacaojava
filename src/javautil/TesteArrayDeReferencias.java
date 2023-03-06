package javautil;

import bytebankherdado.ContaCorrente;

public class TesteArrayDeReferencias {

    public static void main(String[] args) {

        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente cc1 = new ContaCorrente(666, 90087);
        contas[0] = cc1;
        ContaCorrente cc2 = new ContaCorrente(666, 90527);
        contas[1] = cc2;

        System.out.println("CC1: Agencia = " + cc1.getAgencia() + " e Conta = " + cc1.getNumero());
        System.out.println(contas[0].getNumero());

    }
}
