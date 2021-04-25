package com.gt.mundopc;

/**
 *
 * @author David Morales
 */
public class Orden {
    
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int Max_Computadoras=5;
    
    public Orden()
    {
    this.idOrden=++Orden.contadorOrdenes;
    this.computadoras=new Computadora[Max_Computadoras];
    }
    
    public void agregarComputadora(Computadora computadora)
    {
        if (this.contadorComputadoras<Orden.Max_Computadoras) {
            computadoras[contadorComputadoras++]=computadora;
        }else
        {
            System.out.println("Se ha superado la cantidad maxima de productos"+Orden.Max_Computadoras);
        }
    }
    
    public void mostrarOrden()
    {
        System.out.println("idOrden: "+ this.idOrden);
        System.out.println("Productos de la orden");
        for (int i = 0; i <this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
            
        }
        System.out.println("************************FIN DE LA ORDEN "+this.idOrden+"**************************");
    }
}
