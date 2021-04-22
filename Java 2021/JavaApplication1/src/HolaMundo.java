
import java.util.Scanner;


/**
 *
 * @author David Morales
 */
public class HolaMundo {

    public static void main(String[] args) {
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        // variable var
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Cadena Var";
        System.out.println(miVariableCadena2);
        ///////////////***********CONCATENACION*********

        var usuario = "David";
        var titulo = "Ingeniero";
        var union = usuario + " " + titulo;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i+j);/// suma de numeros 
        //System.out.println();
        
        ///*******************ESCANER****************
        
        /*System.out.println("Escribe tu Nombre:");
        Scanner consola  = new Scanner(System.in);
        var Usuario = consola.nextLine();
        System.out.println("Usuario = " + Usuario);
        System.out.println("Escribe el Titulo:");
        var Titulo = consola.nextLine();
        System.out.println(Titulo + " " + Usuario );
        */
       //******************TIPOS PRIMITIVOS ENTEROS: BYTE, SHORT, INT, LONG
       
        byte numeroByte = (byte)129;
        System.out.println("Valor byte:"+ numeroByte);
        System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor Maximo byte;"+ Byte.MAX_VALUE);
        
        
        short numeroShort = (short)32768;
        System.out.println("Valor Short:"+ numeroShort);
        System.out.println("Valor minimo Short:" + Short.MIN_VALUE);
        System.out.println("Valor Maximo Short;"+ Short.MAX_VALUE);

    }

}
