import java.util.Random;


class Dado {
    public int arremesso(){
        Random gerador = new Random();
        return gerador.nextInt(6)+1;
    }
}

class DadoStatic {
    public static int arremesso(){
        Random gerador = new Random();
        return gerador.nextInt(6)+1;
    }
}


public class Exercicio08 {

   
    public static void main (String args[]){
        
        Dado dado = new Dado();
        System.out.println("Número sorteado:" + dado.arremesso()); 
        
        System.out.println("Número sorteado:" + DadoStatic.arremesso()); 
       
    }

   
}