import java.util.Scanner;

public class JoaoPeres_exc6 {

    final static Scanner TECLADO = new Scanner(System.in);


    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static void main(String[] args) {

        int[][] matrizA = new int[8][8];
        double[][] matrizB = new double[8][8];
        int maior = 0;
        boolean primeiro = true;

        System.out.println("Digite os valores da matriz 8:");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("A["+ i +"]["+ j +"]: ");
                matrizA[i][j] = lerNumeroInteiro();

                if (i == j) {
                    if (primeiro) {
                        maior = matrizA[i][j];
                        primeiro = false;
                    } else if (matrizA[i][j] > maior) {
                        maior = matrizA[i][j];
                    }
                }
            }
        }

        System.out.println("Maior elemento da diagonal principal = " + maior);


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matrizB[i][j] = (double) matrizA[i][j] / maior;
            }
        }

        System.out.println("Matriz B (A dividida pelo maior da diagonal):");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("%.2f ", matrizB[i][j]);
            }
            System.out.println();
        }
    }

}
