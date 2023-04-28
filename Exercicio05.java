import java.util.Scanner;


public class Exercicio05 {
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.print("Digite uma string:");
        String texto = teclado.nextLine();

        String nova_string = texto.replaceAll("[^0-9]", "");

        System.out.println(nova_string);

       
    }
}