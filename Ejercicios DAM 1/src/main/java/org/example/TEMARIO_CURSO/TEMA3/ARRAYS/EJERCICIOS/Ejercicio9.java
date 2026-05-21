package org.example.TEMARIO_CURSO.TEMA3.ARRAYS.EJERCICIOS;

import java.util.Scanner;

public class Ejercicio9 {

    static void main() {

        Scanner read = new Scanner(System.in);

        int longitud_maxima = 0;
        String palabra_maxima = "";

        String [] array = {"manzana", "pera", "naranja", "kiwi", "plátano", "fresa", "mandarina"};

        for (int i = 0; i < array.length; i++){
            if (array[i].length() > longitud_maxima){
                longitud_maxima = array[i].length();
                 palabra_maxima = array [i];
            }
        }
        System.out.println("La palabra más larga es: " + palabra_maxima);
    }
}
