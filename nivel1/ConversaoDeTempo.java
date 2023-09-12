package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int tempoSegundos = input.nextInt(); // 140.153

        int qtdHoras = tempoSegundos / 3600; // 38
        tempoSegundos = tempoSegundos % 3600; // 3353

        int qtdMinutos = tempoSegundos / 60; // 3353 / 60 = 55
        tempoSegundos = tempoSegundos % 60; // 53

        int qtdSegundos = tempoSegundos; // 53

        System.out.println(qtdHoras + ":" + qtdMinutos + ":" + qtdSegundos); // 38:55:53



    }

}