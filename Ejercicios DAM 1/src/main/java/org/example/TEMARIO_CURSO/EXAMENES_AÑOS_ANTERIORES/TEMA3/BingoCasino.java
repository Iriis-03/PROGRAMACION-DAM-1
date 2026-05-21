package org.example.TEMARIO_CURSO.EXAMENES_AÑOS_ANTERIORES.TEMA3;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class BingoCasino {

    public static void main() {

        Scanner read = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("*** BIENVENIDO AL BINGO DEL CASINO CANTÁBRICO ***");

        // --- Número aleatorio de bolas entre 10 y 40 ---
        int cantidadBolas = aleatorio.nextInt(31) + 10;
        int[] bolasSorteadas = new int[cantidadBolas];

        // --- Generar bolas únicas del 1 al 90 ---
        for (int i = 0; i < cantidadBolas; i++) {
            int numero;
            boolean repetido;
            do {
                numero = aleatorio.nextInt(90) + 1; // usamos aleatorio aquí
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (bolasSorteadas[j] == numero) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
            bolasSorteadas[i] = numero;
        }

        // --- Mostrar bolas sorteadas ---
        System.out.println(cantidadBolas + " bolas extraídas hasta ahora: " + Arrays.toString(bolasSorteadas));

        // --- Pedir cartón 3x3 ---
        System.out.println("\n*** Introduce los datos de tu cartón ***");
        int[][] carton = new int[3][3];
        for (int fila = 0; fila < 3; fila++) {
            System.out.println("Fila " + (fila + 1) + " :"); //(formato N-N-N)
            String linea = read.nextLine();
            if (!linea.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}")) {
                System.out.println("ERROR: Formato incorrecto. El programa se cierra.");
                read.close();
                return;
            }
            String[] numeros = linea.split("-");
            for (int columna = 0; columna < 3; columna++) {
                carton[fila][columna] = Integer.parseInt(numeros[columna]);
            }
        }

        // --- Mostrar cartón ---
        System.out.println("Datos del cartón introducido:");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(carton[fila][columna] + " ");
            }
            System.out.println();
        }

        // --- Pasar cartón a un vector de 9 elementos para simplificar BINGO ---
        int[] cartonVector = new int[9];
        int index = 0;
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                cartonVector[index++] = carton[fila][columna];
            }
        }

        // --- Comprobar BINGO usando solo un bucle ---
        boolean bingo = true;
        String bolasString = Arrays.toString(bolasSorteadas); // convertimos a string para usar contains
        for (int i = 0; i < 9; i++) {
            boolean encontrado = false;
            for (int j = 0; j < cantidadBolas; j++) {
                if (cartonVector[i] == bolasSorteadas[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                bingo = false;
                break;
            }
        }

        System.out.println("*****************************");
        System.out.println("PREMIOS:");
        if (bingo) {
            System.out.println("¡¡BINGO COMPLETO!!");
        } else {
            System.out.println("No hay BINGO.");

            // --- Comprobar LINEA sin bucles internos ---
            for (int fila = 0; fila < 3; fila++) {
                boolean lineaCorrecta = true;
                for (int columna = 0; columna < 3; columna++) {
                    if (!bolasString.contains(String.valueOf(carton[fila][columna]))) {
                        lineaCorrecta = false;
                        break;
                    }
                }
                // --- Usamos if normal en vez de operador ternario ---
                if (lineaCorrecta) {
                    System.out.println("Línea " + (fila + 1) + ": CORRECTA!!");
                } else {
                    System.out.println("Línea " + (fila + 1) + ": NO");
                }
            }
        }
    }
}
