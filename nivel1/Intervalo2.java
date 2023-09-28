package beecrowd.problemas.nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Intervalo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int valorN = input.nextInt();
        int ccIn=0, ccOut=0;
        for(int c=0; c<valorN; c++) {
            int valorX = input.nextInt();
            if (valorX>=10 && valorX<=20) {
                ccIn++;
            } else {
                ccOut++;
            }
        }
        input.close();
        System.out.println(ccIn + " in");
        System.out.println(ccOut + " out");
    }
}

