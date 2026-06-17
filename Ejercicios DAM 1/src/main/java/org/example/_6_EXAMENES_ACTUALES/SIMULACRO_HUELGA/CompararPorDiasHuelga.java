package org.example._6_EXAMENES_ACTUALES.SIMULACRO_HUELGA;

import java.util.Comparator;

public class CompararPorDiasHuelga implements Comparator<Docente> {

    @Override
    public int compare(Docente o1, Docente o2) {
        return o1.getDiasHuelga().compareTo(o2.getDiasHuelga());
    }

}
