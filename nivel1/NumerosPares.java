package beecrowd.problemas.nivel1;

public class NumerosPares {
    public static void main(String[] args) {

        int contador = 1;

        while(contador <= 100) {
            contador++;
            if(contador % 2 != 0) {
                continue;
            }
            System.out.println(contador);
        }
    }
}
