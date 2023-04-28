 import java.lang.Math;
 
 class Triangulo {
    float base = 8;
    float lado2 = 8;
    float lado3= 8;

    public float calculaPerimetro() {
        return  base + lado2 + lado3;
    }
    public float calculaArea() {
        
        float altura =(float) Math.sqrt( Math.pow(lado2, 2)+Math.pow(base/2, 2));
        return (altura*base) /2;
    }
    public String tipo() {
        if (base == lado2 && lado2 == lado3) {
            return "Equilátero"; 
        } else if (base == lado2 || lado2 == lado3 || base== lado3) {
            return "Isósceles"; 
        } else {
            return "Escaleno";
        }
    }
}



public class Exercicio09 {
    public static void main (String args[]){

       Triangulo perimetrTriangulo = new Triangulo();
       System.out.println("Perimetro:" + perimetrTriangulo.calculaPerimetro());
       Triangulo are = new Triangulo();
       System.out.println("area:" + are.calculaArea());
       Triangulo tipTriangulo = new Triangulo();
       System.out.println("Tipo:" + tipTriangulo.tipo());
    }
    
}
