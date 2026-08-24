import java.util.Scanner;

public class JoaoPeres_exc3 {
    public static Scanner TECLADO = new Scanner(System.in);

    public static int lerNumeroInteiro() {
        int valor;
        valor = TECLADO.nextInt();
        return valor;
    }

    public static void lerMatrizInt(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = lerNumeroInteiro();
            }
        }
    }

    public static int somaDaMatrizEspecifica(int[][] matriz) {
        int maio = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == 4 || j == 2) {
                    maio += matriz[i][j];
                }

            }
        }
        return maio;
    }

    public static void main(String[] args) {
        int[][] matriz = new int[6][6];
        lerMatrizInt(matriz);
        int somaDiagonal = somaDaMatrizEspecifica(matriz);
        System.out.printf("A soma da diagonal secundaria é %d\n", somaDiagonal);
    }
}
