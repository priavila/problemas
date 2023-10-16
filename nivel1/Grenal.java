package beecrowd.problemas.nivel1;

import java.util.Scanner;

public class Grenal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int golInter, golGremio, novoGrenal = 1, vitoriaInter = 0, vitoriaGremio = 0,
                empates = 0, totalGrenais = 0;
        String totalVitorias = null, empate = "Nao houve vencedor", vencedorInter = "Inter venceu mais",
                vencedorGremio = "Gremio venceu mais";
        while (novoGrenal != 2) {
            golInter = input.nextInt();
            golGremio = input.nextInt();
            if (golInter > golGremio) {
                vitoriaInter++;
            } else if (golGremio > golInter) {
                vitoriaGremio++;
            } else {
                empates++;
            }
            totalGrenais++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            novoGrenal = input.nextInt();
            if (novoGrenal == 1) {
                novoGrenal = novoGrenal;
            }
        }
        if (vitoriaInter > vitoriaGremio) {
            totalVitorias = vencedorInter;
        } 
        if (vitoriaGremio > vitoriaInter) {
            totalVitorias = vencedorGremio;
        } 
        if (vitoriaInter == vitoriaGremio){
            totalVitorias = empate;
        }

        System.out.println(totalGrenais + " grenais");
        System.out.println("Inter:" + vitoriaInter);
        System.out.println("Gremio:" + vitoriaGremio);
        System.out.println("Empates:" + empates);
        System.out.println(totalVitorias);

        input.close();
    }
}
