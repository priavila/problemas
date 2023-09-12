package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        String nomeVendedor = input.nextLine();
        double salarioFixo = input.nextDouble();
        double totalVendas = input.nextDouble();;
        double totalReceber = (0.15 * totalVendas) + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f%n", totalReceber);
    }
}
