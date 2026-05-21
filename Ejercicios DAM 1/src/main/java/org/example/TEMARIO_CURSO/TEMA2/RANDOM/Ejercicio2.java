package org.example.TEMARIO_CURSO.TEMA2.RANDOM;

import java.util.Random;

public class Ejercicio2 {

    static void main() {

        Random aleatorio = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        String contrasenya = "";

        for (int i = 0; i < 12; i++){
            contrasenya += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1));
        }
        System.out.println(contrasenya);
    }
}
