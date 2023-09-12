package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int codProduto = input.nextInt();
        int qtdItem = input.nextInt();
        double precoTotal = 0;

        switch (codProduto){
            case 1:
                precoTotal = qtdItem * 4.00;
                break;
            case 2:
                precoTotal = qtdItem * 4.50;
                break;
            case 3:
                precoTotal = qtdItem * 5.00;
                break;
            case 4:
                precoTotal = qtdItem * 2.00;
                break;
            case 5:
                precoTotal = qtdItem * 1.50;
                break;
        }

        System.out.printf("Total: R$ %.2f%n", precoTotal);

    }
}
