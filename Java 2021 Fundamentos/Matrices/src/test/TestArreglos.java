package test;

/**
 *
 * @author David Morales
 */
public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new  int [3];
        
        edades[0]=10;
        edades[1]=13;
        edades[2]=14;
        System.out.println("edades [0] = " + edades [0]);
        
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("i = " + i + " : "+edades[i]);
        }
    }
    
}
