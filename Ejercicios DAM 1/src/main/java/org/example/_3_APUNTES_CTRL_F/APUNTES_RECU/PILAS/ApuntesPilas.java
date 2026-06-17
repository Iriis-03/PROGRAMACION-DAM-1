package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.PILAS;

import java.util.*;

public class ApuntesPilas {
    public static void main(String[] args) {

        // 1. CREACIÓN: Usamos Deque (Double Ended Queue) como una Pila
        Stack<String> pila = new Stack<>();

        // 2. PUSH (Añadir): Metemos elementos "encima"
        pila.push("Plato Sucio 1");
        pila.push("Plato Sucio 2");
        pila.push("Plato Sucio 3");

        // 3. PEEK (Mirar): Vemos cuál es el de arriba SIN quitarlo
        System.out.println("En la cima está: " + pila.peek()); // Imprime Plato 3

        // 4. POP (Quitar): Sacamos el de arriba (el último que entró)
        String quitado = pila.pop();
        System.out.println("He fregado y quitado: " + quitado);

        // 5. RECORRER: Al iterar, se muestran desde el último al primero
        System.out.println("Resto de la pila:");
        for (String plato : pila) {
            System.out.println("- " + plato);
        }

        // 6. IS EMPTY: Comprobar si queda algo
        if (pila.isEmpty()) {
            System.out.println("Pila vacía.");
        }

        // 7. EXTRA DE STACK: Método search (Busca posición desde la cima, base 1)
        int posicion = pila.search("Plato Sucio 1");
        System.out.println("El Plato 1 está en la posición: " + posicion);
    }

    /*
     * ==========================================================
     * ESTRUCTURA DE DATOS: CLASE STACK
     * ==========================================================
     * 1. CONCEPTO: Es una colección que hereda de 'Vector'.
     * Sigue el principio LIFO (Último en entrar, primero en salir).
     * * 2. MÉTODOS ESTÁNDAR:
     * - push(E item): Coloca el objeto en la cima.
     * - pop(): Retira y devuelve el objeto de la cima.
     * - peek(): Mira el objeto de la cima sin retirarlo.
     * - empty(): Comprueba si está vacía (aunque también funciona isEmpty()).
     * * 3. DIFERENCIA EN RECORRIDO:
     * - Al usar un 'for-each' en un Stack, Java lo recorre en orden
     * de INSERCIÓN (desde el primer elemento que entró hasta el último).
     * * 4. USO EN EXAMEN:
     * Si el enunciado pide explícitamente "Stack", esta es la clase.
     * Si pide una estructura LIFO genérica, 'ArrayDeque' es más moderna.
     * ==========================================================
     */
}
