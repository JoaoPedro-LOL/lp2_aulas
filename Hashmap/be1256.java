package Hashmap;

import java.util.ArrayList;
import java.util.Scanner;

public class be1256 {
    public static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        int valor;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int N = lerNumeroInteiro();
        int m;
        int c;

        for (int t = 0; t < N; t++) {
            if (t > 0){
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

            for (int p = 0; p < m; p++) {
                System.out.print(p + " -> ");
                for (int valor : tabela[p]) {
                    System.out.print(valor + " -> ");
                }
                System.out.println("\\");
            }
        }
    }
}
