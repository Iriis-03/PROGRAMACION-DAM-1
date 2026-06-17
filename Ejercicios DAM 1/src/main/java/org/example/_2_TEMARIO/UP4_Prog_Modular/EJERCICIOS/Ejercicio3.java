package org.example._2_TEMARIO.UP4_Prog_Modular.EJERCICIOS;

import java.util.Scanner;

public class Ejercicio3 {

    static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = read.nextLine();
        cadena = pasar_mayus(cadena);
        System.out.println(cadena);
        System.out.println("Vocales encontradas: " + contarVocales(cadena));
    }

    public static String pasar_mayus(String cadena){
        cadena = cadena.toUpperCase();
        return cadena;
    }

    public static int contarVocales(String cadena){

        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int j = 0; j < cadena.length(); j++) {

            switch (cadena.charAt(j)){

                case 'A':
                    a++;
                    break;
                case 'E':
                    e++;
                    break;
                case 'I':
                    i++;
                    break;
                case 'O':
                    o++;
                    break;
                case 'U':
                    u++;
                    break;
            }

        }

        System.out.println("A: " + a);
        System.out.println("E: " + e);
        System.out.println("I: " + i);
        System.out.println("O: " + o);
        System.out.println("U: " + u);

        return a + e + i + o + u;
    }
}
