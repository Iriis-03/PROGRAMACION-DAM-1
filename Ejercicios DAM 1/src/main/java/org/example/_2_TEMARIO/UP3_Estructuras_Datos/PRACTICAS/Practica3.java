package org.example._2_TEMARIO.UP3_Estructuras_Datos.PRACTICAS;

import java.util.Scanner;

public class Practica3 {

    static void main() {

        Scanner read = new Scanner(System.in);

        boolean salir = false;

        System.out.println("*** VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM ***");
        System.out.println("Introduce la resolución de tu pantalla (ancho x alto)...");

        int Ancho = 0;
        int Alto = 0;

        do {
            System.out.println("Ancho:");
            Ancho = read.nextInt();

            if (Ancho % 8 == 0 && Ancho < 48) {
                salir = true;
            } else {
                System.out.println("ERROR. Introduce el ancho correspondiente de tu pantalla");
            }
        } while (!salir);

        salir = false;

        do {
            System.out.println("Alto:");
            Alto = read.nextInt();

            if (Alto % 8 == 0 && Alto < 48) {
                salir = true;
            } else {
                System.out.println("ERROR. Introduce el alto correspondiente de tu pantalla");
            }
        } while (!salir);

        String[][] pantalla= new String[Alto][Ancho/8];

        System.out.println("Introduce (Línea a línea) los colores de tu imagen para cada píxel:");

        String[] lineas = new String[Alto];

        for (int i = 0; i < Alto; i++) {

            salir = false;

            String linea;

            do {
                linea = read.next();

                if (linea.length() == Ancho && linea.matches("[a-oA-O]+")) {
                    salir = true;
                } else {
                    System.out.println("ERROR. Introduce la longitud correspondiente (" + Ancho + ") y caracteres válidos(A-O)");
                }
            } while (!salir);

            for (int j = 0; j < Ancho / 8; j++) {
                int inicio = j * 8;
                int fin = inicio + 8;
                pantalla[i][j] = linea.substring(inicio, fin);
            }
        }

        String linea;
        char character_1 = ' ';
        char character_2 = ' ';
        boolean tresCharacters = false;
        boolean nocompatible = false;


        externo:
        for (int j = 0; j < Ancho/8; j++) {
            int numeroChar=0;
            character_1 = ' ';
            character_2 = ' ';
            doschars:
            for (int i = 0; i < Alto; i++) {
                linea = pantalla[i][j];
                for (int k = 0; k < 8; k++) {
                    char c = linea.charAt(k);
                    if (character_1 == ' ') {
                        numeroChar++;
                        character_1 = c;
                    } else if (character_2 == ' ' && character_1 != c) {
                        numeroChar++;
                        character_2 = c;
                        break doschars;
                    } else if (character_1 != c && character_2 != c) {
                        numeroChar++;
                        tresCharacters = true;
                        break externo;
                    }
                }
            }
            if (numeroChar == 1)
                character_2 = character_1;
            for (int i = 1; i < Alto; i++) {
                linea = pantalla[i][j];
                if (!linea.matches("["+ character_1 + character_2 +"]{" + 8 + "}")) {
                    nocompatible=true;
                    break externo;
                }
            }
        }

        if (tresCharacters || nocompatible){
            System.out.println("No es compatible con un ZX Spectrum");
        }
        else
            System.out.println("Es compatible con un ZX Spectrum");
    }
}