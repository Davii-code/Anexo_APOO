import java.util.Arrays;
import java.util.Random;

public class Exercicio10{
    public static void main(String[] args) {
        int[] numerosSorteados = new int[50];
        Random random = new Random();

        for (int i = 0; i < numerosSorteados.length; i++) {
            int numeroSorteado;
            do {
                numeroSorteado = random.nextInt(100);
                // Verifica se o numero ja foi sorteado
            } while (Arrays.binarySearch(numerosSorteados, numeroSorteado) >= 0);
            numerosSorteados[i] = numeroSorteado;
        }
        // Ordena e imprime com virgulas e colchetes
        Arrays.sort(numerosSorteados);
        System.out.println(Arrays.toString(numerosSorteados));
    }
}
