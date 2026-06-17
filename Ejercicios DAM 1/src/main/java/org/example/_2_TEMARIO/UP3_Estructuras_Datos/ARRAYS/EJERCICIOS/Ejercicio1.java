package org.example._2_TEMARIO.UP3_Estructuras_Datos.ARRAYS.EJERCICIOS;

import java.util.Random;

public class Ejercicio1 {

    static void main() {

        Random aleatorio = new Random();

        int [] vector2 = new int [8];
        int contador = 0;
        for (int i = 0; i < vector2.length;i++){
            vector2 [i] = aleatorio.nextInt(0, 501);
            contador += vector2[i];
        }

        System.out.println(contador);
    }
}
