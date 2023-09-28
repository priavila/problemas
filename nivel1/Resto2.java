package beecrowd.problemas.nivel1;

import java.util.Scanner;

public class Resto2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
       for(int c=1; c<=10000; c++){
           if(c%n==2){
               System.out.println(c);
           }
       }
        input.close();
    }
}
