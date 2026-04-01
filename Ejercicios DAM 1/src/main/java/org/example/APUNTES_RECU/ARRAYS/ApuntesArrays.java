package org.example.APUNTES_RECU.ARRAYS;

import java.util.Scanner;

public class ApuntesArrays {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // ==========================================================
        // 1. DECLARACIÓN Y CREACIÓN
        // ==========================================================
        // Un array es una lista de tamaño FIJO. No cambia.
        // Tipo[] nombre = new Tipo[tamaño];
        int[] notas = new int[5]; // Crea 5 huecos: del índice 0 al 4.

        // ==========================================================
        // 2. LLENAR UN ARRAY (Con un bucle FOR)
        // ==========================================================
        System.out.println("Introduce 5 notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota para la posición " + i + ": ");
            notas[i] = read.nextInt(); // Guardamos el dato en la posición 'i'
        }

        // ==========================================================
        // 3. RECORRER Y MOSTRAR (El "For-Each")
        // ==========================================================
        System.out.println("\nLas notas guardadas son:");
        // Opción rápida: "Por cada 'n' dentro de 'notas'..."
        for (int n : notas) {
            System.out.print("[" + n + "] ");
        }
        System.out.println(); // Salto de línea

        // ==========================================================
        // 4. OPERACIONES CLÁSICAS (Suma y Media)
        // ==========================================================
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i]; // Es lo mismo que suma = suma + notas[i]
        }
        double media = (double) suma / notas.length;
        System.out.println("La media es: " + media);

        // ==========================================================
        // 5. BUSCAR EL MÁXIMO (Típico de examen)
        // ==========================================================
        int maximo = notas[0]; // Suponemos que el primero es el mayor
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maximo) {
                maximo = notas[i]; // Si encontramos uno mayor, lo actualizamos
            }
        }
        System.out.println("La nota más alta es: " + maximo);
    }

    /*
     * ==========================================================
     * ARRAYS (VECTORES / MATRICES)
     * ==========================================================
     * 1. DEFINICIÓN:
     * Es una estructura de datos estática que almacena elementos
     * del MISMO TIPO en posiciones de memoria contiguas.
     *
     * 2. CARACTERÍSTICAS CLAVE:
     * - TAMAÑO FIJO: Una vez creado, no puede crecer ni encoger.
     * - ÍNDICE: Empiezan siempre en la posición 0.
     * - ACCESO DIRECTO: Puedes ir a cualquier posición al instante (O(1)).
     *
     * 3. DECLARACIÓN E INICIALIZACIÓN:
     * - Vacío: int[] numeros = new int[5]; // Crea 5 huecos (del 0 al 4)
     * - Con datos: String[] nombres = {"Ana", "Luis", "Zoe"};
     *
     * 4. PROPIEDADES Y MÉTODOS:
     * - .length: Atributo que devuelve el tamaño (¡Cuidado! Sin paréntesis).
     * - Arrays.sort(array): Ordena el array (clase de utilidad java.util.Arrays).
     * - Arrays.toString(array): Convierte el array a texto para imprimirlo fácil.
     *
     * 5. ARRAYS BIDIMENSIONALES (Matrices):
     * - Declaración: int[][] matriz = new int[filas][columnas];
     * - Acceso: matriz[0][1] = 10; // Fila 0, Columna 1.
     * ==========================================================
     */
}