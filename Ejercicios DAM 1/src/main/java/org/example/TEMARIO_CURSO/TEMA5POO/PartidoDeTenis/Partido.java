package org.example.TEMARIO_CURSO.TEMA5POO.PartidoDeTenis;

import java.util.ArrayList;

public class Partido {

    private Jugador jugador1;
    private Jugador jugador2;
    private ArrayList<Set> listaDeSets = new ArrayList<>();

    public Partido(Jugador jugador1, Jugador jugador2, ArrayList<Set> listaDeSets) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.listaDeSets = listaDeSets;
    }

    public Partido(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }


    @Override
    public String toString() {
        String mostrar= "Partido creado entre " + jugador1.getNombre() +
                " y " + jugador2.getNombre() + "\n";
        int n=1;
        for (Set set : listaDeSets) {
            mostrar += "Set " + n + ": ";
            mostrar += set.toString();
            mostrar += "\n";
            n++;
        }

        mostrar += "Total de sets jugados: " + (n - 1) + "\n";


        return mostrar;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public ArrayList<Set> getListaDeSets() {
        return listaDeSets;
    }

    public void setListaDeSets(ArrayList<Set> listaDeSets) {
        this.listaDeSets = listaDeSets;
    }

    public boolean insertarSet(int puntosJ1, int puntosJ2){

        Set nuevoSet = new Set(puntosJ1,puntosJ2);
        if (nuevoSet.correcto()){
            listaDeSets.add(nuevoSet);
            return true;
        } else {
            return false;
        }

    }




}
