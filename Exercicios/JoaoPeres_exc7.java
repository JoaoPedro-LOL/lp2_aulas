
import java.util.Scanner;

public class JoaoPeres_exc7 {

    final static Scanner TECLADO = new Scanner(System.in);

        public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static void main(String[] args) {

        int[][] matrizA = new int[4][6];
        int[][] matrizB = new int[6][4];
        int[][] matrizC = new int[4][4];

        System.out.println("Digite os valores da matriz A 4x6:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 6; j++)
                matrizA[i][j] = lerNumeroInteiro();

        System.out.println("Digite os valores da matriz B 6x4:");
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 4; j++)
                matrizB[i][j] = lerNumeroInteiro();


        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                for (int k = 0; k < 6; k++)
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];

        System.out.println("Digite os valores da Matriz C (produto):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(matrizC[i][j] + " ");
            System.out.println();
        }
    }


}
