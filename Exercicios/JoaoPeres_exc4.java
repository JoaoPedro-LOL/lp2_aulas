import java.util.Scanner;

public class JoaoPeres_exc4 {

    public static Scanner TECLADO = new Scanner(System.in);

    public static int lerInt() {
        return TECLADO.nextInt();
    }

    public static void lerMatrizInt(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = lerInt();
            }
        }
    }

    public static int somarLinhaColunaMatrizInt(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == 2 || j == 4) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        int[][] matriz = new int[7][6];
        int soma;
        lerMatrizInt(matriz);
        soma = somarLinhaColunaMatrizInt(matriz);
        System.out.printf("A soma da linha 3 e da coluna 5 da matriz é: %d\n", soma);
    }
}