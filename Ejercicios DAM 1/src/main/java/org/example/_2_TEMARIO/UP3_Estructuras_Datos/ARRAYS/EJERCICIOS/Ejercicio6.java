package org.example._2_TEMARIO.UP3_Estructuras_Datos.ARRAYS.EJERCICIOS;

public class Ejercicio6 {

    static void main() {

        int vector [] = {1,4,6,3,9};

        boolean si_no = true;

        for (int i = 0; i < vector.length / 2; i++){

            if (vector[i] != vector [vector.length - 1 - i]){//-1 = última posición
                System.out.println("No es");
                break;
            }
        }
        if (si_no)System.out.println("Es palíndromo");

    }
}
