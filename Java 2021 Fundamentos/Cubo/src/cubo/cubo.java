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
public class cubo {
    
    int ancho, alto,profundidad;
    
    public void cubo(){
        System.out.println("Hola desde el Constructor");
        
    }
    
    public int calcularVolumen(int ancho, int alto, int profundidad)
    {
      this.alto= alto;
      this.ancho=ancho;
      this.profundidad=profundidad;
      int respuesta= ancho*alto*profundidad;
      System.out.println("El volumen del Cubo es de: "+respuesta);
      return respuesta;
    }
}
