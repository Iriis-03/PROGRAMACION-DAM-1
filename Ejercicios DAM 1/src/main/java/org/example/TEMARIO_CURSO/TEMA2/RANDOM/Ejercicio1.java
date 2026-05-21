package org.example.TEMARIO_CURSO.TEMA2.RANDOM;

import java.util.Random;

public class Ejercicio1 {

    static void main() {

        Random aleatorio = new Random();

        int numero1 = aleatorio.nextInt(6) + 1;
        System.out.println("Primer número: " + numero1);
        int numero2 = aleatorio.nextInt(6) + 1;
        System.out.println("Segundo número: " + numero2);

        System.out.println("La suma total es: " + numero1 + numero2);

    }
}
