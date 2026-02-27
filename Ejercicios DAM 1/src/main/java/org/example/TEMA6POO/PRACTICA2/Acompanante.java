package org.example.TEMA6POO.PRACTICA2;

public class Acompanante extends MutxamelFC {

    /**
     * La clase Acompanante, hija de la clase madre MutxamelFC, hace referencia a un acompañante de un jugador.
     */

    /**
     * Se utilizan los atributos, integrante y parentesco
     */
    private Jugador integrante;
    private String parentesco;

    /**
     * Constructor principal + el de la madre(super(nombre, edad))
     */
    public Acompanante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    /**
     * Método que imprime un mensaje del acompañante para animar al equipo.
     */
    public void animarEquipo() {
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

    /**
     * Método que deriva de la interface, FuncionesIntegrantes, que imprime un mensaje sobre lo muy concentrado que está el acompañante.
     */
    @Override
    public void concentrarse() {
        System.out.println("El acompañante" + getNombre() + " está muy concentrado");
    }

    /**
     * Método que deriva de la interface, FuncionesIntegrantes, que imprime un mensaje sobre donde va de viaje el acompañante conjunto al equipo.
     * @param ciudad la ciudad a la que viajan
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante " + getNombre() + "viaja con el equipo a " + ciudad);
    }

    /**
     * Método que deriva de la interface, FuncionesIntegrantes, que imprime un mensaje del acompañante celebrando un gol.
     */
    @Override
    public void celebrarGolf() {
        System.out.println("El acompañante" + getNombre() + " celebra el gol de " + getNombre());
    }
}
