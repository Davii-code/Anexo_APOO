import java.util.Scanner;


public class Exercicio04 {
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.print("Digite uma string:");
        String texto = teclado.nextLine();

        String nova_string = texto.replaceAll("[aeiouAEIOU]", "?");

        System.out.println(nova_string);

       
    }
}
