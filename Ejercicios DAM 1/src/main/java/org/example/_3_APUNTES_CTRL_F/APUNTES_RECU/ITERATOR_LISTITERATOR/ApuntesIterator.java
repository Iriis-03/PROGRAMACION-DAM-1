package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.ITERATOR_LISTITERATOR;

import java.util.*;

public class ApuntesIterator {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        // 1. Creamos el iterador
        Iterator<String> it = lista.iterator();

        // 2. Recorremos con un bucle while
        while (it.hasNext()) { // ¿Hay un elemento siguiente?
            String elemento = it.next(); // Salta al siguiente y lo devuelve

            // 3. ÚNICA FORMA SEGURA DE BORRAR EN BUCLE
            if (elemento.equals("B")) {
                it.remove(); // Borra el elemento actual de la lista original
            }
        }
        System.out.println("Lista tras borrar: " + lista);
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