package org.example.TEMARIO_CURSO.EXAMEN_UD1;

import java.util.Scanner;

public class RENTA {

    static void main() {

        Scanner read = new Scanner(System.in);

        double importe = 0;


        boolean control = true;
        do {
            try {
                System.out.println("Introduce el importe del resultado de tu declaración");
                importe = read.nextDouble();

                control = false;
            } catch (Exception e) {
                System.out.println("El formato no es numérico");
            }
            read.nextLine();
        } while (control == true);{


            if (importe < 0) {
                System.out.println("Resultado de la declaración: a devolver");
            } else {
                System.out.println("Resultado de la declaración: a pagar");
            }
        }

    }
}

