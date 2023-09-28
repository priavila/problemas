package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class MediasPonderadas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int n = input.nextInt();
        for(int i=0; i<n; i++) {
            double valor1 = input.nextDouble();
            double valor2 = input.nextDouble();
            double valor3 = input.nextDouble();
            double media = ((valor1*2) + (valor2*3) + (valor3*5))/10;
            System.out.printf("%.1f%n", media);
        }
        input.close();
    }
}
