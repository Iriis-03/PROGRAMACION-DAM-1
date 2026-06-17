package org.example._2_TEMARIO.UP2_Estructuras_Control.SWITCH;

import java.util.Scanner;

public class Switch {

    static void main() {

        Scanner read = new Scanner(System.in);

        int numero = 1;
        char caracter = 'A';
        String palabra = "Patricia";

        switch (palabra) {

            case "Raul":
                System.out.println("El alumno es Raúl");
                break;
            case "Patricia":
                System.out.println("La profe es Patricia");
                break;
            default:
                System.out.println("No sé el nombre");
                break;

        }
    }
}
