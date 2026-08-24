package Hashmap;

import java.util.ArrayList;
import java.util.Scanner;

public class b1256Vibe {
    public static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static void main(String[] args) {

        int N = lerNumeroInteiro();
        int m;
        int c;

        for (int t = 0; t < N; t++) {
            if (t > 0) {
                System.out.println();
            }   

            m = lerNumeroInteiro();
            c = lerNumeroInteiro();

            ArrayList<Integer>[] tabela = new ArrayList[m];

            for (int i = 0; i < m; i++) {
                tabela[i] = new ArrayList<>();
            }

            for (int v = 0; v < c; v++) {
                int chave = lerNumeroInteiro();
                int valores = chave % m;
                tabela[valores].add(chave);
            }

            StringBuilder sb = new StringBuilder();

            for (int p = 0; p < m; p++) {
                sb.append(p).append(" -> ");
                for (int valor : tabela[p]) {
                    sb.append(valor).append(" -> ");
                }
                sb.append("\\\n");
            }
            System.out.print(sb.toString());
        }
    }
}