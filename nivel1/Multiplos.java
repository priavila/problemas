package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int valorA = input.nextInt();
        int valorB = input.nextInt();

        if(valorA % valorB == 0 || valorB % valorA == 0) {
            System.out.println("Sao Multiplos");
        }else {
            System.out.println("Nao sao Multiplos");
        }

        input.close();
    }
}
