package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int valorLido;
        int contador = 0;

        valorLido = input.nextInt();

        while (contador < valorLido){
            contador++;

            if (contador % 2 == 0) {
                continue;
            }

            System.out.printf("%d%n", contador);
        }

        input.close();
    }
}
