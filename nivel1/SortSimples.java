package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class SortSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int valor1 = input.nextInt();
        int valor2 = input.nextInt();
        int valor3 = input.nextInt();

        input.close();

        if(valor1 < valor2 && valor2 < valor3) {
            System.out.println(valor1);
            System.out.println(valor2);
            System.out.println(valor3);
        }else if(valor1 < valor3 && valor3 < valor2) {
            System.out.println(valor1);
            System.out.println(valor3);
            System.out.println(valor2);
        }else if(valor2 < valor1 && valor1 < valor3) {
            System.out.println(valor2);
            System.out.println(valor1);
            System.out.println(valor3);
        }else if(valor2 < valor3 && valor3 < valor1) {
            System.out.println(valor2);
            System.out.println(valor3);
            System.out.println(valor1);
        }else if(valor3 < valor2 && valor2 < valor1) {
            System.out.println(valor3);
            System.out.println(valor2);
            System.out.println(valor1);
        }else {
            System.out.println(valor3);
            System.out.println(valor1);
            System.out.println(valor2);
        }

        System.out.println();
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);

    }
}
