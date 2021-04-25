package com.gt.mundopc;

/**
 *
 * @author David Morales
 */
public class Raton extends DispositivoEntrada {

    private int idRaton;
    private static int contadorRaton;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton=++Raton.contadorRaton;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + " , " +super.toString()+'}';
    }

}
