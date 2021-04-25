package com.gt.mundopc.test;
import com.gt.mundopc.*;
/**
 *
 * @author David Morales
 */
public class TestLaboratorioFinal {
    public static void main(String[] args) {
        //perifericos para la primera pc
        Raton rt1= new Raton("USB","HP");
        Teclado tc1= new Teclado("wifi","HP");
        Monitor mt1 = new Monitor("HP",16.5);
        Computadora pc1 = new Computadora("HP Envy",mt1,tc1,rt1);
        //perifericos para la segunda pc
        Raton rt2= new Raton("USB","ACER");
        Teclado tc2= new Teclado("Bluetooth","ACER");
        Monitor mt2 = new Monitor("TOSHIBA",16.5);
        Computadora pc2 = new Computadora("TOSHIBA",mt2,tc2,rt2);
        
        ///orden 1
        Orden ord1= new Orden();
        ord1.agregarComputadora(pc1);
        ord1.mostrarOrden();
        /// orden 2 
        Orden ord2= new Orden();
        ord2.agregarComputadora(pc2);
        ord2.mostrarOrden();
    }
}
