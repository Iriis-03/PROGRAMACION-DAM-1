package org.example.APUNTES_RECU.SETS;
import java.util.HashSet;
import java.util.Set;

public class ApuntesHashSet {
    private Set<String> conjunto = new HashSet<>();

    // 1. MÉTODO PARA HASHSET: El rápido y desordenado
    public void ejecutar() {
        // No garantiza orden. Usa una tabla Hash interna.
        conjunto.add("Zoe");
        conjunto.add("Ana");
        conjunto.add("Luis");
        conjunto.add("Ana"); // Duplicado: No se añade
        System.out.println("HashSet (Sin orden garantizado): " + conjunto);
    }

    /*
     * ==========================================================
     * INTERFAZ SET (CONJUNTOS)
     * ==========================================================
     * * REGLA DE ORO: NO permiten duplicados.
     * * 1. HASHSET:
     * - Rendimiento: El más rápido de todos (O(1)).
     * - Orden: Aleatorio/Nulo. No garantiza nada.
     * - Uso: Cuando solo te importa que no haya repetidos y quieres velocidad.
     * * 2. LINKEDHASHSET:
     * - Rendimiento: Un poco más lento que HashSet.
     * - Orden: Mantiene el orden en el que hiciste los .add().
     * - Uso: Cuando necesitas "memoria" del orden de llegada sin duplicados.
     * * 3. TREESET:
     * - Rendimiento: El más lento (O(log n)).
     * - Orden: Orden natural (A-Z, 1-9).
     * - Uso: Cuando necesitas que los datos estén siempre ordenados.
     * - Importante: Los objetos dentro deben ser 'Comparable'.
     * * * MÉTODO CLAVE: .add() devuelve 'true' si lo añade y 'false' si ya existía.
     * ==========================================================
     */
}