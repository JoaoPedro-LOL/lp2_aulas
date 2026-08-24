import java.util.Scanner;

public class JoaoPeres_exc1 {

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

    public static int somaDeMatriz(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        lermatrizInt(matriz);
        int soma = somaDeMatriz(matriz);

        System.out.printf("A soma da matriz %d\n", soma);

    }
}
