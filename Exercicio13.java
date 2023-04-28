import java.util.Scanner;

public class Exercicio13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        if (frase.contains("-help") || frase.contains("-h")) {
            System.out.println("A frase contém as palavras -help ou -h.");
        } else {
            System.out.println("A frase não contém as palavras -help ou -h.");
        }

    }
}
