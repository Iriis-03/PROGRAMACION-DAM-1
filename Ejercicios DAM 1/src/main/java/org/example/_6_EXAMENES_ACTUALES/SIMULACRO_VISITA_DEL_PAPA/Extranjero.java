package org.example._6_EXAMENES_ACTUALES.SIMULACRO_VISITA_DEL_PAPA;

public class Extranjero extends Peregrino {

    private String pais;

    public Extranjero(Integer numReserva, String nombre, String pais) {
        super(numReserva, nombre);
        this.pais=pais;
    }


}
