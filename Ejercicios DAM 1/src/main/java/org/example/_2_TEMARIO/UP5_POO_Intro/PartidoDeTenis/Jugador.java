package org.example._2_TEMARIO.UP5_POO_Intro.PartidoDeTenis;

public class Jugador {

    private String nombre;
    private int ranking;
    private Jugador rival;

    public Jugador(String nombre, int ranking) {
        this.nombre = nombre;
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", ranking=" + ranking +
                ", rival=" + rival +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public Jugador getRival() {
        return rival;
    }

    public void setRival(Jugador rival) {
        this.rival = rival;
    }



}
