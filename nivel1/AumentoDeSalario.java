package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        // Declaracao variaveis
        double salario, novoSalario, percentual, reajuste;

        // Inserir informacoes
        salario = input.nextDouble();

        // Condicionais
        if(salario <= 400.00) {
            percentual = 0.15;
            reajuste = percentual * salario;
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: " + percentual*100 + " %");
        } else if(salario > 400.00 && salario <= 800.00) {
            percentual = 0.12;
            reajuste = percentual * salario;
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: " + percentual*100 + " %");
        } else if(salario > 800.00 && salario <= 1200.00) {
            percentual = 0.10;
            reajuste = percentual * salario;
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: " + percentual*100 + " %");
        } else if(salario > 1200.00 && salario <= 2000.00) {
            percentual = 0.7;
            reajuste = percentual * salario;
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: " + percentual*100 + " %");
        } else {
            percentual = 0.4;
            reajuste = percentual * salario;
            novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: " + percentual*100 + " %");
        }

        input.close();
    }
}
