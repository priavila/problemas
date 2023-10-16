package beecrowd.problemas.nivel1;

import java.util.Scanner;

public class SequenciaNumerosESoma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M, N, soma;
        String sequencia;
        do {
            M = input.nextInt();
            N = input.nextInt();
            soma = 0;
            sequencia = "";

            if (M <= 0 || N <= 0) {
                break;
            }

            if (M > N) {
                for (int s = N; s <= M; s++) {
                    sequencia += s + " ";
                    soma += s;
                }
            } else {
                for (int c = M; c <= N; c++) {
                    sequencia += c + " ";
                    soma += c;
                }
            }
            System.out.println(sequencia + "Sum=" + soma);
        } while (M > 0 && N > 0) ;

        input.close();
    }
}




