package org.example._2_TEMARIO.UP3_Estructuras_Datos.ARRAYS.EJERCICIOS;

import java.util.Scanner;

public class Ejercicio10 {

    static void main() {

        String[] palabras = {"mandarina", "jacobo", "melocotón", "melón"};

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce una letra (inicial)...");

        char letra = read.next().charAt(0);

        for (int i = 0; i < palabras.length; i++){

            if (letra == palabras[i].charAt(0)){
                System.out.println(palabras[i]);
            }
        }
    }
}
