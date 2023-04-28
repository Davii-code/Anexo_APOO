import java.util.Scanner;


public class Exercicio06 {
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.print("Digite uma string:");
        String texto = teclado.nextLine();


        if(URL(texto)){
            System.out.println("Inicia");
        } else {
            System.out.println("Nao inicia");
        }

       
    }

    public static boolean URL(String x){
       boolean comeca_http = x.startsWith("http:");
       boolean comeca_ftp = x.startsWith("ftp:");

       return comeca_ftp || comeca_http; 
    }
}