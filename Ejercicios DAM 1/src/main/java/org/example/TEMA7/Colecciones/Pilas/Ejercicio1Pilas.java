package org.example.TEMA7.Colecciones.Pilas;

import java.util.Stack;

public class Ejercicio1Pilas {

    static void main(String[] args) {

        Stack<Character> pila_letras = new Stack<>();

        pila_letras.push('A');
        pila_letras.push('E');
        pila_letras.push('I');
        pila_letras.push('O');
        pila_letras.push('U');

        if (pila_letras.isEmpty()){
            System.out.println("La pila está vacía");
        } else {
            System.out.println("La pila no está vacía");
        }


        System.out.println("En la pila hay " + pila_letras.size() + " elementos");

        System.out.println("El último elemento de la pilas");


    }
}
