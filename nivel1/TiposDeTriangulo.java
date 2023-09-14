package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class TiposDeTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        double ladoMaior, A2, BC;

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        if(B > A){ // 5 7 2
            ladoMaior = A;
            A = B;
            B = ladoMaior;

        }if(C > A){
            ladoMaior = A;
            A = C;
            C = ladoMaior;
        }

        A2 = Math.pow(A,2);
        BC = Math.pow(B,2) + Math.pow(C,2);

        if(A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");
        }else
            if(A2 > BC){
                System.out.println("TRIANGULO OBTUSANGULO");
            }else if(A2 < BC){
                System.out.println("TRIANGULO ACUTANGULO");
            }else{
                System.out.println("TRIANGULO RETANGULO");

            }if(A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }else if(A == B || A == C || B == C){
                System.out.println("TRIANGULO ISOSCELES");
             }
        input.close();
        }
    }
