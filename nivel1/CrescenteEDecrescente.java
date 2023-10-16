package beecrowd.problemas.nivel1;

import java.util.Scanner;

public class CrescenteEDecrescente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        do {
             x = input.nextInt();
             y = input.nextInt();

             if (x > y) {
                 System.out.println("Decrescente");
             } else if (x < y) {
                 System.out.println("Crescente");
             }
        } while (x != y);

        input.close();
    }
}
