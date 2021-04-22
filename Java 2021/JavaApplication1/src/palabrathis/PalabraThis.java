
package palabrathis;

/**
 *
 * @author David Morales
 */
public class PalabraThis {
    public static void main(String[] args) {
      Persona persona = new Persona ("Juan","Perez");  
        System.out.println("persona = " + persona);
        System.out.println("Persona Nombre: " +persona.nombre);
        System.out.println("Persona Apellido: "+persona.apellido);
    }
}
//creamos otra clase
class Persona
{
 String nombre,apellido;
 Persona(String nombre, String apellido)
 {
   //super (); // se manda a llamar el constructor de la clase padre
   this.nombre= nombre;
   this.apellido=apellido;
   new imprimir().imprimir(this);
   
 }
}

class imprimir
{
 public void imprimir(Persona persona)
 {
     System.out.println("persona desde imprimir " +persona);
     System.out.println("impresion del objeto actual (this)"+this);
 }
}
