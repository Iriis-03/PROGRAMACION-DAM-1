package org.example.TEMARIO_CURSO.REPASO_RECU;

import java.util.Random;

public class Ej1_Arrays {

    static void main(String[] args) {

        Random aleatorio = new Random();

        int[] vector = new int[8];

        int suma = 0;

        for(int i=0; i < vector.length; i++){

            int num = aleatorio.nextInt(501);

            vector[i] = num;
            suma += num;

            System.out.println("El número " + (i + 1) + " es: " + num);

        }

        System.out.println();
        System.out.println("La suma de todos los elementos de la Array es: " + suma);

    }



}
