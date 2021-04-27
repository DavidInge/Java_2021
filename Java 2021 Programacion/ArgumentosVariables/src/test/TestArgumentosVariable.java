package test;

/**
 *
 * @author David Morales
 */
public class TestArgumentosVariable {
    public static void main(String[] args) {
        
        imprimirNumeros(1,2,3);
        
        variosParametros("Juan", 1,2);
        
        
    }
    public static void variosParametros(String nombre,int... numeros)
    {
        System.out.println("nombre = " + nombre);
        //se puede imprimir una sola posicion del arreglo o todo de una sola vez
        //System.out.println(numeros[0]);
          imprimirNumeros(numeros);
    }
    public static void imprimirNumeros(int... numeros)
    {
        // se recorre los argumentos variables ya que funcionan como un arreglo el cual puede tener
        // cualquier cantidad de numeros u objetos segun sea el caso 
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: "+numeros[i]);
        }
    }
}
