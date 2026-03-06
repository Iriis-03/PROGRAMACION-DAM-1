package org.example.TEMA7.Colecciones;

import java.util.Stack;

public class Ejercicio2Pilas {

    static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();

        pila.push(4);
        pila.push(8);
        pila.push(3);

        while (!pila.isEmpty()){
            System.out.println(pila.pop());
        }


    }
}
