package beecrowd.problemas.nivel1;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int cc = 0; cc < n; cc++) {
            int valor = input.nextInt();
            if(valor%2==0 && valor>0) {
                System.out.println("EVEN POSITIVE");
            }
            if(valor%2==0 && valor<0) {
                System.out.println("EVEN NEGATIVE");
            }
            if(valor%2!=0 && valor>0) {
                System.out.println("ODD POSITIVE");
            }
            if(valor%2!=0 && valor<0) {
                System.out.println("ODD NEGATIVE");
            }
            if(valor==0) {
                System.out.println("NULL");
            }
        }
        input.close();
    }
}



