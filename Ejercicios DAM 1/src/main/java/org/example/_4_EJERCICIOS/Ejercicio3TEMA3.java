package org.example._4_EJERCICIOS;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3TEMA3 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Random aleatorio = new Random();

        int[] elementos = new int[25];

        int resultado = 0;

        for (int i = 0; i < 25; i++) {
            elementos[i] = aleatorio.nextInt(0,101);
            if (i == elementos.length - 1){
                System.out.println(elementos[i]);
            } else {
                System.out.print(elementos[i] + ", ");
            }
        }

        System.out.print("Ingresa un número para buscar [0,100]: ");
        int num = read.nextInt();

        int contador = 0;

        for (int i = 0; i < elementos.length; i++) {
            if (num == elementos[i]){
                contador++;
            }
        }

        System.out.println("El número " + num + " aparece " + contador + " veces en el array.");
    }
}
