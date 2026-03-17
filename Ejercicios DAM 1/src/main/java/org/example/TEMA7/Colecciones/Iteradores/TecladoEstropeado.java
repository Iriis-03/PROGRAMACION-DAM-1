package org.example.TEMA7.Colecciones.Iteradores;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

// Asume fichero llamado solution.java
public class TecladoEstropeado {

    static Scanner read = new Scanner(System.in);

    public static boolean casoDePrueba() {

        if (!read.hasNext())
            return false;
        else {
            ArrayList<Character> lista = new ArrayList<>();
            ListIterator<Character> it = lista.listIterator();

            String frase = read.nextLine();

            for (Character caracter : frase.toCharArray()){

                switch (caracter){
                    case '-':
                        while (it.hasPrevious()){
                            it.previous();
                        }
                        break;
                    case '+':
                        while (it.hasNext()){
                            it.next();
                        }
                        break;
                    case '*':
                        if (it.hasNext()){
                            it.next();
                        }
                        break;
                    case '3':
                        if (it.hasNext()){
                            it.next();
                            it.remove();
                        }
                        break;
                    default:
                        it.add(caracter);
                }
            }

            for (Character caracter : lista){
                System.out.print(caracter);
            }
            // CÓDIGO PRINCIPAL AQUÍ
            // (incluyendo la lectura del caso de prueba)
            System.out.println();
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {

        while (casoDePrueba()) {
        }
    } // main

} // class solution

