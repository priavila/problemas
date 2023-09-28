package beecrowd.problemas.nivel1;

import java.util.Scanner;

public class MaiorEPosicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maior = 0;
        int posicao = 1;
        for(int i = 1; i<=100; i++) {
            int valor = input.nextInt();
            if(i == 1){
                maior = valor;
            } else if(valor > maior) {
                maior = valor;
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
        input.close();
    }
}
