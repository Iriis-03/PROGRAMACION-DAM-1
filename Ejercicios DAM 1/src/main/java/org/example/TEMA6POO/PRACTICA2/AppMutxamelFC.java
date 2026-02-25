package org.example.TEMA6POO.PRACTICA2;

import java.util.ArrayList;

public class AppMutxamelFC {
    static void main(String[] args) {

        // crear varios jugadores para el equipo SENIOR
        System.out.println("*******************************************************");
        Jugador david = new Jugador("David", 18, "SENIOR", "CENTROCAMPISTA", 8);
        Jugador iris = new Jugador("Iris", 22, "SENIOR", "DEFENSA", 3);
        Jugador jacobo = new Jugador("Jacobo", 20, "SENIOR", "PORTERO",10);

        System.out.println(david);
        System.out.println(iris);
        System.out.println(jacobo);
        System.out.println("*******************************************************");

        // crear al entrenador del equipo SENIOR
        Entrenador carlos = new Entrenador("Carlos", 19, "SENIOR", "4-4-2");
        System.out.println(carlos);
        System.out.println("*******************************************************");

        // crear a los masajistas del club
        Masajista maribel = new Masajista("Maribel", 33, "Fisioterapia", 8);
        System.out.println(maribel);
        System.out.println("*******************************************************");

        // crear a algún acompañante para un par de jugadores
        Acompanante adri = new Acompanante("Adri", 26, david, "compañeros");
        System.out.println(adri);
        System.out.println("*******************************************************");

        // concentrarse()
        david.concentrarse();
        iris.concentrarse();
        jacobo.concentrarse();

        // entrenar()
        carlos.entrenar();

        // darMasaje() a algún jugador
        maribel.darMasaje(david);

        // viajar() a Madrid
        david.viajar("Madrid");
        iris.viajar("Madrid");
        jacobo.viajar("Madrid");

        // planificarEntrenamiento()
        carlos.planificarEntrenamiento();

        // entrenar()
        david.entrenar();
        iris.entrenar();
        jacobo.entrenar();

        // descansar()
        david.descansar();
        iris.descansar();
        jacobo.descansar();

        // calentar()
        david.calentar();
        iris.calentar();
        jacobo.calentar();

        // jugarPartido()
        david.jugarPartido("Real Madrid");
        iris.jugarPartido("Real Madrid");
        jacobo.jugarPartido("Real Madrid");

        // animarEquipo()
        adri.animarEquipo();

        // hacerCambios()
        carlos.hacerCambios();

        // marcarGol()
        david.marcarGol();
        iris.marcarGol();

        // celebrarGol()
        david.celebrarGolf();
        iris.celebrarGolf();

        // darMasaje() a varios jugadores
        maribel.darMasaje(david);
        maribel.darMasaje(iris);
        maribel.darMasaje(jacobo);

        // viajar() a Mutxamel
        david.viajar("Mutxamel");
        iris.viajar("Mutxamel");
        jacobo.viajar("Mutxamel");

        // descansar()
        david.descansar();
        iris.descansar();
        jacobo.descansar();
    }
}