
import java.util.Scanner;

public class JoaoPeres_exc9 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static void main(String[] args) {

        int[][] A = new int[10][10];
        int temp;

        System.out.println("Digite os valores da matriz A (10x10):");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                A[i][j] = lerNumeroInteiro();
            }
        }

            //linha 2 com linha 8
        for (int j = 0; j < 10; j++) {
            temp = A[1][j];
            A[1][j] = A[7][j];
            A[7][j] = temp;
        }

            //coluna 4 com coluna 10
        for (int i = 0; i < 10; i++) {
            temp = A[i][3];
            A[i][3] = A[i][9];
            A[i][9] = temp;
        }

            //diagonal principal com secundária
        for (int i = 0; i < 10; i++) {
            temp = A[i][i];
            A[i][i] = A[i][9 - i];
            A[i][9 - i] = temp;
        }

            //linha 5 com coluna 10
        for (int i = 0; i < 10; i++) {
            temp = A[4][i];
            A[4][i] = A[i][9];
            A[i][9] = temp;
        }

        System.out.println("\nMatriz A atualizada:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }


}
