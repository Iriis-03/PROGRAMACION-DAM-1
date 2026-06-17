package org.example._2_TEMARIO.UP6_POO_Avanzado.PRACTICA2;

public class Entrenador extends MutxamelFC implements AccionesDeportivas{

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, String equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = Equipos.valueOf(equipo);
        this.formacionPreferida = formacionPreferida;
    }

    public void planificarEntrenamiento(){
        System.out.println("El entrenador " + getNombre() + " está planificando el entrenamiento del equipo, " + equipo);
    }

    public void hacerCambios(){
        System.out.println("El entrenador " + getNombre() + " ha cambiado a dos jugadores");
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

        try {

            if (!formacionPreferida.matches("\\d+-\\d+-\\d+")){
                throw new FormatoIncorrectoException();
            }
            this.formacionPreferida = formacionPreferida;

        } catch (FormatoIncorrectoException exception){
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "equipo=" + equipo +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                '}';
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador " + getNombre() + " está entrenando al equipo, " + equipo);
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El equipo " + equipo + " está jugando contra " + rival);
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador" + getNombre() + " está muy concentrado");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El equipo " + equipo + " viaja a " + ciudad);
    }

    @Override
    public void celebrarGolf() {
        System.out.println("El entrenador " + getNombre() + " celebra el gol de su equipo " + equipo);
    }
}
