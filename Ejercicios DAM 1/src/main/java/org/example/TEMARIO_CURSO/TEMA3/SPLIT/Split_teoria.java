package org.example.TEMARIO_CURSO.TEMA3.SPLIT;

import java.util.Arrays;

public class Split_teoria {

    static void main() {

        String cadena = "patri;liber;silvia;fabian;angel;manuela;vero";

        String profesores[] = cadena.split(";");

        System.out.println(Arrays.toString(profesores));

        //No funciona el código con este ejemplo, ya que, la cadena se tendría que hacer con int
        int vector[] = new int[profesores.length];

        for (int i = 0; i < profesores.length; i++){

            vector[i] = Integer.parseInt(profesores[i]);
        }
    }
}
