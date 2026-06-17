package org.example._2_TEMARIO.UP7_Colecciones_Funcional.comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PruebaIndestructible {

    static List<Integer> lista = Collections.unmodifiableList(new ArrayList<>());

    static void main(String[] args) {

        lista.add(324);
        lista.add(2);

    }

    public static List<Integer> getLista(){
        return Collections.unmodifiableList(lista);
    }
}
