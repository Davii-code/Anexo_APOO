import java.util.Scanner;


public class Exercicio02 {
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.print("Digite uma string:");
        String texto = teclado.nextLine();

        for (int i=0; i < texto.length(); i++){
            System.out.println(texto.charAt(i));
        }
    }
}