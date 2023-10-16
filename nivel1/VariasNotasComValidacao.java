package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class VariasNotasComValidacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int calcularNovo = 1, contador;
        double nota, somaNota, media;
        while (calcularNovo != 2) {
            contador = 0;
            somaNota = 0;
            while (contador != 2) {
                nota = input.nextDouble();
                if (nota >= 0 && nota <=10) {
                    somaNota += nota;
                    contador++;
                } else {
                    System.out.println("nota invalida");
                }
            }
            media = somaNota / 2;
            System.out.printf("media = %.2f\n", media);

            System.out.println("novo calculo (1-sim 2-nao)");
            calcularNovo = input.nextInt();
            while (calcularNovo < 1 || calcularNovo > 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                calcularNovo = input.nextInt();
                if (calcularNovo == 1) {
                    calcularNovo = calcularNovo;
                }
            }
        }

        input.close();
    }
}
