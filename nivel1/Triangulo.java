package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        if(A < B + C && B < A + C && C < A + B) {
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        }else {
            double area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f%n", area);
        }

        input.close();
    }
}
