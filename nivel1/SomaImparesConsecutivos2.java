package beecrowd.problemas.nivel1;

import java.util.Scanner;

public class SomaImparesConsecutivos2 {
    public static void main(String[] args) {
        int soma;
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        for (int cc = 0; cc < valor; cc++) {
            soma = 0;
            int x = input.nextInt();
            int y = input.nextInt();

            if (x < y) {
                for(int i = x+1; i < y; i++) {
                    if (i % 2 != 0) {
                        soma += i;
                    }
                }
            } else {
                for(int c = y+1; c < x; c++) {
                    if(c % 2 != 0) {
                        soma += c;
                    }
                }
            }
            System.out.println(soma);
        }
        input.close();
    }
}




