package test;

/**
 *
 * @author David Morales
 */
public class TestAutoboxingUnboxing {
    
    // cada uno de los tipos primitivos cuenta con una clase llamada Wrapper o Envolvente
    public static void main(String[] args) {
        //Clases Envolventes  de tipos Primitivos 
        /*
        int-Integer
        long -Long
        float-Float
        double-Double 
        */
        
        Integer entero =10;//Autoboxing se envuelve un dato primitivo en una clase entera la cual permite convertir y otras cosas.
        System.out.println("entero = " + entero);
        System.out.println("entero double = " + entero.doubleValue());
        
        int entero2=entero; //Unboxing se devuelve el valor de entero a una variable primitiva 
        System.out.println("entero2 = " + entero2);
    }
}
