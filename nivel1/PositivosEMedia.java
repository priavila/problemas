package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class PositivosEMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        double valor;
        int contador = 0;
        double soma = 0;
        double media;
        int cc = 0;

        while(contador < 6 ) {
            valor = input.nextDouble();
            contador++;

            if(valor > 0) {
                cc++;
                soma = soma + valor;
            }
            
        }

        media = soma / cc;

        System.out.printf("%d valores positivos%n", cc);
        System.out.printf("%.1f%n", media);

        input.close();
    }
}
