import java.util.Scanner;


public class Exercicio03 {
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.print("Digite uma string:");
        String texto = teclado.nextLine();

        System.out.print("N:");
        int n = teclado.nextInt();

        if (n <= texto.length()){   
                String aux = texto.substring(0, n);         
                System.out.println(aux);
        } else {
            System.out.println("N invalido!");
        }

       
    }
}