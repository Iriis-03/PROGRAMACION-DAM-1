package org.example._3_APUNTES_CTRL_F.APUNTES_RECU.COLLECTION_COLLECTIONS;

import java.util.*;

public class ApuntesCollectionVsCollections {
    public static void main(String[] args) {

        // 1. COLLECTION (La Interfaz)
        // Es la madre de todas las listas, conjuntos y colas.
        Collection<String> miColeccion = new ArrayList<>();
        miColeccion.add("Java");
        miColeccion.add("Python");

        // 2. COLLECTIONS (La Clase de Utilidades)
        // No se pueden crear objetos de ella (new Collections() da error).
        // Se usa para manipular las colecciones que ya tenemos.

        List<Integer> numeros = new ArrayList<>(Arrays.asList(5, 2, 9, 1));

        // Herramienta: Ordenar
        Collections.sort(numeros);

        // Herramienta: Desordenar (Aleatorio)
        Collections.shuffle(numeros);

        // Herramienta: Buscar el máximo y mínimo
        int max = Collections.max(numeros);
        int min = Collections.min(numeros);

        // Herramienta: Invertir el orden
        Collections.reverse(numeros);

        System.out.println("Lista manipulada con Collections: " + numeros);

    }

    /*
     * ==========================================================
     * COLLECTION vs COLLECTIONS
     * ==========================================================
     * * 1. COLLECTION (Singular):
     * - Tipo: INTERFAZ (Interface).
     * - Ubicación: Raíz de la jerarquía (List, Set y Queue heredan de ella).
     * - Uso: Define los métodos básicos que todos deben tener (.add, .remove, .size).
     * - Nota: Map NO hereda de Collection, pero se considera parte del framework.
     * * * 2. COLLECTIONS (Plural):
     * - Tipo: CLASE de utilidad (Utility Class).
     * - Ubicación: Una clase externa con métodos estáticos (static).
     * - Uso: Sirve para operar sobre las colecciones (ordenar, buscar, mezclar).
     * - Métodos famosos:
     * - .sort(lista): Ordena.
     * - .reverse(lista): Invierte.
     * - .shuffle(lista): Mezcla aleatoriamente.
     * - .fill(lista, valor): Llena todo con un mismo valor.
     * - .unmodifiableList(lista): Crea una lista que no se puede tocar.
     * ==========================================================
     */
}
