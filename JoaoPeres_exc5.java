import java.util.Scanner;

public class JoaoPeres_exc5 {

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

public static int verificarMaiorDiagonalMatrizInt(int[][] matriz) {
int maior = matriz[0][0];
for (int i = 0; i < matriz.length; i++) {
for (int j = 0; j < matriz[0].length; j++) {
if(i == j) {
if(matriz[i][j] > maior) {
maior = matriz[i][j];
}
}
}
}
return maior;
}

public static void main(String[] args) {
int[][] matriz = new int[6][6];
int maior;

lerMatrizInt(matriz);
maior = verificarMaiorDiagonalMatrizInt(matriz);

System.out.printf("O maior número da diagonal pricipal da matriz é: %d\n", maior);
}
}