package beecrowd.problemas;

/* se B>C && D>A && C+D>A+B && C,D==+ && A == par
A == PAR
se A%2 == 0
*/

import java.util.Locale;
import java.util.Scanner;

public class TesteDeSelecao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        String resultado = (B>C && D>A && C+D>A+B && C>0 && D>0 && A%2==0)?"Valores aceitos":"Valores nao aceitos";

        System.out.println(resultado);
    }

}


