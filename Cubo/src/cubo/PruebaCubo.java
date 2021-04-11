/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo;

/**
 *
 * @author David Morales
 */
public class PruebaCubo {
    public static void main(String[] args) {
        cubo cubito= new cubo();
        cubito.alto=25;
        cubito.ancho=50;
        cubito.profundidad=22;
        int resp=cubito.alto*cubito.ancho*cubito.profundidad;
        System.out.println("El Volumen es de: "+resp);
        
        cubito.calcularVolumen(25, 50, 22);
        
    }
    
}
