import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

       
        boolean[] vetor = new boolean[tamanho];

        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor " + (i+1) + " (true ou false): ");
            vetor[i] = scanner.nextBoolean();
        }

    
        int count = 0;
        for (boolean valor : vetor) {
            if (valor) {
                count++;
            }
        }

        System.out.println("O vetor tem " + count + " elementos iguais a true.");
    }
}
