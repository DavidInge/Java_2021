package operaciones;

/**
 *
 * @author David Morales
 */
public class Aritmetica {
    
    /// ATRIBUTOS DE LA CLASE 
    int a;
    int b;
    /// METODO
    
    public void  sumar()
    {
    int resultado = a+b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno()
    {
      return a+b;
    }
    public int sumarConArgumento(int arg1, int arg2)
    {
      /// this puede acceder a los metodos o atributos de la clase           
      this.a= arg1;
      this.b=arg2;
      return this.sumarConRetorno();
    }
            
}
