package org.example._4_EJERCICIOS;

import java.util.Arrays;

public class InvertirArray {

    static void main(String[] args) {

        int[] array_original = {1,2,3,4,5};
        int[] array_invertida = new int[5];

        for (int i = 0; i < array_original.length; i++) {
            array_invertida[4 - i] = array_original[i];
        }

        System.out.println(Arrays.toString(array_original));
        System.out.println(Arrays.toString(array_invertida));
    }

}
