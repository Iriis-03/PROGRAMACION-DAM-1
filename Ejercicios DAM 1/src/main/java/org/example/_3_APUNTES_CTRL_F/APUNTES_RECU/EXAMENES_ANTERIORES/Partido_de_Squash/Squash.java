package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.EXAMENES_ANTERIORES.Partido_de_Squash;

import java.util.Scanner;

/**
 * EXPLICACIÓN DEL PROBLEMA:
 * El objetivo es procesar una cadena de texto que representa puntos (A o B).
 * La letra 'S' indica que un set termina y la 'F' que el partido acaba.
 */
public class Squash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los tantos (Ej: AAAAAAAABBBBSAAAF):");
        String entrada = sc.nextLine().toUpperCase();

        // VALIDACIÓN DE FORMATO (Exigido en el PDF):
        // 1. .endsWith("F") comprueba que el último carácter sea F.
        // 2. .indexOf("F") busca la primera F. Si su posición no es la última (length-1),
        // significa que hay una F colada en medio del String.
        if (!entrada.endsWith("F") || entrada.indexOf("F") != entrada.length() - 1) {
            System.out.println("El formato no es correcto.");
        } else {
            int puntosA = 0;
            int puntosB = 0;
            String marcadorFinal = ""; // Acumulador de los resultados de cada set

            // Recorremos la cadena carácter por carácter
            for (int i = 0; i < entrada.length(); i++) {
                char actual = entrada.charAt(i);

                if (actual == 'A') {
                    puntosA++; // Sumamos punto al jugador A
                } else if (actual == 'B') {
                    puntosB++; // Sumamos punto al jugador B
                } else if (actual == 'S' || actual == 'F') {
                    // Si encontramos S o F, el set actual ha terminado.
                    // Concatenamos el resultado actual (ej: "9-11") al marcador global.
                    marcadorFinal += puntosA + "-" + puntosB + " ";

                    // REINICIO DE CONTADORES: Fundamental para empezar el siguiente set desde cero.
                    puntosA = 0;
                    puntosB = 0;
                }
            }
            // .trim() elimina el espacio en blanco que sobra al final de la cadena
            System.out.println(marcadorFinal.trim());
        }
    }
}