package org.example._2_TEMARIO.UP5_POO_Intro.PartidoDeTenis;

public class PartidoApp {

    static void main(String[] args) {

        Jugador jugador1 = new Jugador("Sergi", 23);
        Jugador jugador2 = new Jugador("Arnau", 38);

        Partido partido = new Partido(jugador1, jugador2);

        partido.insertarSet(6,4);
        partido.insertarSet(6,7);
        partido.insertarSet(7,6);

        System.out.println(partido.toString());

    }
}
