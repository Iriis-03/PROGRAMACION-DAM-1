package org.example.TEMA6POO.PRACTICA2;

import java.util.ArrayList;

public class Jugador extends MutxamelFC implements AccionesDeportivas {

    /**
     * La clase Jugador, hija de MutxamelFC, hace referencia a un jugador.
     */

    /**
     * Se utilizan los atributos categoria, dorsal, posicion y la lista de jugadores.
     */
    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;
    private static ArrayList<Jugador> listaJugadores = new ArrayList<>();

    /**
     * Constructor principal + super(nombre, edad) de la clase madre.
     */
    public Jugador(String nombre, int edad, String categoria, String posicion, int dorsal) {
        super(nombre, edad);
        this.categoria = Equipos.valueOf(categoria);
        this.posicion = Posiciones.valueOf(posicion);
        this.dorsal = dorsal;
    }

    /**
     * Método que imprime todos los jugadores que están en la temporada.
     */
    public static void mostrarJugadoresEquipo() {
        System.out.println("Estos son los jugadores de esta temporada: ");

        for (Jugador jugador : listaJugadores) {
            System.out.println(", " + jugador);
        }
    }

    /**
     * Método que imprime un mensaje de que el jugador está calentando.
     */
    public void calentar() {
        System.out.println("El jugador " + getNombre() + " está calentando antes del partido");
    }

    /**
     * Método que imprime un mensaje de que el jugador está descansando.
     */
    public void descansar() {
        System.out.println("El jugador " + getNombre() + " está descansando en la pausa");
    }

    /**
     * Método que imprime un mensaje cuando el jugador marca un gol y quién ah marcado el gol.
     */
    public void marcarGol() {
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

    /**
     * Se le asigna un dorsal al jugador comprobando que no esté repetido en el mismo equipo.
     * @param dorsal nuevo dorsal
     * @throws DorsalYaAsignadoException si el dorsal ya está asignado por otro jugador de la misma categoría, salta este error
     */
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

    /**
     * Método que deriva de la interface, FuncionesIntegrantes, imprime que el jugador se está concentrando.
     */
    @Override
    public void concentrarse() {
        System.out.println("El jugador " + getNombre() + " se está concentrando");
    }

    /**
     * Método que deriva de la interface, FuncionesIntegrantes, imprime a qué ciudad viaja el jugador.
     * @param ciudad ciudad a la que viaja el jugador
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println("El jugador " + getNombre() + " viaja a " + ciudad);
    }

    /**
     * Método que deriva de la interface, FuncionesIntegrantes, imprime que el jugador celebra un gol.
     */
    @Override
    public void celebrarGolf() {
        System.out.println("GOOOOOOOOOOOOOOL de " + getNombre());
    }

    /**
     * Método que deriva de la interface AccionesDeportivas, imprime que el jugador está entrenando.
     */
    @Override
    public void entrenar() {
        System.out.println("El jugador " + getNombre() + " está entrenando");
    }

    /**
     * Método que deriva de la interface AccionesDeportivas, imprime un mensaje de que el jugador está jugando un partido contra el equipo rival.
     * @param rival equipo rival
     */
    @Override
    public void jugarPartido(String rival) {
        System.out.println("El jugador " + getNombre() + " está jugando contra " + rival);
    }
}
