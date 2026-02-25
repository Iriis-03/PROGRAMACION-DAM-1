package org.example.TEMA6POO.PRACTICA2;

import java.util.ArrayList;

public class Jugador extends MutxamelFC implements AccionesDeportivas{

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;
    private static ArrayList<Jugador> listaJugadores = new ArrayList<>();

    public Jugador(String nombre, int edad, String categoria, String posicion, int dorsal) {
        super(nombre, edad);
        this.categoria = Equipos.valueOf(categoria);
        this.posicion = Posiciones.valueOf(posicion);
        this.dorsal = dorsal;
    }

    public static void mostrarJugadoresEquipo() {
        System.out.println("Estos son los jugadores de esta temporada: ");

        for (Jugador jugador : listaJugadores) {
            System.out.println(", " + jugador);
        }
    }

    public void calentar(){
        System.out.println("El jugador " + getNombre() + " está calentando antes del partido");
    }

    public void descansar(){
        System.out.println("El jugador " + getNombre() + " está descansando en la pausa");
    }

    public void marcarGol(){
        System.out.println("GOOOOOOOOOOOOOOL de " + getNombre());
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {

        try {
            //Se comprueba si el dorsal ya está asignado a otro jugador
            for (Jugador jugador : listaJugadores) {
                if (jugador != this && jugador.getCategoria() == this.categoria && jugador.getDorsal() == dorsal) {
                    throw new DorsalYaAsignadoException();
                }
            }

            this.dorsal = dorsal; //Si son diferentes, se asigna al jugador el dorsal introducido

            //Si el jugador no está, se añade a la lista
            if (!listaJugadores.contains(this)) {
                listaJugadores.add(this);
            }

            System.out.println("El dorsal " + dorsal + " se ha asignado correctamente al jugador " + getNombre());

        } catch (DorsalYaAsignadoException exception) {
            System.out.println(exception.getMessage());
            this.dorsal = 0; //En caso de error (si el dorsal coincide con el de otro jugador) se desasigna el dorsal al jugador
        }
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "categoria=" + categoria +
                ", dorsal=" + dorsal +
                ", posicion=" + posicion +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador " + getNombre() + " se está concentrando");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El jugador " + getNombre() + " viaja a " + ciudad);
    }

    @Override
    public void celebrarGolf() {
        System.out.println("GOOOOOOOOOOOOOOL de " + getNombre());
    }

    @Override
    public void entrenar() {
        System.out.println("El jugador " + getNombre() + " está entrenando");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El jugador " + getNombre() + " está jugando contra " + rival);

    }
}
