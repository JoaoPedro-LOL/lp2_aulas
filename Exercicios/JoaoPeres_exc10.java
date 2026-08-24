import java.util.Scanner;

public class JoaoPeres_exc10 {

    final static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        return TECLADO.nextInt();
    }

    public static void lermatrizInt(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = lerNumeroInteiro();
            }
        }
    }

    public static int imprimirMatriz(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++) {
                matriz[i][j] = lerNumeroInteiro();
                if ((i + 1) % 2 == 0) {
                    soma += matriz[i][j];
                }
            }
        return soma;
    }

    public static void main(String[] args) {

        int[][] matriz = new int[9][9];
        int soma = imprimirMatriz(matriz);

        System.out.printf("Soma dos elementos = %d\n", soma);
    }
}
