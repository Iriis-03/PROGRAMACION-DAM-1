package org.example._5_EXAMENES_AÑOS_ANTERIORES.TEMA2;

import java.util.Scanner;

public class Calculo_edad {

    static void main() {

        Scanner read = new Scanner(System.in);

        final int ANYO_ACTUAL = 2025;

        System.out.println("Dame tu año de nacimiento: ");
        int anyo_nacimiento = read.nextInt();

        int anyo = ANYO_ACTUAL - anyo_nacimiento;
        final int ANYO_MIN = 1900;


        if (anyo_nacimiento <= ANYO_MIN){
            System.out.println("ERROR, Introduce un número válido (1900 - 2025)");
            return;
        } else if (anyo_nacimiento > ANYO_ACTUAL) {
            System.out.println("ERROR, Introduce un número válido (1900 - 2025)");
            return;
        }

        for (int i = 0; i <= anyo; i++ ){
            System.out.println( anyo_nacimiento++ + " - " + "edad: " + i);
        }
    }
}
