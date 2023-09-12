package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
            double raio = input.nextDouble();
            double volumeEsfera = (4/3.0) * 3.14159 * Math.pow(raio,3);

        System.out.printf("VOLUME = %.3f%n", volumeEsfera);

        input.close();
    }
}
