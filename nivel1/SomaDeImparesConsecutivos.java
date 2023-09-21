package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class SomaDeImparesConsecutivos {
    public static void main(String[] args) {
        int x, y, diferenca1, diferenca2, soma = 0;
        int contador1 = 1;
        int contador2 = 1;

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        x = input.nextInt();
        y = input.nextInt();

        diferenca1 = x - y;
        diferenca2 = y - x;

        do {

            if (x > y) {
                contador1++;
                x--;
                if (x % 2 != 0) {
                    soma += x;
                }
            }

        } while (contador1 < diferenca1);

        do {
            if (y > x) {
                contador2++;
                y--;
                if (y % 2 != 0) {
                    soma += y;
                }
            }
        } while (contador2 < diferenca2);

        input.close();

        System.out.println(soma);
    }
}