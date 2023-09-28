package beecrowd.problemas.nivel1;

import java.util.Scanner;

public class QuadradoDePares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int quadrado;
        for(int cc=1; cc<=n; cc++) {
            if(cc%2==0){
                quadrado = cc*cc;
                System.out.println(cc + "^" + "2" + " = " + quadrado);
            }
        }
        input.close();
    }
}
