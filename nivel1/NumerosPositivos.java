package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        double numero;
        int contador = 0;
        int contador2 = 0;

        while(contador < 6){
            numero = input.nextDouble();
            contador++;

            if(numero > 0){
                contador2++;
            }
        }

        System.out.printf("%d valores positivos%n", contador2);

        input.close();
    }
}
