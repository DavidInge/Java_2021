package domain;

/**
 *
 * @author David Morales
 */
public class Persona {
    
    private final int idPersona;
    private static int contadorPersona;
    
    static
    {
        System.out.println("ejecucion de bloque estatico");
        ++Persona.contadorPersona;
    }
    
    
    {
        System.out.println("ejcucion de bloque no estatico ");
        this.idPersona=Persona.contadorPersona++;
    }

    public Persona() {
        System.out.println("Ejecucion de constructor");
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }

    
        
    public int getIdPersona() {
        return idPersona;
    }
    
}
