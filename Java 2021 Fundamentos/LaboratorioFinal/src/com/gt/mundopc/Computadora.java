package com.gt.mundopc;

/**
 *
 * @author David Morales
 */
public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;
    
    public Computadora()
    {
     this.idComputadora=++Computadora.contadorComputadoras;
    }
    public Computadora (String nombre,Monitor monitor,Teclado teclado,Raton raton)
    {   
        // inicializa el constructor para que el contador de  computadoras incremente 
        this();
        
        this.nombre =nombre;
        this.monitor=monitor;
        this.teclado=teclado;
        this.raton=raton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }

}
