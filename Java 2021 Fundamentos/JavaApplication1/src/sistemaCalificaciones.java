
import java.util.Scanner;

/**
 *
 * @author David Morales
 */
public class sistemaCalificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        int nota = Integer.parseInt(scanner.nextLine());
        if (nota >= 9 && nota <= 10) {
            System.out.println("A");
        } else if (nota >= 8 && nota < 9) {
            System.out.println("B");
        } else if (nota >= 7 && nota < 8) {
            System.out.println("C");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("D");
        } else if (nota >= 0 && nota < 6) {
            System.out.println("F");
        } else {
            System.out.println("Valor desconocido");
        }
    }
}
