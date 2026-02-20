package org.example.TEMA6POO.PRACTICA2;

public class Entrenador extends MutxamelFC{

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, String equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = Equipos.valueOf(equipo);
        this.formacionPreferida = formacionPreferida;
    }

    public void planificarEntrenamiento(){
        System.out.println("El entrenador" + getNombre() + "está planificando el entrenamiento de " + getNombre() + " del equipo, " + equipo);
    }

    public void hacerCambios(){
        System.out.println("El entrenador" + getNombre() + "ha cambiado a " + getNombre() + " por " + getNombre());
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "equipo=" + equipo +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                '}';
    }
}
