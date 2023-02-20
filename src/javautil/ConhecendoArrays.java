package javautil;

public class ConhecendoArrays {

    public static void main(String[] args) {
        //int idades[] ou int[] idades, representações válidas
        int[] idades = new int[5];

        idades[0] = 29; //zero based = inicia com índice zero
        idades[1] = 55;
        idades[2] = 4;
        idades[3] = 82;
        idades[4] = 31;
        //idades[5] = 90; se eu fizer isso e rodar, dá uma ArrayIndexOutOfBoundsException Checked Exception = verificada pelo compilador

        System.out.println(idades.length);
    }
}
