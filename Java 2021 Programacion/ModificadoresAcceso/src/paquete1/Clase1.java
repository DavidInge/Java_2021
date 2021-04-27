package paquete1;

/**
 *
 * @author David Morales
 */
public class Clase1 {
    /////*****************ATRIBUTOS PROTECTED *********
    //ESTOS SOLO SE PUEDEN ACCEDER DESDE UNA SUBCLASE
    
    protected String atributoProtected="Valor atributo protected";

    protected Clase1() {
        System.out.println("Constructor protected ");
    }
    protected void metodoProtected()
    {
        System.out.println("Metodo Protected");
    }
    
    
    
    /******************ATRIBUTOS PUBLICOS*************************
    /*public String atributoPublico="Valor atributo publico";

    public Clase1() {
        System.out.println("Constructor publico ");
    }
    public void metodoPublico()
    {
        System.out.println("Metodo Publico");
    }*/
}
