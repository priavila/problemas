package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        double p1 = 2;
        double p2 = 3;
        double p3 = 5;

        double A = ler.nextDouble();
        double B = ler.nextDouble();
        double C = ler.nextDouble();

        double media = ((A*p1) + (B*p2) + (C*p3)) / (p1 + p2 + p3);

        System.out.printf("MEDIA = %.1f%n", media);

        ler.close();
    }
}
