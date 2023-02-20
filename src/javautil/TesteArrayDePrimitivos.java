package javautil;

public class TesteArrayDePrimitivos {

    public static void main(String[] args) {
        int[] idades = new int[5];

        for(int i = 0; i < idades.length; i++) {
            idades[i] = (i * 3) + 1;
            System.out.println("Idade: " + idades[i]);
        }
    }
}
