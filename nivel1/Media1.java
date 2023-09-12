package beecrowd.problemas;

import java.util.Scanner;
import java.util.Locale;

public class Media1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        double nota1 = ler.nextDouble();
        double nota2 = ler.nextDouble();
        double peso1 = 3.5;
        double peso2 = 7.5;
        double somaPesos = 11;
        double media = ((3.5*nota1) + (7.5*nota2)) / (somaPesos);

        System.out.printf("MEDIA = %.5f%n", media);
    }
}
