package operaciones;
/**
 *
 * @author David Morales
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
       Aritmetica aritmetica1 = new Aritmetica();
       aritmetica1.a=3;
       aritmetica1.b=2;
       
       aritmetica1.sumar();
       
       int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado con retorno = " + resultado);
       
       resultado= aritmetica1.sumarConArgumento(5, 8);
        System.out.println("Resultado con Argumento  = " + resultado);
    }
    
}
