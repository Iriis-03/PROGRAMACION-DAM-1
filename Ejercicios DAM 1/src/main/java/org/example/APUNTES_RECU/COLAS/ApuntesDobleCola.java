package org.example.APUNTES_RECU.COLAS;

import java.util.ArrayDeque;
import java.util.Deque;

public class ApuntesDobleCola {

    public static void main(String[] args) {

        // 1. CREACIÓN: Doble cola
        Deque<String> dobleCola = new ArrayDeque<>();

        // 2. AÑADIR POR AMBOS LADOS
        dobleCola.addFirst("Urgente (Primero)");
        dobleCola.addLast("Normal (Último)");
        dobleCola.addFirst("Súper Urgente (Nuevo Primero)");

        // 3. MIRAR SIN QUITAR
        System.out.println("Primero: " + dobleCola.peekFirst());
        System.out.println("Último: " + dobleCola.peekLast());

        // 4. QUITAR POR AMBOS LADOS
        dobleCola.removeFirst(); // Quita al de delante
        dobleCola.removeLast();  // Quita al de atrás

        System.out.println("Estado final: " + dobleCola);
    }

    /*
     * ==========================================================
     * COLAS (QUEUE) Y DOBLES COLAS (DEQUE)
     * ==========================================================
     * 1. FILOSOFÍA FIFO (Queue):
     * First In, First Out. El primero que entra es el primero que sale.
     * * 2. MÉTODOS DE COLA (Queue):
     * - offer(e): Añade al final (retorna false si falla).
     * - poll(): Retira y devuelve el primero (retorna null si está vacía).
     * - peek(): Mira el primero sin quitarlo.
     * * 3. DOBLE COLA (Deque):
     * - Es una "Cola de dos puntas". Permite métodos 'First' y 'Last'.
     * - addFirst() / addLast()
     * - removeFirst() / removeLast()
     * - peekFirst() / peekLast()
     * * 4. TRUCO DE EXAMEN:
     * - Una Deque puede funcionar como PILA (usando push/pop)
     * o como COLA (usando offer/poll). ¡Es la navaja suiza!
     * ==========================================================
     */
}
