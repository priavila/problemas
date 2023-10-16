package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int quantiaCobaia, totalCobaias = 0, totalCoelho = 0, totalRato = 0, totalSapo = 0;
        double porcentagemCoelho = 0, porcentagemRato = 0, porcentagemSapo = 0;

        int numero = input.nextInt();
        for(int cc=1; cc<=numero; cc++) {
            quantiaCobaia = input.nextInt();
            String tipo = input.next();
            totalCobaias += quantiaCobaia;

            switch (tipo) {
                case "C" -> totalCoelho += quantiaCobaia;
                case "R" -> totalRato += quantiaCobaia;
                case "S" -> totalSapo += quantiaCobaia;
            }

            porcentagemCoelho = (double) (totalCoelho * 100) / totalCobaias;
            porcentagemRato = (double) (totalRato * 100) / totalCobaias;
            porcentagemSapo = (double) (totalSapo * 100) / totalCobaias;
        }

        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelho);
        System.out.println("Total de ratos: " + totalRato);
        System.out.println("Total de sapos: " + totalSapo);
        System.out.printf("Percentual de coelhos: %.2f", porcentagemCoelho);
        System.out.print(" %\n");
        System.out.printf("Percentual de ratos: %.2f", porcentagemRato);
        System.out.print(" %\n");
        System.out.printf("Percentual de sapos: %.2f", porcentagemSapo);
        System.out.print(" %\n");

        input.close();
    }
}
