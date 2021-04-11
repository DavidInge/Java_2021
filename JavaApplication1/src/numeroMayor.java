
import java.util.Scanner;


/**
 *
 * @author David Morales
 */
public class numeroMayor {
    public static void main(String[] args) {
        int a,b,resultado;
        Scanner consola  = new Scanner(System.in);
        System.out.println("Proporciona el numero1: ");
        a=consola.nextInt();
        System.out.println("Proporciona el numero2: ");
        b=consola.nextInt();
        if (a>b) {
            System.out.println("El numero1 es mayor que numero2");
        }else
        {
            System.out.println("El numero2 es mayor que numero1");
        }
    }
    
}
