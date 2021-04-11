
import java.util.Scanner;

/**
 *
 * @author David Morales
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner consola  = new Scanner(System.in);
        System.out.println("Proporciona el Nombre del tu Libro: ");
        var nombre = consola.nextLine();
        System.out.println("Proporciona el Id de tu Libro: ");
        var id = consola.nextLine();
        System.out.println("Proporciona el Precio de tu Libro:");
        var precio= consola.nextLine();
        System.out.println("Proporciona el Envio del libro Gratuito: \n"
                + "1.Si \n" 
                + "2.No");
        var envio=Integer.parseInt(consola.nextLine());
        
      
    
        System.out.println("**************INFORMACIÓN DEL LIBRO***************");
        System.out.println(nombre+" "+"#"+id);
        System.out.println("Precio: "+"Q."+precio);
        if (envio==1) {
            System.out.println("Envio Gratuito: "+"true");
        }if (envio==2)
        {
            System.out.println("Envio Gratuito: "+"false");
        }if((envio>=3) || (envio<=0))
        {
            System.out.println("digite solo un numero entre 1 y 2 \n"
                    + "NO SE DETERMINO SI EL ENVIO ES GRATIS O NO ");
        }
        
        ////////////////////SOLUCION    //////////////////////
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre1 = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double precio2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
 
        System.out.println(nombre1 + " #" + id1);
        System.out.println("Precio: $" + precio2);
        System.out.println("Envio Gratuito: " + envioGratuito);
    
    }
    
}


