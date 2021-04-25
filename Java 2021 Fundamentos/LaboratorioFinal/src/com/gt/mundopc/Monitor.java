package com.gt.mundopc;
/**
 *
 * @author David Morales
 */
public class Monitor {
private int idMonitor;
private static int contadorMonitor;
private String marca;
private double tamaño;

    public Monitor() {
        this.idMonitor=++Monitor.contadorMonitor;
    }

    public Monitor(String marca, double tamaño) {
        this();
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public int getMonitor()
    {
    return this.idMonitor;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override 
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamaño + '}';
    }
    

}
