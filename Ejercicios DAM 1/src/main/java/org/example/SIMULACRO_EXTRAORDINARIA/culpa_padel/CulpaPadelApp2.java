package org.example.SIMULACRO_EXTRAORDINARIA.culpa_padel;

import java.util.Scanner;

public class CulpaPadelApp2 {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        int suma = 0;

        do {

            System.out.println("*** CULPA PÁDEL APP ***");
            System.out.println("Introduce el porcentaje de culpa de los 4 factores externos (compi-pista-pala-pelota)");
            String porcentajes = read.nextLine();

            String[] vector_porcentajes = porcentajes.split("-");

            for (int i = 0; i < vector_porcentajes.length; i++) {
                suma += Integer.parseInt(vector_porcentajes[i]);
            }

            if (suma <= 100){
                break;
            } else {
                System.out.println("ERROR. La suma es mayor a 100.");
            }

        } while(true);

        System.out.println("=================================================================================================");
        System.out.println("Tienes un " + (100 - suma) + "% de culpa.");
    }
}
