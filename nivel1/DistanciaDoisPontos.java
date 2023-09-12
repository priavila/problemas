package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class DistanciaDoisPontos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distancia = (Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2)));

        System.out.printf("%.4f%n", distancia);

        input.close();
    }
}
