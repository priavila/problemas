package beecrowd.problemas.nivel1;

import java.util.Scanner;

public class ProblemaSimples {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor1 = ler.nextInt();
        int valor2 = ler.nextInt();
        int PROD = valor1 * valor2;

        System.out.println("PROD = " + PROD);

    }
}
