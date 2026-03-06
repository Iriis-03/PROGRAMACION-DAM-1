package org.example.TEMA7.Colecciones;

import java.util.Stack;

public class ParentesisBalanceados {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {

            String[] signos_entrada = {"({[("};
            String[] signos_salida = {"]}))"};
            String[] mensaje = {"Tengase en cuenta (obviamente) que puede haber otros simbolos."};

            Stack<Character> pila = new Stack<>();


            for (int i = 0; i < signos_entrada.length; i++) {

                //if (signos_entrada.)

            }
            // CÓDIGO PRINCIPAL AQUÍ
            // (incluyendo la lectura del caso de prueba)
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

} // class solution

