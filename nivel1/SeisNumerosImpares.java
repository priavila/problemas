package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int contador = 0;
        int impar;

        int valorLido = input.nextInt();

        while (contador < 6) {
            contador++;
            impar = valorLido;

            if (valorLido % 2 == 0) {
                impar++;
                System.out.printf("%d%n", impar);
            }

            if (valorLido % 2 != 0) {
                System.out.printf("%d%n", impar);
            }

            impar++;
            valorLido = impar;

            input.close();
        }
    }
}
