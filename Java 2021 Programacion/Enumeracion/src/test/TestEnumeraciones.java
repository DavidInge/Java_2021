package test;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author David Morales
 */
public class TestEnumeraciones {

    public static void main(String[] args) {
        // System.out.println("Dia 1: " + Dias.Lunes);
        //indicarDiaSemana(Dias.Lunes);

        System.out.println("Continente No.4 " + Continentes.AMERICA);
        System.out.println("No. Paises en el 4to Continente: " + Continentes.AMERICA.getPaises());
    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case Lunes:
                System.out.println("Primer dia de la semana");
                break;
            case Martes:
                System.out.println("Segundo dia de la semana");
                break;
        }
    }
}
