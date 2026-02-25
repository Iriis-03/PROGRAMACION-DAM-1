package org.example.TEMA6POO.PRACTICA2;

public class Acompanante extends MutxamelFC{

    private Jugador integrante;
    private String parentesco;

    public Acompanante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    public void animarEquipo(){
        System.out.println("¡VAMOS!");
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String toString() {
        return "Acompanante{" +
                "integrante=" + integrante +
                ", parentesco='" + parentesco + '\'' +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("El acompañante" + getNombre() + " está muy concentrado");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante " + getNombre() + "viaja con el equipo a " + ciudad);
    }

    @Override
    public void celebrarGolf() {
        System.out.println("El acompañante" + getNombre() + " celebra el gol de " + getNombre());
    }
}
