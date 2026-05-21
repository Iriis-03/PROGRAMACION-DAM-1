package org.example.TEMARIO_CURSO.Pruebas_para_practicar;

import java.util.Scanner;

public class Prueba_Ejercicio3_preexamen_TEMA2 {

    static void main() {

        Scanner read = new Scanner(System.in);

        int cuota = 10;

        for (int i = 1; i <= 20; i++){
            System.out.println("Mes " + i + " : " + cuota);
            cuota = cuota * 2;
        }
    }
}
