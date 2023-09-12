package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class NotasEMoedas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        double dinheiro = input.nextDouble();

        System.out.println("NOTAS:");
        System.out.println((int) (dinheiro / 100) + " nota(s) de R$ 100.00");
        dinheiro = dinheiro % 100.0;

        System.out.println((int) (dinheiro / 50) + " nota(s) de R$ 50.00");
        dinheiro = dinheiro % 50.0;

        System.out.println((int) (dinheiro / 20) + " nota(s) de R$ 20.00");
        dinheiro = dinheiro % 20.0;

        System.out.println((int) (dinheiro / 10) + " nota(s) de R$ 10.00");
        dinheiro = dinheiro % 10.0;

        System.out.println((int) (dinheiro / 5) + " nota(s) de R$ 5.00");
        dinheiro = dinheiro % 5.0;

        System.out.println((int) (dinheiro / 2) + " nota(s) de R$ 2.00");
        dinheiro = dinheiro % 2.0;

        dinheiro = dinheiro * 100;

        System.out.println("MOEDAS:");
        System.out.println((int) (dinheiro / 100) + " moeda(s) de R$ 1.00");
        dinheiro = dinheiro % 100.0;

        System.out.println((int) (dinheiro / 50) + " moeda(s) de R$ 0.50");
        dinheiro = dinheiro % 50.0;

        System.out.println((int) (dinheiro / 25) + " moeda(s) de R$ 0.25");
        dinheiro = dinheiro % 25.0;

        System.out.println((int) (dinheiro / 10) + " moeda(s) de R$ 0.10");
        dinheiro = dinheiro % 10.0;

        System.out.println((int) (dinheiro / 5) + " moeda(s) de R$ 0.05");
        dinheiro = dinheiro % 5.0;

        System.out.println((int) (dinheiro / 1) + " moeda(s) de R$ 0.01");
        dinheiro = dinheiro % 1.0;

        input.close();
    }
}
