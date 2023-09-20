package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class ParesEntreCincoNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int valorDigitado;
        int contador = 0;
        int cc = 0;

        while(contador < 5) {
            valorDigitado = input.nextInt();
            contador++;

            if (valorDigitado % 2 == 0) {
                cc++;
            }
        }

        System.out.printf("%d valores pares%n", cc);

        input.close();
    }
}
