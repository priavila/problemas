package beecrowd.problemas;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int X = input.nextInt();
        double Y = input.nextDouble();
        double consumoMedio = X / Y;

        System.out.printf("%.3f km/l%n", consumoMedio);

        input.close();
    }
}
