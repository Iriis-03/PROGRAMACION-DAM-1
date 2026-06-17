package org.example._4_EJERCICIOS;

public class Caracteres4 {

    static void main(String[] args) {


        String texto = "Hola Mundo, bienvenido a MundoMundo es genial.";
        String subcadena = "Mundo";

        int veces = texto.split(subcadena).length - 1;

        System.out.println("Aparece " + veces + " veces");

    }
}
