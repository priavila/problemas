package beecrowd.problemas;

import java.util.Locale;
import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int idadeEmDias = input.nextInt();

        int qtdAno = idadeEmDias / 365;
        idadeEmDias = idadeEmDias % 365;

        int qtdMes = idadeEmDias / 30;
        idadeEmDias = idadeEmDias % 30;

        int qtdDias = idadeEmDias;

        System.out.println(qtdAno + " ano(s)");
        System.out.println(qtdMes + " mes(es)");
        System.out.println(qtdDias + " dia(s)");

        input.close();
    }
}
