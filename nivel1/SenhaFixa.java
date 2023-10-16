package beecrowd.problemas.nivel1;

import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int senha;
        do {
            senha = input.nextInt();
            if (senha == 2002) {
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Invalida");
            }
        } while (senha != 2002);

        input.close();
    }
}

