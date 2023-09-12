package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Maior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
            int A = input.nextInt();
            int B = input.nextInt();
            int C = input.nextInt();
            int maiorAB = (A+B+abs(A-B))/2;

            int maiorResultado = (maiorAB>C)?maiorAB:C;

            System.out.println(maiorResultado + " eh o maior");

        input.close();
    }
}
