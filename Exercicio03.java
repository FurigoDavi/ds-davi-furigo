import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner mi = new Scanner(System.in);

        float a;
        float b;
        float c;

        System.out.println("Digite o comprimento do lado a: ");
        a = mi.nextFloat();

        System.out.println("Digite o comprimento do lado b: ");
        b = mi.nextFloat();

        System.out.println("Digite o comprimento do lado c: ");
        c = mi.nextFloat();

        mi.close();

        if (a >= b && b > c){
            System.out.println("Ordem descrescente: " + a + "," + b + "," + c);
        }
        else if (c >= b && b > a){
            System.out.println("Ordem descrescente: " + c + "," + b + "," + a);
        }
        else if (b >= a && a > c){
            System.out.println("Ordem decrescente: " + b + "," + a + "," + c);
        }
        else if (b > c && c >= a){
            System.out.println("Ordem decrescente: " + b + "," + c + "," + a);
        }
        else if (c > a && a >= b){
            System.out.println("Ordem descrescente: " + c + "," + a + "," + b);
        }
        else if (a > c && c >= b){
            System.out.println("Ordem decrescente: " + a + "," + c + "," + b);
        }
        else if (a == b && b == c){
            System.out.println("Ordem decrescente: " + a + "," + c + "," + b);
        }

        float d = b + c;
        float e = b * b + c * c;
        
        if (a > d){
            System.out.println("triangulo retangulo");
        }
        else {
            if (a != b && b != c){
            if (a* a == e){
            System.out.println("triangulo retangulo");
        }
        else if (a * a > e){
            System.out.println("triangulo obtusangulo");
        }
        else if (a * a < e){
            System.out.println("triangulo acutangulo");
        }
        if (a == b && b == c){
            System.out.println("triangulo equilatero");
        }
        else if (a == b || a == c || b == c){
            System.out.println("triangulo isosceles");
        } 
        }
    }
}
}
