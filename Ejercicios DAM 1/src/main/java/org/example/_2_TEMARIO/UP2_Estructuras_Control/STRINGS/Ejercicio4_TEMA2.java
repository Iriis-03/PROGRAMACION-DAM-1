package org.example._2_TEMARIO.UP2_Estructuras_Control.STRINGS;

import java.util.Scanner;

public class Ejercicio4_TEMA2 {

    static void main(){

        Scanner read = new Scanner(System.in);

        String texto = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";

        String palabra = "Mundo";

        int texto_longitud = texto.length();
        int palabra_longitud = palabra.length();

        String frase_sin_palabra = texto.replace(palabra,"");
        int contador = frase_sin_palabra.length();
        int resta = texto_longitud - contador;
        int resultado = resta / palabra_longitud;
        System.out.println(resultado);

    }
}
