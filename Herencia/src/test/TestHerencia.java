package test;

import dominio.Empleado;
import dominio.Cliente;
import java.util.Date;
/**
 *
 * @author David Morales
 */
public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan",5000.0);
        System.out.println("empleado1 = " + empleado1);
        Cliente cliente1 = new Cliente(new Date(),true,"Karla",'F',28,"Villa Nueva");
        System.out.println("cliente1 = " + cliente1);
    }
 
}
