package org.example._5_EXAMENES_AÑOS_ANTERIORES.TEMA1;


import java.util.Scanner;

public class AlicatarPared{


    static void main() {

        Scanner read = new Scanner(System.in);

        int anchoPared;
        int altoPared;
        int anchoAzulejo;
        int altoAzulejo;
        int numHorizontal;  // Número de azulejos en orientación horizontal
        int numVertical;    // Número de azulejos en orientación vertical
        int minAzulejos;    // Mínimo número de azulejos necesarios


        System.out.print("Introduce el ancho de la pared: ");
        anchoPared = Integer.parseInt(read.nextLine()); // Convertir entrada a entero

        System.out.print("Introduce el alto de la pared: ");
        altoPared = Integer.parseInt(read.nextLine()); // Convertir entrada a entero

        System.out.print("Introduce el ancho del azulejo: ");
        anchoAzulejo = Integer.parseInt(read.nextLine()); // Convertir entrada a entero

        System.out.print("Introduce el alto del azulejo: ");
        altoAzulejo = Integer.parseInt(read.nextLine()); // Convertir entrada a entero


        if (anchoAzulejo == altoAzulejo) {
            System.out.println("Error: el azulejo debe ser rectangular."); // Mensaje de error
            return; // Termina el programa
        }

        if ((anchoAzulejo > anchoPared && anchoAzulejo > altoPared) ||
                (altoAzulejo > altoPared && altoAzulejo > anchoPared)) {
            System.out.println("Error: el azulejo es más grande que la pared."); // Mensaje de error
            return; // Termina el programa
        }


        // Cálculo de número de azulejos
        numHorizontal = (int) Math.ceil((double) anchoPared / anchoAzulejo) // Número de azulejos a lo ancho
                * (int) Math.ceil((double) altoPared / altoAzulejo); // Número de azulejos a lo alto

        numVertical = (int) Math.ceil((double) anchoPared / altoAzulejo)   // Número de azulejos a lo ancho
                * (int) Math.ceil((double) altoPared / anchoAzulejo); // Número de azulejos a lo alto

        minAzulejos = Math.min(numHorizontal, numVertical); // Elegir el mínimo



        System.out.println("Número mínimo de azulejos necesarios: " + minAzulejos); // Mostrar resultado
    }
}


