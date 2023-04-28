import java.util.Scanner;

public class Exercicio01 {
    public static void main (String args[]) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.print("Digite uma string:");
        String texto = teclado.nextLine();

        if (texto.length() >= 10){
            System.out.println (texto+ " foi aceita!");
        } else {
            System.out.println (texto+ " não foi aceita!");
        }
       
    }
}