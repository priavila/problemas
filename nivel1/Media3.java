package beecrowd.problemas;

import java.util.Locale;
import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();

        float media = (float) ((n1*2) + (n2*3) + (n3*4) + (n4*1))/10;
        System.out.printf("Media: %.1f%n", media);

        if(media>=7.0) {
            System.out.println("Aluno aprovado.");
        }else if(media<5.0) {
            System.out.println("Aluno reprovado.");
        }else if(media>=5.0 && media<=6.9) {
            System.out.println("Aluno em exame.");
            double notaExame = input.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", notaExame);

            double mediaFinal = (notaExame+media)/2;

            if(mediaFinal>5.0) {
                System.out.println("Aluno aprovado.");

            } else if(mediaFinal<4.9) {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", mediaFinal);
        }
    }
}
