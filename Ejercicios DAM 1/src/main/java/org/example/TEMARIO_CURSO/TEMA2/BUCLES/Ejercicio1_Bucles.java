package org.example.TEMARIO_CURSO.TEMA2.BUCLES;

import java.util.Scanner;

public class Ejercicio1_Bucles {

    static void main() {

        Scanner read = new Scanner(System.in);

        String buena = "admin1234";

        do {
            System.out.println("Introduce tu contraseña: ");
            String contrasenya = read.next();

            if (contrasenya.equals(buena)){
                break;
            }

        } while (true);

        System.out.println("CONTRASEÑA CORRECTA");
    }
}
