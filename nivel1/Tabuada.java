package beecrowd.problemas.nivel1;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int cc=1; cc<=10; cc++) {
            int tabuada = cc*n;
            System.out.println(cc + " x " + n + " = " + tabuada);
        }
        input.close();
    }
}
