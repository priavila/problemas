package beecrowd.problemas;

import java.util.Locale;
import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int tempoGasto = input.nextInt();
        int velocidadeMedia = input.nextInt();
        double distanciaPercorrida = velocidadeMedia * tempoGasto;
        int litrosCarro = 12;
        double qtdLitrosCombustivel = distanciaPercorrida / litrosCarro;

        System.out.printf("%.3f%n", qtdLitrosCombustivel);

        input.close();
    }
}
