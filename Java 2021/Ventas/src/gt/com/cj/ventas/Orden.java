package gt.com.cj.ventas;

/**
 *
 * @author David Morales
 */
public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int Max_Productos = 10;

    public Orden() {
        //incrementar automaticamente id Orden
        this.idOrden = ++Orden.contadorOrdenes;
        //inicializar el arreglo de productos 
        this.productos = new Producto[Orden.Max_Productos];

    }
    //creamos un metodo para agregar productos

    public void agregarProducto(Producto producto) {     //validamos que no se pase del maximo de productos 
        if (this.contadorProductos < Orden.Max_Productos) {

            productos[contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado la cantidad maxima de productos: " + Orden.Max_Productos);
        }
    }
    public double calcularTotal()
    {
     double total=0;
        for (int i = 0; i < this.contadorProductos; i++) {
            //Producto producto = this.productos[i];
            total+= this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("idOrden: "+this.idOrden);
        double totalOrden=this.calcularTotal();
        System.out.println("Total de la Orden : $" +totalOrden );
        System.out.println("Productos de la Orden ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
}
