
import java.util.Scanner;

public class JoaoPeres_exc8 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static void main(String[] args) {

        int[][] matrizM = new int[6][6];
        int[] matrizV = new int[36];
        System.out.print("Digite o valor de A: ");
        int A = lerNumeroInteiro();
        int pos = 0;

        System.out.println("Digite os valores da matriz M 6x6:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrizM[i][j] = lerNumeroInteiro();
                matrizV[pos++] = matrizM[i][j] * A;
            }
        }

        System.out.println("Vetor V (36 elementos):");
        for (int i = 0; i < 36; i++) {
            System.out.print(matrizV[i] + " ");
        }
    }


}
