package org.example.APUNTES_RECU.ITERATOR_LISTITERATOR;

import java.util.*;

public class ApuntesListIterator {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(Arrays.asList("Uno", "Dos", "Tres"));

        // Obtenemos el iterador específico de listas
        ListIterator<String> lit = lista.listIterator();

        System.out.println("--- Hacia adelante ---");
        while (lit.hasNext()) {
            System.out.println("Índice " + lit.nextIndex() + ": " + lit.next());
        }

        System.out.println("--- Hacia atrás ---");
        while (lit.hasPrevious()) { // ¿Hay algo antes?
            // Retrocede y devuelve el elemento
            System.out.println("Elemento: " + lit.previous());
        }

        // Bonus: Modificar mientras iteras
        lit.next(); // Nos movemos al primer elemento
        lit.set("MODIFICADO"); // Cambia "Uno" por "MODIFICADO"
    }

    /*
     * ==========================================================
     * ITERADORES EN JAVA
     * ==========================================================
     * 1. ITERATOR (Básico):
     * - Dirección: Solo hacia ADELANTE (unidireccional).
     * - Métodos: hasNext(), next(), remove().
     * - Uso: Para cualquier Colección (List, Set, Map).
     * * 2. LISTITERATOR (Avanzado):
     * - Dirección: ADELANTE y ATRÁS (bidireccional).
     * - Métodos extra: hasPrevious(), previous(), add(), set(), nextIndex().
     * - Uso: SOLO para Listas (ArrayList, LinkedList).
     * * 3. ¿POR QUÉ USARLOS?:
     * - Seguridad: Evitan la 'ConcurrentModificationException'.
     * - Si intentas borrar un elemento con un for-each normal (lista.remove),
     * el programa peta. Con it.remove() NO.
     * * 4. EL CURSOR:
     * El iterador no está "encima" de un elemento, está "entre" ellos.
     * 'next()' salta el elemento y te lo da.
     * ==========================================================
     */
}