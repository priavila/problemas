package beecrowd.problemas;

import java.util.Locale;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
            double A = input.nextDouble();
            double B = input.nextDouble();
            double C = input.nextDouble();

    // a) a área do triângulo retângulo que tem A por base e C por altura.
        double areaTriangulo = C*A/2;
    //   b) a área do círculo de raio C. (pi = 3.14159)
        double areaCirculo = 3.14159 * Math.pow(C,2);
    //   c) a área do trapézio que tem A e B por bases e C por altura.
        double areaTrapezio = (A+B)*C/2;
    //   d) a área do quadrado que tem lado B.
        double areaQuadrado = Math.pow(B,2);
    //   e) a área do retângulo que tem lados A e B.
        double areaRetangulo = A*B;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

        input.close();
    }
}
