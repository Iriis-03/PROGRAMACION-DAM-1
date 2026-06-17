package org.example._2_TEMARIO.UP3_Estructuras_Datos.ARRAYS.EJERCICIOS;

import java.util.Arrays;

public class Ejercicio5 {

    static void main() {

        int[] vector = {9, 5, 3, 8, 2};
        System.out.println(Arrays.toString(vector));
        int aux = 0;

        aux = vector[vector.length - 1];

        for (int i = vector.length - 1; i >= 1; i--){
            vector[i] = vector[i - 1];
        }

        vector[0] = aux;

        System.out.println(Arrays.toString(vector));
        System.out.println(aux);
    }
}
