package org.example.PRUEBAS.PRUEBA_EXAMEN;

import java.util.Scanner;

public class ValidorContrasenyasCajero {

    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        System.out.print("Introduce el código tecleado: ");
        String codigo = read.nextLine();

        if (codigo.matches("^[0-9*]+#$")){

            int suma = 0;

            for (int i = 0; i < codigo.length(); i++) {

                char codigo_char = codigo.charAt(i);

                if (codigo_char <= '9' && codigo_char >= '0') {
                   suma++;
                } else if (codigo_char == '*'){
                    suma--;
                }
            }

            if (suma == 4){
                System.out.println("El código es válido. ");
            } else {
                System.out.println("El código no es válido. ");
            }

        }

    }
}
