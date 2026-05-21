package org.example.TEMARIO_CURSO.EXAMENES_AÑOS_ANTERIORES.TEMA2;

import java.util.Scanner;

public class CalculadoraPromedio {

     static void main() {
        Scanner read = new Scanner(System.in); // Creamos un objeto Scanner llamado read

        double trimestre1; // Variable de la nota del Trimestre 1
        double trimestre2; // Variable de la nota del Trimestre 2
        double trimestre3; // Variable de la nota del Trimestre 3
        double promedio;   // Variable de la nota media del estudiante


        // Bucle para validar la nota del Trimestre 1
        do {
            System.out.print("Ingrese la nota del Trimestre 1 (0-10): "); // Pedimos la nota al usuario
            trimestre1 = read.nextDouble(); // Leemos la nota ingresada
            if (trimestre1 < 0 || trimestre1 > 10) { // Si la nota no está entre 0 y 10
                System.out.println("Nota inválida. Debe estar entre 0 y 10."); // Mostramos mensaje de error
            }
        }while (trimestre1 < 0 || trimestre1 > 10);

        // Bucle para validar la nota del Trimestre 2
        do {
            System.out.print("Ingrese la nota del Trimestre 2 (0-10): "); // Pedimos la nota al usuario
            trimestre2 = read.nextDouble(); // Leemos la nota ingresada
            if (trimestre2 < 0 || trimestre2 > 10) { // Si la nota no está entre 0 y 10
                System.out.println("Nota inválida. Debe estar entre 0 y 10."); // Mostramos mensaje de error
            }
        } while (trimestre2 < 0 || trimestre2 > 10);

         // Bucle para validar la nota del Trimestre 3
        do  {
            System.out.print("Ingrese la nota del Trimestre 3 (0-10): "); // Pedimos la nota al usuario
            trimestre3 = read.nextDouble(); // Leemos la nota ingresada
            if (trimestre3 < 0 || trimestre3 > 10) { // Si la nota no está entre 0 y 10
                System.out.println("Nota inválida. Debe estar entre 0 y 10."); // Mostramos mensaje de error
            }
        }while (trimestre3 < 0 || trimestre3 > 10);

        promedio = (trimestre1 + trimestre2 + trimestre3) / 3; // Calculamos la nota media

        System.out.println("La nota media del estudiante es: " + promedio); // Mostramos la nota media

        if (promedio >= 5) { // Si la nota media es mayor o igual a 5
            System.out.println("El estudiante ha aprobado."); // Mostramos mensaje de aprobado
        } else { // Si la nota media es menor a 5
            System.out.println("El estudiante ha suspendido."); // Mostramos mensaje de suspendido
        }
    }
}

