package dominio;

/**
 *
 * @author David Morales
 */
public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
   // se crea un constructor vacio para reservar su espacio en memoria 
    public Empleado()
    {
     this.idEmpleado=++Empleado.contadorEmpleado;
    }
    //cuando se tiene mas de un cosntructor se utiliza la sobrecarga de constructores 
    
    public Empleado(String nombre, double sueldo) {
        // llama al constructor de la clase padre 
        //super(nombre);
        //se utiliza this() para llamar a un constructor dentro de la misma clase
        this();
        this.nombre=nombre;
        this.sueldo = sueldo;
      }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
