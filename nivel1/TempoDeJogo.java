package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int horaInicial, horaFinal, duracaoJogo;

        horaInicial = input.nextInt();
        horaFinal = input.nextInt();

        if (horaInicial >= horaFinal) {
            duracaoJogo = 24 - horaInicial + horaFinal;
            System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");
        } else {
            duracaoJogo = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");

            input.close();
        }
    }
}
