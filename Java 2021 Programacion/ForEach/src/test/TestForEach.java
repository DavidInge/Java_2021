package test;

import domain.Persona;

/**
 *
 * @author David Morales
 */
public class TestForEach {

        /////se trata de for mejorado 
    
    public static void main(String[] args) {
        int edades[]= {5,6,7,8,9};
        // se declara una variable que almacena cada uno de los valores del arreglo por ende
        // se declara una variable segun sea el arreglo 
        for (int edad:edades)
        {
            // no se puede acceder al indice del arreglo, lo recomendado es usar un contador
            System.out.println("edad = " + edad);
        }
        
        Persona personas []={new Persona("Juan"),new Persona("Maria"),new Persona("Carlos")};
        for(Persona persona:personas)
        {
            System.out.println("persona = " + persona);
        }
        
    }
    
}
