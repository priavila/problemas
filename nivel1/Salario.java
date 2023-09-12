package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int numero = input.nextInt();
        int horasTrabalhadas = input.nextInt();
        double valorHora = input.nextDouble();
        double salario = valorHora * horasTrabalhadas;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
