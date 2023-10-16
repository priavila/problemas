package beecrowd.problemas.nivel1;

import java.util.Scanner;

public class DivisaoXPorY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        double divisao;
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            x = input.nextInt();
            y = input.nextInt();
            if(y == 0) {
                System.out.println("divisao impossivel");
            } else {
                divisao = (double) x / y;
                System.out.printf("%.1f\n", divisao);
            }
        }

        input.close();
    }
}
