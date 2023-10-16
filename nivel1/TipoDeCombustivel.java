package beecrowd.problemas.nivel1;

import java.util.Scanner;

public class TipoDeCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int clienteAlcool = 0, clienteGasolina = 0, clienteDiesel = 0;
        int codigoNovo = 0;
        while (codigoNovo != 4) {
            int codigo = input.nextInt();
            if (codigo >= 1 && codigo <= 3) {
                if (codigo == 1) {
                    clienteAlcool++;
                } else if (codigo == 2) {
                    clienteGasolina++;
                } else {
                    clienteDiesel++;
                }
                codigoNovo = codigo;
            } else if (codigo >= 4) {
                codigoNovo = codigo;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + clienteAlcool);
        System.out.println("Gasolina: " + clienteGasolina);
        System.out.println("Diesel: " + clienteDiesel);


        input.close();
    }
}
