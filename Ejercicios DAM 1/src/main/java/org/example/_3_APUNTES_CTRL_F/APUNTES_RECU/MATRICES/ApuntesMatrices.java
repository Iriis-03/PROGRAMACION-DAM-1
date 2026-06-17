package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.MATRICES;

import java.util.Scanner;

public class ApuntesMatrices {

    static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // ==========================================================
        // 1. DECLARACIÓN (Filas x Columnas)
        // ==========================================================
        // int[][] nombre = new int[filas][columnas];
        int[][] tablero = new int[3][3]; // Una rejilla de 3x3 (9 huecos total)

        // ==========================================================
        // 2. RECORRER Y RELLENAR (Doble Bucle FOR)
        // ==========================================================
        System.out.println("Introduce los datos para la matriz 3x3:");

        // El primer for recorre las FILAS
        for (int i = 0; i < tablero.length; i++) {
            // El segundo for recorre las COLUMNAS de esa fila
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("Fila " + i + ", Columna " + j + ": ");
                tablero[i][j] = read.nextInt();
            }
        }

        // ==========================================================
        // 3. MOSTRAR LA MATRIZ (Formato Tabla)
        // ==========================================================
        System.out.println("\n--- CONTENIDO DE LA MATRIZ ---");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                // Usamos print (sin 'ln') y un espacio para que salga en línea
                System.out.print(tablero[i][j] + "\t"); // \t es un tabulador
            }
            System.out.println(); // Salto de línea al terminar cada fila
        }

        // ==========================================================
        // 4. ACCESO DIRECTO
        // ==========================================================
        // Si quieres cambiar un dato concreto:
        // tablero[fila][columna] = valor;
        tablero[0][0] = 99; // Cambia la esquina superior izquierda
    }

    /*
     * ==========================================================
     * MATRICES (Arrays Bidimensionales)
     * ==========================================================
     * 1. DEFINICIÓN:
     * Es un "array de arrays". Una estructura de datos que necesita
     * DOS índices para acceder a un elemento: [fila] y [columna].
     *
     * 2. DECLARACIÓN E INICIALIZACIÓN:
     * - Vacía: int[][] matriz = new int[3][4]; // 3 filas y 4 columnas.
     * - Con datos:
     * int[][] tabla = {
     * {1, 2, 3}, // Fila 0
     * {4, 5, 6}  // Fila 1
     * };
     *
     * 3. ACCESO A DATOS:
     * - Lectura/Escritura: matriz[fila][columna]
     * - Ejemplo: matriz[0][2] = 10; // Primera fila, tercera columna.
     *
     * 4. RECORRIDO (Bucle Anidado):
     * Para recorrer una matriz completa siempre necesitas DOS bucles 'for':
     * - El externo recorre las FILAS.
     * - El interno recorre las COLUMNAS de esa fila.
     *
     * 5. PROPIEDAD .length EN MATRICES:
     * - matriz.length       -> Devuelve el número de FILAS.
     * - matriz[0].length    -> Devuelve el número de COLUMNAS de la fila 0.
     * ==========================================================
     */
}