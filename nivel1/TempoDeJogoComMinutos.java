package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class TempoDeJogoComMinutos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int duracaoTotal;

        int hrInicial = input.nextInt();
        int minInicial = input.nextInt();
        int hrFinal = input.nextInt();
        int minFinal = input.nextInt();

        int hmInicial = (hrInicial * 60) + minInicial;
        int hmFinal = (hrFinal * 60) + minFinal;

        if (hmFinal > hmInicial) {
            duracaoTotal = hmFinal - hmInicial;
            System.out.println("O JOGO DUROU " + duracaoTotal / 60 + " HORA(S) E " + duracaoTotal % 60 + " MINUTO(S)");

        } else if(hmInicial > hmFinal) {
            duracaoTotal = ((24 * 60) - hmInicial) + hmFinal;
            System.out.println("O JOGO DUROU " + duracaoTotal / 60 + " HORA(S) E " + duracaoTotal % 60 + " MINUTO(S)");

        } else {
            duracaoTotal = ((24 * 60) - hmInicial) + hmFinal;
            System.out.println("O JOGO DUROU " + duracaoTotal / 60 + " HORA(S) E " + duracaoTotal % 60 + " MINUTO(S)");
            input.close();
        }
    }
}

