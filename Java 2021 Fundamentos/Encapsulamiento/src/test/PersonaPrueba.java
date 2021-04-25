package test;
import dominio.Persona;
/**
 *
 * @author David Morales
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona ("Juan",5000.00,false);
        System.out.println("persona1: "+persona1);
        persona1.setNombre("Juan Carlos");
//        System.out.println("persona1 Nombre: " +persona1.getNombre());
//        System.out.println("persona1 Sueldo: " +persona1.getSueldo());
//        System.out.println("persona1 Eliminado: "+persona1.isEliminado());
        System.out.println("persona1: "+persona1);
    }
    
}
