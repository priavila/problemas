package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int distanciaPercorrida = input.nextInt();
        int minutos = 2;
        int km = 1;

        int tempoDistancia = minutos * distanciaPercorrida / km;

        System.out.println(tempoDistancia + " minutos");

       input.close();
    }
}
