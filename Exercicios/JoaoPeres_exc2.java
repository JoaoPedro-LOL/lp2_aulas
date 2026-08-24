import java.util.Scanner;

public class JoaoPeres_exc2 {

    public static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        int valor;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void lermatrizInt(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = lerNumeroInteiro();
            }
        }
    }

    public static int diagonalDeMatriz(int[][] matriz) {
        int maio = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    maio += matriz[i][j];
                }

            }
        }
        return maio;
    }

    public static void main(String[] args) {
        int[][] matriz = new int[6][6];
        lermatrizInt(matriz);
        int somaDiagonal = diagonalDeMatriz(matriz);
        System.out.printf("A soma da diagonal é %d\n", somaDiagonal);
    }
}
