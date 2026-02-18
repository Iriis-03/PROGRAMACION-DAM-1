package org.example.TEMA6POO.enums.Ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class DificultadApp {

    static void main(String[] args) {

        Random aleatorio = new Random();
        Scanner read = new Scanner(System.in);

        int puntuacion = aleatorio.nextInt(5001);

        System.out.println("Introduce la dificultad [FACIL, MEDIO, DIFICIL, EXPERTO]:");
        Dificultad nivel_dificultad = Dificultad.valueOf(read.next());

        int resultado = puntuacion * nivel_dificultad.getMultiplicador();

        System.out.println("Puntuación obtenida = " + puntuacion);
        System.out.println("Puntuación final = " + resultado);


    }
}
