package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int valor = input.nextInt(); // 576
        System.out.println(valor);

        System.out.println(valor / 100 + " nota(s) de R$ 100,00"); // 576/100 = 5
        valor = valor % 100; // 576%100 = 76 resto da divisão
        System.out.println(valor / 50 + " nota(s) de R$ 50,00"); // 76/50 = 1
        valor = valor % 50; // 76%50 = 26
        System.out.println(valor / 20 + " nota(s) de R$ 20,00"); // 26/20 = 1
        valor = valor % 20; // 26%20 = 6
        System.out.println(valor / 10 + " nota(s) de R$ 10,00"); // 6/10 = 0
        valor = valor % 10; // 6%10 = 6
        System.out.println(valor / 5 + " nota(s) de R$ 5,00"); // 6/5 = 1
        valor = valor % 5; // 6%5 = 1
        System.out.println(valor / 2 + " nota(s) de R$ 2,00"); // 1/2 = 0
        valor = valor % 2; // 1%2 = 1
        System.out.println(valor / 1 + " nota(s) de R$ 1,00"); // 1/1 = 1

        input.close();
    }
}
