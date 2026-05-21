package org.example.TEMARIO_CURSO.TEMA2.SWITCH;

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
