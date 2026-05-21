package org.example.TEMARIO_CURSO.TEMA3.ARRAYS.EJERCICIOS;

import java.util.Arrays;

public class SumarElementos {

    static void main() {

        int suma = 0;
        int[] vector = {18, 36, 95, 42, 23};
        System.out.println(Arrays.toString(vector));

        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        System.out.println(suma);
    }
}
