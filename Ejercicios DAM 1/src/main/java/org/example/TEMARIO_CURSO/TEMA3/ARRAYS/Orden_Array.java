package org.example.TEMARIO_CURSO.TEMA3.ARRAYS;

import java.util.Arrays;
import java.util.Collections;

public class Orden_Array {

    static void main() {

        Integer vector[] = {4,3,2,5,0};

        Integer vector2[] = vector.clone();

        Arrays.sort(vector2);

        System.out.println(Arrays.toString(vector2));

//        Arrays.sort(vector2, Collections.reverseOrder());

        System.out.println(Arrays.toString(vector2));

        int posicion = Arrays.binarySearch(vector2,5);

        System.out.println(posicion);
    }
}

