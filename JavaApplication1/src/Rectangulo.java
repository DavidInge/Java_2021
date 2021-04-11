
import java.util.Scanner;

/**
 *
 * @author David Morales
 */
public class Rectangulo {
    public static void main(String[] args) {
        int alto, ancho,area,perimetro;
        Scanner consola  = new Scanner(System.in);
        System.out.println("Proporciona el Alto:");
        alto=consola.nextInt();
        System.out.println("Proporciona el ancho");
        ancho=consola.nextInt();
        
        area= alto*ancho;
        perimetro=(alto+ancho)*2;
        
        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro);
        
        
    }
}
