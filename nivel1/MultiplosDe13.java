package beecrowd.problemas.nivel1;

import java.util.Scanner;

public class MultiplosDe13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        int x = input.nextInt();
        int y = input.nextInt();

        if (x < y) {
            for (int i = x; i <= y; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }
            }
        } else {
            for (int i = y; i <= x; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }
            }
        }
        System.out.println(soma);

        input.close();
    }
}
