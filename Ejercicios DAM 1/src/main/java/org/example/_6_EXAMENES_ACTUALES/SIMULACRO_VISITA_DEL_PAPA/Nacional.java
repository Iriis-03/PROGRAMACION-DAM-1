package org.example._6_EXAMENES_ACTUALES.SIMULACRO_VISITA_DEL_PAPA;

public class Nacional extends Peregrino {

    private String provincia;

    public Nacional(Integer numReserva, String nombre, String provincia) {
        super(numReserva, nombre);
        this.provincia=provincia;
    }


}
