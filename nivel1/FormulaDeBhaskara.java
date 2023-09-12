package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class FormulaDeBhaskara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        double valorA = input.nextDouble();
        double valorB = input.nextDouble();
        double valorC = input.nextDouble();

        double delta = (Math.pow(valorB,2)) - (4*valorA*valorC);

        if(delta<0 || delta==0 || valorA==0){
            System.out.println("Impossivel calcular");

        }else{
            double r1 = (-valorB + (Math.sqrt(delta)))/(2*valorA);
            double r2 = (-valorB - (Math.sqrt(delta)))/(2*valorA);

            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }
    }
}
