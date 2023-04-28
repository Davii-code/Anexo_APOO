import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        scanner.nextLine(); 
        String[] array = new String[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o elemento " + (i+1) + ": ");
            array[i] = scanner.nextLine();
        }
        int count = 0;
        for (String elemento : array) {
            if (elemento.length() < 10) {
                count++;
            }
        }

        System.out.println("O array tem " + count + " elementos com menos de dez caracteres.");
    }
}
