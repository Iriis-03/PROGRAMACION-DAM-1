package org.example._2_TEMARIO.UP2_Estructuras_Control.STRINGS;

import java.util.Scanner;

public class Ejercicio3_TEMA2 {

    static void main() {

        Scanner read = new Scanner (System.in);

        System.out.println("Introduce un número...");
        int numero = read.nextInt();

        System.out.println("¿Cuántas cifras quieres eliminar?");
        int quitar = read.nextInt();

        String numero_string = Integer.toString(numero);
        int longitud = numero_string.length();

        int nueva_longitud = longitud - quitar;

        String resultado = numero_string.substring(0,nueva_longitud);
        System.out.println("El resultado es " + resultado);

    }
}
