package org.example.TEMA6POO.PRACTICA2;

public class Jugador extends MutxamelFC{

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad, String categoria, String posicion, int dorsal) {
        super(nombre, edad);
        this.categoria = Equipos.valueOf(categoria);
        this.posicion = Posiciones.valueOf(posicion);
        this.dorsal = dorsal;
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
        this.dorsal = dorsal;
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
}
