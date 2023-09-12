package beecrowd.problemas;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

            int codPeca1 = input.nextInt();
            int qtdPecas1 = input.nextInt();
            double valorUndPeca1 = input.nextDouble();
            int codPeca2 = input.nextInt();
            int qtdPecas2 = input.nextInt();
            double valorUndPeca2 = input.nextDouble();

            double valorTotal = qtdPecas1 * valorUndPeca1 + qtdPecas2 * valorUndPeca2;

            System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);


        input.close();
    }

}






