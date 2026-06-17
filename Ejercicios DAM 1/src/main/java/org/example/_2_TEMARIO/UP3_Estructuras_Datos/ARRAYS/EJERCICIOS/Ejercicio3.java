package org.example._2_TEMARIO.UP3_Estructuras_Datos.ARRAYS.EJERCICIOS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    static void main() {

        Random aleatorio = new Random();
        Scanner read = new Scanner(System.in);

        int [] vector_random = new int[25];
        int contador = 0;

        for (int i = 0; i < vector_random.length; i++){
            vector_random[i] = aleatorio.nextInt(0, 101);
        }
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println(Arrays.toString(vector_random));
        System.out.println("---------------------------------------------------------------------------------------------------");

        System.out.print("Introduce un número [0,100]: ");
        int num = read.nextInt();

        for (int i = 0; i < vector_random.length; i++){
            if (vector_random[i] == num){
                contador++;
            }
        }

        System.out.println("El número " + num + " aparece " + contador + " veces");
    }
}
