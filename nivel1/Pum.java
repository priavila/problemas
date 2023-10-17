package beecrowd.problemas.nivel1;

import java.util.Scanner;

public class Pum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s;
        int n = input.nextInt();
        s = n * 4;
        for(int i = 1; i <= s; i++) {
            if (i % 4 == 0) {
                System.out.println("PUM");
            } else {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}
