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
        // Se comprueba si el dorsal ya está asignado a otro jugador del mismo equipo
        for (Jugador jugador : AppMantenimiento.listaJugadores) {
            if (jugador != this && jugador.getCategoria().equals(this.categoria) && jugador.getDorsal() == dorsal) {
                throw new DorsalYaAsignadoException(this.categoria);
            }
        }
        this.dorsal = dorsal; // Si pasa la validación, se asigna el dorsal
        System.out.println("El dorsal " + dorsal + " se ha asignado correctamente al jugador " + getNombre());
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre()
                + ", Edad: " + getEdad()
                + ", Categoría: " + categoria
                + ", Dorsal: " + dorsal
                + ", Posición: " + posicion;
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
