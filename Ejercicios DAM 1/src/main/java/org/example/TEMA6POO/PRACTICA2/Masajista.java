package org.example.TEMA6POO.PRACTICA2;

public class Masajista extends MutxamelFC{

    private String titulacion;
    private int anosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public void darMasaje(Jugador jugador){
        System.out.println("El masajista " + getNombre() + " está dando un masaje a " + jugador.getNombre());
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", anosExperiencia=" + anosExperiencia +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista " + getNombre() + " está muy concentrado");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista " + getNombre() + " viaja con el equipo a " + ciudad);
    }

    @Override
    public void celebrarGolf() {
        System.out.println("El masajista " + getNombre() + " celebra el gol");
    }
}
