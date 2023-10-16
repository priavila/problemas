package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double nota, notaValida = 0, media = 0, contagemNota = 0;

        while(contagemNota != 2) {
            nota = input.nextDouble();
            if (nota >= 0 && nota <= 10) {
                notaValida += nota;
                contagemNota++;
            } else {
                System.out.println("nota invalida");
            }
        }
        media = notaValida / 2;
        System.out.printf("media = %.2f\n", media);

        input.close();
    }
}