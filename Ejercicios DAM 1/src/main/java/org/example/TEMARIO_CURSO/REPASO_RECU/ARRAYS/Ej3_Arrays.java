package org.example.TEMARIO_CURSO.REPASO_RECU.ARRAYS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej3_Arrays {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Random aleatorio = new Random();

        int[] vector = new int[25];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(101);
        }

        System.out.println("Ingresa un número para buscar [0,100]: ");
        int num = read.nextInt();

        int cont = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num){
                cont++;
            }
        }

        System.out.println(Arrays.toString(vector));
        System.out.println("El número " + num + " aparece " + cont + " veces en el array.");

    }
}
