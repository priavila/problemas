package beecrowd.problemas.nivel1;

import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int x, y;
       do {
           x = input.nextInt();
           y = input.nextInt();
           if (x > 0 && y > 0) {
               System.out.println("primeiro");
           } else if (x < 0 && y > 0) {
               System.out.println("segundo");
           } else if (x < 0 && y < 0) {
               System.out.println("terceiro");
           } else if (x > 0 && y < 0) {
               System.out.println("quarto");
           }
       } while (x != 0 && y != 0);

       input.close();
    }
}
