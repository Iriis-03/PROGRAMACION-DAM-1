package org.example._2_TEMARIO.UP3_Estructuras_Datos.PRACTICAS;

import java.util.Random;
import java.util.Scanner;

public class Practica1 {

    static void main() {

        Scanner read = new Scanner(System.in);

        Random aleatorio = new Random();

        boolean salir_bucle= false;

        int [] potencias_equipo1 = new int[7];
        int [] potencias_equipo2 = new int[7];

        for (int e = 1; e <= 2; e++){ //e de equipo
            do {
                System.out.println("Equipo " + e);
                System.out.print("Introduce la potencia de los samuráis: ");
                String potencia = read.nextLine();

                String cadena[] = potencia.split(" ");

                int [] potencias_equipo = new int[7];

                int potencia_total = 0;

                for (int i = 0; i < 7; i++){
                    potencias_equipo[i] = Integer.parseInt(cadena[i]);
                    potencia_total += potencias_equipo[i];
                }
                if (potencia_total == 30){
                    if (e == 1)
                        potencias_equipo1 = potencias_equipo;
                    else
                        potencias_equipo2 = potencias_equipo;
                    salir_bucle = true;
                    System.out.println("Equipo completado.");
                } else {
                    System.out.println("ERROR. La potencia total no suma 30.");
                }
            }while (!salir_bucle);
        }
        //System.out.println(Arrays.toString(potencias_equipo1));
        //System.out.println(Arrays.toString(potencias_equipo2));

        //Batalla
        System.out.println("¡Empieza la batalla!");

        int num_aleatorio = aleatorio.nextInt(7);
        System.out.println("La batalla inicia con el Samurai " + num_aleatorio);

        int derrotas_equipo1 = 0;
        int derrotas_equipo2 = 0;

        for (int i = 0; i < 7; i++){
            int p = i + num_aleatorio;
            if (p > 6)
                p -= 7;
            if (potencias_equipo1[p] > potencias_equipo2[p]){
                System.out.println("Samurai " + p + ". Gana Equipo 1. " + potencias_equipo1[p] + " vs " + potencias_equipo2[p]);
                derrotas_equipo2++;

            } else if (potencias_equipo1[p] < potencias_equipo2[p]){
                System.out.println("Samurai " + p + ". Gana Equipo 2. " + potencias_equipo1[p] + " vs " + potencias_equipo2[p]);
                derrotas_equipo1++;

            } else {
                System.out.println("Samurai " + p + ". EMPATE. " + potencias_equipo1[p] + " vs " + potencias_equipo2[p]);
                derrotas_equipo1++;
                derrotas_equipo2++;
            }

            if (derrotas_equipo1 == 4 || derrotas_equipo2 == 4) {
                break;
            }
        }

        if (derrotas_equipo1 == 4) {
            System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido 4 bajas.");
        } else
            System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido 4 bajas.");
    }
}
