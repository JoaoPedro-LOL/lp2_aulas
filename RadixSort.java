import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {

    public final static Scanner TECLADO = new Scanner(System.in);

    // Radix Sort no array
    public static void radixsort(int array[], int n) {
        int m = numMax(array, n);
        for (int expoente = 1; m / expoente > 0; expoente *= 10) {
            contandoSort(array, n, expoente);
        }
    }

    public static int lerValorInteiro() {
        int valor;
        valor = TECLADO.nextInt();
        return valor;
    }

    // Pegar valor maximo
    static int numMax(int array[], int num) {
        int maximo = array[0];
        for (int i = 1; i < num; i++)
            if (array[i] > maximo)
                maximo = array[i];
        return maximo;
    }

    // Contando Sort baseado no digito representado pelo expoente
    static void contandoSort(int array[], int n, int expoente) {
        int saida[] = new int[n];
        int contagem[] = new int[10];

        // Preenche o array inteiro
        Arrays.fill(contagem, 0);

        // Frequência dos dígitos
        for (int i = 0; i < n; i++)
            contagem[(array[i] / expoente) % 10]++;

        // Soma acumulada
        for (int i = 1; i < 10; i++)
            contagem[i] += contagem[i - 1];

        // Posicionamento
        for (int i = n - 1; i >= 0; i--) {
            saida[contagem[(array[i] / expoente) % 10] - 1] = array[i];
            contagem[(array[i] / expoente) % 10]--;
        }

        System.arraycopy(saida, 0, array, 0, n);

        // saida = array de origem (src)
        // 0 (quem vem depois de saida) = posição inicial (srcPos)
        // array = destino (dest)
        // 0 (que vem depois da saida) = Posição inicial no array onde os dados serão
        // inseridos (destPos)
        // n = o numero total de elementos (length)
    }

    public static void main(String[] args) {
        int array[] = { 10, 2, 1, 99, 1, 15, 27, 350 };
        radixsort(array, array.length);
        System.out.println(Arrays.toString(array));
    }
}