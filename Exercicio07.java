import java.util.Scanner;


public class Exercicio07 {

    //public static final float  PI = 3.141516f; 
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.print("Digite raio:");
        float r = teclado.nextFloat();
        
        //float area_circulo = PI*r*r;
        double area_circulo = Math.PI*r*r;
       
        System.out.println("Área do círculo é "+ area_circulo);
       
    }

   
}