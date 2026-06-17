package org.example._4_EJERCICIOS;

import java.util.Scanner;

public class Matrices3 {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        System.out.println("Hola! Cuántos estudiantes tienes?");
        int estudiantes_totales = read.nextInt();

        System.out.println("Cuántas asignaturas tienen?");
        int asignaturas_totales = read.nextInt();

        String[][] matriz = guardarInformacionMatriz(estudiantes_totales, asignaturas_totales);
        matriz = insertarNotas(matriz, estudiantes_totales, asignaturas_totales);

        for (int i = 0; i < estudiantes_totales + 1; i++) {

            for (int j = 0; j < asignaturas_totales + 1; j++) {
                System.out.print(j + matriz[i][j]);
            }
            System.out.println();
        }



    }

    public static String[][] guardarInformacionMatriz(int estudiantes, int asignaturas){

        int tamanyo_fila = estudiantes + 1;
        int tamanyo_colum = asignaturas + 1;

        String[][] matriz = new String[tamanyo_fila][tamanyo_colum];

        for (int i = 1; i < tamanyo_fila; i++) {
            System.out.println("Introduce el nombre del estudiante " + i);
            String nombre_estudiante = read.next();
            matriz[i][0] = nombre_estudiante;
        }

        read.nextLine();

        for (int j = 1; j < tamanyo_colum; j++) {
            System.out.println("Introduce la asignatura " + j);
            String nombre_asignatura = read.next();
            matriz[0][j] = nombre_asignatura;
        }

        return matriz;
    }
    
    public static String[][] insertarNotas(String[][] matriz, int estudiantes, int asignaturas){

        for (int i = 1; i < estudiantes + 1; i++) {

            for (int j = 1; j < asignaturas + 1; j++) {
                System.out.println("Inserta la nota de " + matriz[i][0] + " para la asignatura de " + matriz[0][j]);
                int nota = read.nextInt();

                matriz[i][j] = Integer.toString(nota);
            }
        }

        return matriz;
        
    }

}
