package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        String palavra1 = input.next();
        String palavra2 = input.next();
        String palavra3 = input.next();

        if (palavra1.equals("vertebrado") && palavra2.equals("ave") && palavra3.equals("carnivoro")) {
            System.out.println("aguia");
        } else
            if ((palavra1.equals("vertebrado") && palavra2.equals("ave") && palavra3.equals("onivoro"))) {
                System.out.println("pomba");
        } else {
            if (palavra1.equals("vertebrado") && palavra2.equals("mamifero") && palavra3.equals("onivoro")) {
                System.out.println("homem");
        } else
            if ((palavra1.equals("vertebrado") && palavra2.equals("mamifero") && palavra3.equals("herbivoro"))) {
                System.out.println("vaca");
        } else
            if (palavra1.equals("invertebrado") && palavra2.equals("inseto") && palavra3.equals("hematofago")) {
                System.out.println("pulga");
        } else
            if (palavra1.equals("invertebrado") && palavra2.equals("inseto") && palavra3.equals("herbivoro")){
                System.out.println("lagarta");
        } else
            if (palavra1.equals("invertebrado") && palavra2.equals("anelideo") && palavra3.equals("hematofago")) {
                System.out.println("sanguessuga");
        } else
            if (palavra1.equals("invertebrado") && palavra2.equals("anelideo") && palavra3.equals("onivoro")) {
                System.out.println("minhoca");
            }

            input.close();
        }
    }
}