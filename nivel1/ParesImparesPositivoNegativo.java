package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class ParesImparesPositivoNegativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int valorLido;
        int contador = 0;
        int contadorPar = 0;
        int contadorImpar = 0;
        int contadorPositivo = 0;
        int contadorNegativo = 0;

        while(contador < 5) {
            valorLido = input.nextInt();
            contador++;

            if(valorLido % 2 == 0){
                contadorPar++;
            } else {
                contadorImpar++;
            }

            if (valorLido > 0 ) {
                contadorPositivo++;
            } else if (valorLido < 0) {
                contadorNegativo++;
            }
        }

        System.out.printf("%d valor(es) par(es)%n", contadorPar);
        System.out.printf("%d valor(es) impar(es)%n", contadorImpar);
        System.out.printf("%d valor(es) positivo(s)%n", contadorPositivo);
        System.out.printf("%d valor(es) negativo(s)%n", contadorNegativo);

        input.close();
    }
}
