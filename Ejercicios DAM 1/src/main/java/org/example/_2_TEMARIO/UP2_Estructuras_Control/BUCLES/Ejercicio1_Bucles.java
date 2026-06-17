package org.example._2_TEMARIO.UP2_Estructuras_Control.BUCLES;

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
